import java.io.*;
import java.util.*;

public class read {
    String filePath;

    // Constructor
    public read(String filePath){
        this.filePath = filePath;
    }

    public void readFile(){
        File inputFile = new File(filePath);
        try(Scanner scan =new Scanner(inputFile)){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }

        }catch(FileNotFoundException e){
            System.out.println("File not found:" + e.getMessage());
        }
    }
}
