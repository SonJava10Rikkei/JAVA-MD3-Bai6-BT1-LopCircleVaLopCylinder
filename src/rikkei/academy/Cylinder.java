//                 _________________________________________________
//                |                     Cylinder                    |
//                |_________________________________________________|
//                | - height: double                                |
//                |_________________________________________________|
//                | + Cylinder(radius: String, color: String, height)        |
//                | + getHeight():double                            |
//                | + setHeight(height: double)                     |
//                | + getVolume() : double                          |
//                |_________________________________________________|

package rikkei.academy;

public class Cylinder extends Circle {
    private double height, volume;

    public Cylinder() {

    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calVolume() {
        this.volume = super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return
                "height: " + height + ", " +
                        "Cylinder: " + volume
                ;
    }

}
