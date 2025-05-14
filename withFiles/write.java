
import java.io.FileWriter;
import java.io.PrintWriter;

public class write{
    String fileName, Content;

    public write(String fileName, String Content){
        this.fileName = fileName;
        this.Content = Content;
    }
    public void wFile() throws Exception{
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(Content);
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
