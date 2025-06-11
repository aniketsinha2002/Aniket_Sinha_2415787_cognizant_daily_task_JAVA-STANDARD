import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;
    boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    void showDetails() {
        System.out.println(title + " by " + author + " - " +
                (available ? "Available" : "Checked Out"));
    }
}

class Member {
    String name;
    List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    void borrowBook(Book book) {
        if (book.available) {
            borrowedBooks.add(book);
            book.available = false;
            System.out.println(name + " borrowed " + book.title);
        } else {
            System.out.println(book.title + " is not available.");
        }
    }

    void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.available = true;
            System.out.println(name + " returned " + book.title);
        } else {
            System.out.println(name + " didn't borrow this book.");
        }
    }
}

class Library {
    List<Book> books = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added: " + title);
    }

    void addMember(String name) {
        members.add(new Member(name));
        System.out.println("Member registered: " + name);
    }

    void showBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            book.showDetails();
        }
    }

    void showMembers() {
        System.out.println("\nRegistered Members:");
        for (Member member : members) {
            System.out.println(member.name);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Inferno", "Dan Brown");
        library.addBook("The Power of Habit", "Charles Duhigg");

        library.addMember("Rohan");
        library.addMember("Neha");

        Book book1 = library.books.get(0);
        Book book2 = library.books.get(1);
        Member member1 = library.members.get(0);
        Member member2 = library.members.get(1);

        member1.borrowBook(book1);
        member2.borrowBook(book2);
        member1.borrowBook(book2);
        member1.returnBook(book1);

        library.showBooks();
        library.showMembers();
    }
}
