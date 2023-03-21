class Pen{
    String color;
    String type; // ballpoint; gel
    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }

}

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
        System.out.println("Constructor Called!");
        this.name = name;
        this.age  = age;
    }
}

public class OOPS {
    public static void main(String args[]){
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "Gel";

        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "Ball";

        // pen1.printColor();
        // pen2.printColor();

        Student s1 = new Student("Raghav", 23);
        // s1.name = "Raghav"; // These were Non- Parameterised Constructors 
        // s1.age = 23;
        s1.printInfo();
    }
}
