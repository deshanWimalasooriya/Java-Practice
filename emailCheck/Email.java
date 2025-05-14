
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email{
    public static void main(String args[]){

        String text = "hi i'm deshan wimamlasooriya, deshan@gmail.com, and my friend is dilanka, dilanka123@gmail.com";
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());;
        }
    }
}
