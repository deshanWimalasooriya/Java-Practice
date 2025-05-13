
import java.io.*;
public class write {

    String line;
    String fileName;
    //constructor
    public write(String name, String line){
        this.line = line;
        this.fileName = name;
    }

    public void writeFile() throws IOException {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));
            //write
            writer.println(line);
            writer.close(); // Always close the writer
            System.out.println("File written successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while writing the file");
            e.printStackTrace();
        }
    }
}
