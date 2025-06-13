import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

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

    //update book availability
    public static void updateBookAvailability(int id, List<Book> books, boolean availability){
        for(Book book: books){
            if (id == book.id){
                book.available = availability;
                saveBook(books);
            }
        }
    }


    // Main method to run the program
    public static void main(String[] args) throws IOException {
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

        updateBookAvailability(3, books, true);

        for(Book book: books){
            if(book.id ==3){
                if(book.available = true){
                    System.out.println("The book " + book.title + " is available");
                }else{
                    System.out.println("The book " + book.title + " is not available");
                }
            }
        }

        try (FileWriter newWriter = new FileWriter("output.json")){
            List<Book> newBooks = loadBooks();
            new Gson().toJson(newBooks, newWriter);
        }
    }
}
