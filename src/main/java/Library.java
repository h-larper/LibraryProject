import java.util.ArrayList;
import java.util.List;

public class Library{

    private List<Book> books;
    private List<Member> members;

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public String borrowBook(String isbn, String memberId){
        Book selectedBook = null;
        Member selectedMember = null;

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

        if(selectedBook == null){
            return "Book not found";
        }

        if(selectedMember == null){
            return "Member not found";
        }

        if(!selectedBook.isAvailable()){
            return "Book is unavailable";
        }

        if(selectedMember.getBooks().size() >= 5){
            return "Member has reached the loan limit";
        }

        selectedBook.setAvailable(false);
        selectedMember.addBook(selectedBook);

        return "Book successfully borrowed";
    }

}