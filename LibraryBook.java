public class LibraryBook {
    String title;
    String author;
    boolean isAvailable;

    public LibraryBook(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    void bookStatus() {
        if (this.isAvailable) {
        System.out.println(title + " by " + author + " is available right now, you can borrow.");
        } else {
            System.out.println(title + " by " + author + " is not available right now.");
        }
    } 
}