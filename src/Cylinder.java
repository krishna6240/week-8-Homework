public class Cylinder extends Circle{

    double height;
    public Cylinder(double radius,double height){
       this(radius);
       this.height = height;


    }

    public Cylinder(double radius) {
        super(radius);
    }
public double getHeight(){
        return this.height;

}
public double getVolume() {
    return super.getArea() * height;


}
}

