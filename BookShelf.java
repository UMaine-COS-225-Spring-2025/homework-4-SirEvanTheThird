import java.util.ArrayList;

public class BookShelf {
    public char titleLetter;
    public ArrayList<Book> books;

    public BookShelf(char titleLetter){
        this.titleLetter = titleLetter;
        this.books = new ArrayList<>();
    }

    public char getTitleLetter(){
        return titleLetter;
    }

    
}
