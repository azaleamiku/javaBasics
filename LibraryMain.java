public class LibraryMain {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Encyclopedia", "Miku", true);
        LibraryBook b2 = new LibraryBook("Science", "Jian", false);

        b1.bookStatus();
        b2.bookStatus();
    }

}