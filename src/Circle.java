public class Circle {
    double radius;

    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        } else {
            this.radius = radius;
        }

    }

    public Circle() {

    }


    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
}

