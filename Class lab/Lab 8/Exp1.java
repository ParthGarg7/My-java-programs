
public class Exp1 {

    public static void main(String[] args) {
        Library.Book b1 = new Library.Book("Math", "unknown ", "DFGH4567G2K4V");
        b1.displayDetails();
    }
}

class Library {

    static class Book {

        String title;
        String author;
        String ISBN;

        Book(String a, String b, String c) {
            title = a;
            author = b;
            ISBN = c;

        }

        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }
    }

}
