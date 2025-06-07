import javax.swing.text.Document;
import java.io.*;
import java.Jsoup

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File input = new File("web.html");

        Document document = Jsoup


        /*

        //Task 1(Find the word "Java" in a string.)

        String input = "I love Java programming";
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.find());


        //Task 2 (2. 🔢 Match Digits)
        String input  = "Order 23, Item 45, Qty 10";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        //Task 3. 🎯 Match Specific Word
        String input = "My cat is playing with a dog";
        Pattern pattern = Pattern.compile("cat|dog");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        //Task 4. 💬 Match All Words
        String input = "Java is awesome!";
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        //Task Replace all space with hypen
        String input = "My name is     Deshan  Wimalaooriya";
        String updated = input.replaceAll("\\s+", " ");
        System.out.println(input);
        System.out.println(updated);

        //Task for split
        String num = "i am deshan wimalasooriya";
        String[] words = num.split(" ");

        for (String word: words){
            System.out.println(word);
        }


        String fileName = "web.html";
        FileReader newFile = new FileReader(fileName);

        BufferedReader reader = new BufferedReader(newFile);

        try(reader){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        */
    }
}

/*
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
            for(double num: number) {writer.printf("%.2f%n", num);}
            writer.printf("Total: %.2f%n", total);
        }
 */