//                 _________________________________________________
//                |                      Cirlce                     |
//                |_________________________________________________|
//                | - radius: double                                |
//                | - color: String                                 |
//                |_________________________________________________|
//                | + Circle(radius: String, color: String)         |
//                | + getRadius(): double                           |
//                | + setRadius(radius: double)                     |
//                | + getColor() : String                           |
//                | + setColor(Color: String)                       |
//                | + getArea : double                              |
//                | + toString: String                              |
//                |_________________________________________________|
package rikkei.academy;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return
                "radius: " + radius +
                        ", color: " + color + '\'' + ", " +
                        "Circle: " + getArea()
                ;
    }

}
