import java.util.ArrayList;
import java.util.List;

/**
 * Manages a collection of books and members and handles book borrowing rules.
 */
public class Library{

    private List<Book> books;
    private List<Member> members;

    /**
     * Creates an empty library with no registered books or members.
     */
    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    /**
     * Adds a book to the library catalogue.
     *
     * @param book the book instance to add
     */
    public void addBook(Book book){
        books.add(book);
    }

    /**
     * Registers a member with the library.
     *
     * @param member the member instance to add
     */
    public void addMember(Member member){
        members.add(member);
    }

    /**
     * Attempts to borrow a book for a member using their identifiers.
     * Checks book existence, member existence, availability, and the 5-book limit in sequence.
     *
     * @param isbn     the ISBN of the book to borrow
     * @param memberId the ID of the member borrowing the book
     * @return a status message describing the outcome of the borrow attempt
     */
    public String borrowBook(String isbn, String memberId){
        Book selectedBook = null;
        Member selectedMember = null;

        // Inline comment: clarifies the lookup step before validation checks
        for(Book book : books){
            if(book.getIsbn().equals(isbn)){
                selectedBook = book;
            }
        }

        for(Member member : members){
            if(member.getMemberId().equals(memberId)){
                selectedMember = member;
            }
        }

        // Checks whether the book and member were found before proceeding to availability and limit checks
        if(selectedBook == null){
            return "Book not found";
        }

        if(selectedMember == null){
            return "Member not found";
        }

        if(!selectedBook.isAvailable()){
            return "Book is unavailable";
        }

        // Documents the business rule of a maximum of 5 borrowed books for a member
        if(!selectedMember.canBorrowBook()){
            return "Member has reached the loan limit";
        }

        selectedBook.markAsBorrowed();
        selectedMember.addBook(selectedBook);

        return "Book successfully borrowed";
    }

}