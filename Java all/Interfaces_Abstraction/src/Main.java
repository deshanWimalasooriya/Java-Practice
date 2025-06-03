
//interface
interface animal{
    void eat();
    void sleep();
}

//abstract
abstract class vehicle{
    abstract void start();

    void makeSound(){
        System.out.println("Broom Broom");
    }
}

//class to implement the interface
class Dog implements animal{
    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }
}

//class to extends the abstract class
class Car extends vehicle {
    public void start(){
        System.out.println("Car started...");
    }
}

public class Main{
    public static void main(String[] args){

        //call functions of the abstract class
        Car myCar = new Car();
        myCar.start();
        myCar.makeSound();

        //call functions of the interface
        animal dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}