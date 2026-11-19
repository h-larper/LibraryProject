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
     * Sets whether the book is available to borrow.
     *
     * @param available {@code true} if the book is available, otherwise {@code false}
     */
    public void setAvailable(boolean available){
        this.available = available;
    }
}