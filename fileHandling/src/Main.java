import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

public class Main {

    public static final String inputFile = "book.json";

    //load books
    public static List<Book> loadBooks(){
        try(FileReader reader = new FileReader(inputFile)){
            Type listType = new TypeToken<List<Book>>(){}.getType();
            return new Gson().fromJson(reader, listType);
        }catch(IOException e){
            e.getMessage();
            return new ArrayList<>();
        }
    }

    //save book
    public static void saveBook(List<Book> books){
        try(FileWriter writer = new FileWriter(inputFile)){
            new Gson().toJson(books, writer);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    //add a book
    public static void addBook(List<Book> books, Book newBook){
        books.add(newBook);
        saveBook(books);
    }

    // Main method to run the program
    public static void main(String[] args) {
        List<Book> books = loadBooks();

        Book newBook = new Book(3,"Game of Thrones", "Deshan", true);
        addBook(books, newBook);

        List<Book> newBooksList = loadBooks();
        for(Book book: newBooksList){
            System.out.println(book.id);
            System.out.println(book.author);
            System.out.println(book.title);
            System.out.println(book.available);
        }

    }
}
