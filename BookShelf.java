import java.util.ArrayList;

public class BookShelf {
    public char shelfLetter;
    public ArrayList<Book> books;

    public BookShelf(char shelfLetter){
        this.shelfLetter = shelfLetter;
        this.books = new ArrayList<>();
    }

    public char getshelfLetter(){
        return shelfLetter;
    }

    public void addBook(Book book) {
        //max of 8 books in shelf, also check if title[0] is shelfLetter
        if (books.size() < 8 && book.title.charAt(0) == shelfLetter) {
            books.add(book);
        }
    }
    
    public void removeBook(String title){
        //loop through the books to find title match and remove book at that index
        for (int i = 0; i< books.size(); i++){
            if(books.get(i).title.equals(title)){
                books.remove(i);
                return; //exit after first removeal, so if removing multiple of same name
                //then do it multiple times
            }
        }
    }
    public String toString(){
        if(books.isEmpty()){
            return "Empty";
        }

        String result = "";
        for(Book book: books) {
            result += book.toString() + "   "; //three spaces between
        }
        return result.trim(); //remove extra spaces at the end
    }
}
