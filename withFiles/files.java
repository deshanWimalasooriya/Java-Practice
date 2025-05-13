import java.io.*;
public class files{
    public static void main(String args[]) throws IOException {

        String filePath = "C:\\Work\\GitHub\\Java-Practice\\withFiles\\letter.txt";

        //Create an object
        read Rfile = new read(filePath);
        //Call
        Rfile.readFile();

        //Create an object
        write Wfile = new write("file.txt", "Hello deshan");
        //Call
        Wfile.writeFile();
    }
}