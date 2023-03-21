abstract class Animal{ // Its an error / Concept
    abstract void Walk();
}
class Horse extends Animal{
    public void Walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void Walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.Walk();
        
    }
}
