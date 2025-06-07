import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        Scanner scan = new Scanner(inputFile);
        List<Double> number = new ArrayList<>();

        PrintWriter writer = new PrintWriter(outputFile);

        double total= 0;

        try(scan){
            while (scan.hasNext()){
                if(scan.hasNextDouble()){
                    double num = scan.nextDouble();
                    number.add(num);
                    total += num;
                }else{
                    scan.next();
                }
            }
        }

        try (writer){
            for(double num: number) {
                writer.printf("%.2f%n", num);
            }
            writer.printf("Total: %.2f%n", total);
        }
    }
}