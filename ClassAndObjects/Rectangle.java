class rect{
    double l;
    double b;
    double area(double l, double b){
        return l*b;
    }
    double perimeter(double l, double b){
        return 2*(l+b);
    }
}
public class Rectangle {
    public static void main(String[] args){
        rect r1=new rect();
        rect r2=new rect();
        r1.l=2;
        r1.b=3;
        System.out.println("Area of Rectangle 1 = "+r1.area(r1.l,r1.b));
        System.out.println("Perimeter of Rectangle 1 = "+r1.perimeter(r1.l,r1.b));
        r2.l=5;
        r2.b=9;
        System.out.println("Area of Rectangle 2 = "+r2.area(r2.l,r2.b));
        System.out.println("Perimeter of Rectangle 2 = "+r2.perimeter(r2.l,r2.b));
    }
}
