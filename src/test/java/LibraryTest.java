import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class LibraryTest{

    @Test
    public void borrowBook_availableBookAndValidMember_succeeds(){
        Library library = new Library();
        Book book = new Book("Fourth Wing", "Rebecca Yarros", "123");
        Member member = new Member("Laura", "1");
        library.addBook(book);
        library.addMember(member);

        String result = library.borrowBook("123", "1");

        assertEquals("Book successfully borrowed", result);
        assertFalse(book.isAvailable());
        assertEquals(1, member.getBooks().size());
    }

    @Test
    public void borrowBook_unknownIsbn_returnsBookNotFound(){
        Library library = new Library();
        Member member = new Member("Andrianna", "2");
        library.addMember(member);

        assertEquals("Book not found", library.borrowBook("999", "2"));
    }

}