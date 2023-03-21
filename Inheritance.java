class Shape{ // Base Class (Parent Class)
    String color;
    public void Area(){
        System.out.println("Displays Area");
    }
}

class Triangle extends Shape{ // Subclass (Child Class)
    public void Area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void Area(int l, int h){
        System.out.println(1/2* l * h);
    }
}

class Circle extends Shape{
    public void Area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {
    public static void main(String args[]){
        Triangle T1 = new Triangle();
        T1.color = "red";
    }
}
