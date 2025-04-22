public class Exp1 {

    // Static nested Book class
    public static class Book {
        private String title;
        private String author;

        // Constructor
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        // Method to display book details
        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("-------------------------");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating Book instances with Indian authors
        Book book1 = new Book("Malgudi Days", "R. K. Narayan");
        Book book2 = new Book("The God of Small Things", "Arundhati Roy");
        Book book3 = new Book("Gitanjali", "Rabindranath Tagore");
        Book book4 = new Book("The Immortals of Meluha", "Amish Tripathi");
        Book book5 = new Book("The Namesake", "Jhumpa Lahiri");

        // Displaying book details
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();
    }
}
