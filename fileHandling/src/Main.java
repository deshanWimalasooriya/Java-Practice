@FunctionalInterface
interface Operation{
    double apply(double a, double b);
}

public class Main {

    //Accept a function
    public static double calculate(double a, double b, Operation op){
        return op.apply(a,b);
    }

    //Returns a function
    public static Operation getPowerOperation(){
        return (x,y) -> Math.pow(x,y);
    }

    public static void main(String[] args) {

        Operation addition = (x,y) -> x+y;
        Operation substraction = (x,y) -> x-y;

        System.out.println("Add: " + calculate(10, 5, addition));
        System.out.println("Sub: " + calculate(12, 6, substraction));
        /*
        Adder adition  = (a,b) -> a+b;
        double result = adition.add(10,20);
        out.println(result);

       */
    }
}
