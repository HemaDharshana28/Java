class circleData{
    double radius;
    double area(double  radius){
        return Math.PI*radius*radius;
    }
    double circ(double radius){
        return 2*Math.PI*radius;
    }
}
public class Circle {
    public static void main(String[] args){
        circleData c1=new circleData();
        circleData c2=new circleData();
        circleData c3=new circleData();
        c1.radius=4.5;
        c2.radius=8;
        c3.radius=5.6;
        System.out.println("Area of circle 1:" + c1.area(c1.radius));
        System.out.println("Circumference of circle 1:" + c1.circ(c1.radius));
        System.out.println("Area of circle 2:" + c2.area(c2.radius));
        System.out.println("Circumference of circle 2:" + c2.circ(c2.radius));
        System.out.println("Area of circle 3:" + c3.area(c3.radius));
        System.out.println("Circumference of circle 3:" + c3.circ(c3.radius));
    }
}
