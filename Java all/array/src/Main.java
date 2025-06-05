import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int nuOfStudent = scan.nextInt();
        scan.nextLine();
        String[] Names = new String[nuOfStudent];
        double[][] Marks = new double[nuOfStudent][3];

        for (int i=0; i<nuOfStudent; i++){
            int k = i+1;
            System.out.print("Enter name of students " + k + ": ");
            Names[i] = scan.nextLine();

            System.out.print("Enter 3 marks: ");
            String marks = scan.nextLine();

            String[] mark = marks.split(" ");

            for(int j=0; j<3; j++){
                Marks[i][j] = Double.parseDouble(mark[j]);
            }
        }

        double[] average = new double[nuOfStudent];
        //Calculate the Average maks of each student
        for (int i=0; i<nuOfStudent; i++){
            double total= 0;
            for(int j=0; j<3; j++){
                total+=Marks[i][j];
            }

            average[i] = total/3;
            System.out.println("Student " + Names[i] + " - Average: " + average[i]);
        }
        double TopScore = 0;
        int k=0;
        for(int i=0; i<nuOfStudent; i++){
            if(TopScore<average[i]){
                TopScore+=average[i];
                k=i;
            }
        }
        System.out.println("Top Scorer: "+ Names[k]);
        scan.close();
    }
}