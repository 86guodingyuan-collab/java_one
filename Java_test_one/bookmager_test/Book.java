package bookmager_test;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;
    private String borrowerName;

    public Book(String title, String author, boolean isBorrowed, String borrowerName)
    {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
        this.borrowerName = borrowerName;
    }
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String  getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}

    public boolean isBorrowed() {return isBorrowed;}
    public void isBorrowed(boolean isBorrowed) {this.isBorrowed = isBorrowed;}
    
    public String getBorrowerName() {return borrowerName;}
    public void setBorrowerName(String borrowerName) {this.borrowerName = borrowerName;}

    @Override
    public String toString() {
        return "Book{title='"
        + title + "',author="
        + author + "',isBorrowed="
        + isBorrowed + "',borrowerName="
        + borrowerName + "'}";
    }
}
