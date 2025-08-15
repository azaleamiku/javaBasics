public class BookClass {
    String title;
    String author;

    public BookClass(String title, String author) {
        this.title = title;
        this.author = author;
    } 

    void bookShelf() {
        System.out.println("Shelf: " + title + " by " + author);
    }      
}
