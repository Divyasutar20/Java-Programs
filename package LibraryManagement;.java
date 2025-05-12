package LibraryManagement;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void display() {
        System.out.println("Book: " + title + " by " + author + " (ISBN: " + ISBN + ")");
    }
}

class Member {
    String name;
    int memberId;

    Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    void display() {
        System.out.println("Member: " + name + " (ID: " + memberId + ")");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Member member = new Member("Rahul", 101);

        book.display();
        member.display();
    }
}
