package bookmager_test;

public class MainTest {
    public static void main(String[] args) {
        BookManager bm = new BookManager();
        bm.addBook(new Book("二十四史", "司马迁", false, null));
        bm.addBook(new Book("史记", "司马迁", false, null));
        bm.addBook(new Book("报任安书", "司马迁", false, null));
        bm.addBook(new Book("红楼梦", "曹雪芹", false, null));
        bm.addBook(new Book("西游记", "吴承恩", false, null));
        bm.addBook(new Book("三国演义", "罗贯中", false, null));
        bm.addBook(new Book("水浒传", "施耐庵", false, null));

        bm.printlnAllBooks();

        System.out.println("\n-----删除《三国演义》-----");
        bm.deleteBookByTitle("三国演义");
        System.out.println("-----删除后的书籍列表-----");
        bm.printlnAllBooks();
        System.out.println("\n-----删除作者名为: 司马迁 的所有书籍-----");
        bm.deleteBookByAuthor("司马迁");
        System.out.println("-----删除后的书籍列表-----");
        bm.printlnAllBooks();
        
        System.out.println("\n----- 张三 借阅《红楼梦》-----");
        bm.borrowBook("红楼梦", "张三");

        System.out.println("\n----- 李四 借阅《西游记》-----");
        bm.borrowBook("西游记", "李四");

        System.out.println("\n-----书籍列表-----");
        bm.printlnAllBooks();
        System.out.println("\n-----张三 归还《红楼梦》-----");
        bm.returnBook("红楼梦");
        System.out.println("\n-----书籍列表-----");
        bm.printlnAllBooks();
        System.out.println("\n-----王五 再次尝试借阅《西游记》-----");
        bm.borrowBook("西游记", "王五");
        bm.printlnAllBooks();
        bm.returnBook("水浒传");

    }
}
