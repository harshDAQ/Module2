import java.util.ArrayList;

class Library {
    // Inner class Book
    class Book {
        private String title;
        private String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void displayBookInfo() {
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }

    ArrayList<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(String title, String author) {
        Book newBook = new Book(title, author);
        books.add(newBook);
    }

    void displayBooks() {
        for (Book i : books) {
            i.displayBookInfo();
        }
    }
}

public class Q29 {
    public static void main(String[] args) {
        // Create a Library object
        Library myLibrary = new Library();

        // Add books to the library
        myLibrary.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        myLibrary.addBook("1984", "George Orwell");
        myLibrary.addBook("To Kill a Mockingbird", "Harper Lee");

        // Display all books in the library
        System.out.println("Books in the library:");
        myLibrary.displayBooks();
    }
}