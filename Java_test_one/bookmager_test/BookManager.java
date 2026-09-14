package bookmager_test;
import java.util.*;
import collectiondemo.*;
public class BookManager {
    private List<Book> bookList = new ArrayList<>();

    // 添加书籍到列表中
    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("成功添加书籍: "
            + book.getTitle() + ", 作者: " + book.getAuthor()
        );
    }

    // 打印所有书籍
    public void printlnAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("当前没有书籍");
        }
        else {
            System.out.println("-----书籍列表开始-----");
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
        System.out.println("-----书籍列表结束, 共" + bookList.size() + "本书-----");
    }

    // 根据书名删除书籍(迭代器删除)
    public void deleteBookByTitle(String title) {
        Iterator<Book> it = bookList.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.getTitle().equals(title)) {
                it.remove();
                System.out.println("成功删除书籍: " + title);
                return;
            }
        }
        System.out.println("没有找到名为: " + title + " 的书籍, 删除失败!");
    }

    // 根据作者删除书籍
    public void deleteBookByAuthor(String author) {
        int count = 0;
        Iterator<Book> it = bookList.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.getAuthor().equals(author)) {
                it.remove();
                count++;
            }
        }
        if (count > 0) {
            System.out.println("成功删除作者为: " + author + " 的书籍, 共" + count + "本书");
        }
        else {
            System.out.println("没有找到作者名为: " + author + " 的书籍, 删除失败!");
        }
    }

    // 借阅书籍
    public void borrowBook(String title, String borrowerName) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                if (book.isBorrowed()) {
                    System.out.println("书籍已被 \"" + book.getBorrowerName() +"\" 借出, 无法再次借阅!");
                    return;
                }
                else {
                    book.isBorrowed(true);
                    book.setBorrowerName(borrowerName);
                    System.out.println("成功借出书籍: " + title + " , 借阅人: " + borrowerName);
                    return;
                }
                
            }
        }
        System.out.println("没有找到名为: " + title + " 的书籍, 借阅失败!");
    }

    // 归还书籍
    public void returnBook(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                if (!book.isBorrowed()) {
                    System.out.println("书籍未被借出, 无法归还!");
                    return;
                }
                else {
                    String borrowerName = book.getBorrowerName();
                    book.isBorrowed(false);
                    book.setBorrowerName(null);
                    System.out.println("成功归还书籍: " + title + " , 归还人: " + borrowerName);
                    return;
                }
                
            }
        }
        System.out.println("没有找到名为: " + title + " 的书籍, 归还失败!");
    }
}
