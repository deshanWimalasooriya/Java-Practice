import javax.lang.model.element.Element;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/*
public class Main {
    public static void main(String[] args){
        //lambda expression
        /*
        List<String> names = new ArrayList<>();
        names.add("Deshan");
        names.add("Dilanka");
        names.add("Chamara");

        System.out.println(names);

        names.forEach(name-> System.out.println("hello, " + name +"!" ));
         */
        
        /*
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        int sumOfSquars = numbers.stream()
                .filter(x-> x%2==0)
                .map(x-> x*x)
                .reduce(0, Integer::sum);

        System.out.println(sumOfSquars);

         */

        //Declarative Programming Examples
        //Example 1
        /*
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum(); System.out.println(result);

         */

        //Example 2
        /*
        List<String> names = List.of("Deshan","Chamara", "Sithum", "Dilanka");

        List<String> result = names.stream()
                .filter(name-> name.startsWith("D"))
                .collect(Collectors.toList());

        for(String element: result){
            System.out.printf(element);
        }

         */

        //Example 3
        /*
        List<Integer> numbers = List.of(1,7,5,63,9,4,7,8,9,10);

        List<Integer> results = numbers.stream()
                .map(n-> n*10)
                .collect(Collectors.toList());

        for(Integer number: results){
            System.out.println(number);
        }

         */

        //Example 4
        /*
        List<String> names = List.of("hi", "elephant", "sun", "banana");
        Optional<String> first = names.stream()
                .filter(word-> word.length() > 5)
                .findFirst();

        System.out.println(first);

    }
}*/


import javax.swing.text.Document;
import java.io.*;
import java.lang.reflect.Type;
import java.sql.SQLOutput;
import java.util.List;
import javax.swing.text.Document;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;

public class Main {

    public static void main(String[] args) throws IOException {

        //read html file
        /*
        try{
            File file = new File("web.html");
            org.jsoup.nodes.Document doc = Jsoup.parse(file, "UTF-8");
            System.out.println("Title: " + doc.title());

            for(Element p: doc.select("p")){
                System.out.println("-" + p.text());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
         */

        //read json file
        String fileName = "data.json";
        Gson gson = new Gson();
        FileReader reader = new FileReader(fileName);

        try(reader){

            // Define the type of the list
            Type userListType = new TypeToken<List<Person>>(){}.getType();

            // Deserialize JSON into List<User>
            List<Person> users = gson.fromJson(reader, userListType);

            // Print each user
            for (Person user : users) {
                if (user.getId() == 3) {
                    System.out.println("ID: " + user.getId());
                    System.out.println("Name: " + user.getName());
                    System.out.println("Email: " + user.getEmail());
                    System.out.println("Age: " + user.getAge());
                    System.out.println("Is Student: " + user.isStudent());
                    System.out.println("-----------------------");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Task 1(Find the word "Java" in a string.)
        /*
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