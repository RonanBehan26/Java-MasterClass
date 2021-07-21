public class Cylinder extends Circle {
//part of ex 35
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);//calls the parent constructor
        if(height < 0){
             height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height*getArea();
    }
}
