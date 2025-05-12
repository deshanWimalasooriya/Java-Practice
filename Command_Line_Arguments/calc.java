class calc{
    public static void main(String args[]){
        float n1 = Float.parseFloat(args[0]);
        float n2 = Float.parseFloat(args[1]);
        char operator = args[2].charAt(0);

        switch (operator){
            case '+' -> System.out.println("Answer: " + (n1 + n2));
            case '-' -> System.out.println("Answer: " + (n1 - n2));
            case 'x' -> System.out.println("Answer: " + (n1 * n2));
            case '/' -> System.out.println("Answer: " + (n1 / n2));
            default -> System.out.println("Invalid");
        }
    }
}