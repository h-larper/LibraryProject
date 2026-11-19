import java.util.ArrayList;
import java.util.List;

public class Member{

    private String name;
    private String memberId;
    private List<Book> books;

    public Member(String name, String memberId){
        this.name = name;
        this.memberId = memberId;
        this.books = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getMemberId(){
        return memberId;
    }

    public List<Book> getBooks(){
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

}