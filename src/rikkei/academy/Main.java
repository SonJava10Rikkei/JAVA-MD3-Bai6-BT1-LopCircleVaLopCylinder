package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.4, "red");
        Cylinder cylinder = new Cylinder(3.1, "blue", 12);
        System.out.println(circle);
        cylinder.calVolume();
        System.out.println(cylinder);
    }
}
