import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library member and tracks the books they have on loan.
 */
public class Member{

    private static final int MAXIMUM_BOOK_LOANS = 5;

    private String name;
    private String memberId;
    private final List<Book> borrowedBooks;

    /**
     * Creates a new member with an empty list of borrowed books.
     *
     * @param name     the member's name
     * @param memberId the unique identifier for the member
     */
    public Member(String name, String memberId){
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    /**
     * @return the member's name
     */
    public String getName(){
        return name;
    }

    /**
     * @return the member's unique ID
     */
    public String getMemberId(){
        return memberId;
    }

    /**
     * @return the list of books currently borrowed by the member
     */
    public List<Book> getBorrowedBooks(){
        return new ArrayList<>(borrowedBooks);
    }

    /**
     * Adds a book to the list of books borrowed by the member.
     *
     * @param book the book to add
     */
    public void addBook(Book book){
        borrowedBooks.add(book);
    }

    /**
     * Removes a book from the list of books borrowed by the member.
     *
     * @param book the book to remove
     */
    public void removeBook(Book book){
        borrowedBooks.remove(book);
    }

    /**
     * @return a boolean value indicating whether the member can borrow additional books
     */
    public boolean canBorrowBook(){
        return borrowedBooks.size() < MAXIMUM_BOOK_LOANS;
    }

}