import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class files{
    public static void main(String args[]) throws Exception{
        File inputFile = new File("file.txt");
        File readFile = new File("input.txt");

        try(Scanner scan = new Scanner(inputFile)){

            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        //Calculating
        try (Scanner scan = new Scanner(readFile)) {
            double sum = 0;
            while(scan.hasNextDouble()){
                double num = scan.nextDouble();
                write w = new write("file.txt", "-> " +  String.valueOf(num));
                w.wFile();
                sum += num;
            }

            write sumWrite = new write("file.txt", "Total: " + String.valueOf(sum));
            sumWrite.wFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}