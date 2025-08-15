public class BookMain {
    public static void main(String[] args) {
        BookClass b1 = new BookClass("Pluma", "Elzen");
        BookClass b2 = new BookClass("Science", "Einstein");

        b1.bookShelf();
        b2.bookShelf();
    }
}