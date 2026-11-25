/**
 * Represents a book in the library catalogue and its availability status.
 */
public class Book{

    private String title;
    private String author;
    private String isbn;
    private boolean available;

    /**
     * Creates a book entry.
     *
     * @param title     the book title
     * @param author    the book author
     * @param isbn      the book ISBN
     */
    public Book(String title, String author, String isbn){

        if(title == null || title.isEmpty()){
            throw new IllegalArgumentException("Title must not be blank.");
        }

        if(author == null || author.isEmpty()){
            throw new IllegalArgumentException("Author must not be blank.");
        }

        if(isbn == null || isbn.isEmpty()){
            throw new IllegalArgumentException("ISBN must not be blank.");
        }

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    /**
     * Gets the book title.
     *
     * @return the book title
     */
    public String getTitle(){
        return title;
    }

    /**
     * Gets the book author.
     *
     * @return the book author
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Gets the book ISBN.
     *
     * @return the book ISBN
     */
    public String getIsbn(){
        return isbn;
    }

    /**
     * Checks whether the book is available to borrow.
     *
     * @return {@code true} if the book is available, otherwise {@code false}
     */
    public boolean isAvailable(){
        return available;
    }

    /**
     * Marks the book as borrowed and therefore unavailable for loan.
     */
    public void markAsBorrowed(){
        this.available = false;
    }

    /**
     * Marks the book as returned and therefore available for loan.
     */
    public void markAsReturned(){
        this.available = true;
    }
}