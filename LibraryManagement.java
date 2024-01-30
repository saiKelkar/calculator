import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Book book1 = new Book("To kill a Mocking bird", "Harper Lee", "1");
        Book book2 = new Book("1984", "George Orwell", "2");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "3");
        Book book4 = new Book("The Hobbit", "J.R.R. Tolkien", "4");
        

        List<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        availableBooks.add(book3);
        availableBooks.add(book4);

        System.out.println("Library Management System Menu: ");
        System.out.println("1. Display Available Books");
        System.out.println("2. Borrow a Book");
        System.out.println("3. Return a Book");
        System.out.println("4. Exit");
        
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();

        
        switch(choice) {
            case "1":
                Library.displayBooks(availableBooks);
                break;
            case "2":
                Library.borrowBooks(availableBooks);
                break;
            case "3":
                Library.returnBooks(availableBooks);
                break;
            case "4":
                Library.exit();
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid choice.");
        }
    }
}

class Book {
    private String title;
    private String author;
    private String bookID;
    
    public Book(String title, String author, String bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getBookID() {
        return bookID;
    }
}

class Library {
    public static void displayBooks(List<Book> availableBooks) {
        System.out.println("List of books available: ");
        for(Book book : availableBooks) {
            System.out.println("BookID: " + book.getBookID() + 
                                ", Title: " + book.getTitle() +
                                ", Author: " + book.getAuthor());
        }
    }

    public static void borrowBooks(List<Book> availableBooks) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a book ID you want to borrow: ");
        String borrowID = scanner.nextLine();

        // Following is the lamda expression
        // if Book.getBookID = borrowID, then remove the book present at that ID
        availableBooks.removeIf(Book -> Book.getBookID().equals(borrowID));
        System.out.println("Book borrowed successfully!");
        displayBooks(availableBooks);
    }

    public static void returnBooks(List<Book> availableBooks) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a book ID you want to return: ");
        String returnID = scanner.nextLine();

        // Converts the array of availableBooks into a stream that is filtered
        // if getBookID = returnID, then the first element in the stream that equals returnID is retrieved, otherwise null is returned
        Book returnedBook = availableBooks.stream() 
            .filter(Book -> Book.getBookID().equals(returnID))
            .findFirst()
            .orElse(null);

        if(returnedBook != null) {
            availableBooks.add(returnedBook);
            System.out.println("Book returned succesfully!");
            displayBooks(availableBooks);
        }
        else {
            System.out.println("Book not found in the Library!");
        }   
    }

    public static void exit() {
        System.out.print("Exited the system!");
    }
}