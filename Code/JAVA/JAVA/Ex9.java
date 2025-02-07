import java.util.Scanner;
interface Shape
{
    double getArea();
}
class Rectangle implements Shape
{
    double length;
    double breadth;
    Rectangle(double l,double b)
    {
    length = l;
    breadth = b;
    }
    public double getArea()
    {
        return length * breadth;
    }
}
class Circle implements Shape
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    public double getArea()
    {
      return 22.0/7.0 * radius * radius;
    }
}
class Triangle implements Shape
{
    double base;
    double height;
    Triangle(double b, double h)  
    {
        base = b;
        height = h;
    }
    public double getArea()
    {
        return 0.5 * base * height;
    }
}
class Ex9
{
    public static  void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Length and Breadth of Rectangle :");
        double le=scan.nextInt();
        double br=scan.nextInt();
        Shape rectangle = new Rectangle(le,br);
        System.out.println("Enter Radius of Circle :");
        double rad=scan.nextInt();
        Shape circle= new Circle(rad);
        System.out.println("Enter Base and Height of Triangle :");
        double ba=scan.nextInt();
        double ht=scan.nextInt();
        Shape triangle = (Shape) new Triangle(ba,ht);
        System.out.println("Area of the recangle:"+rectangle.getArea());
        System.out.println("Area of the circle:" + circle.getArea());
        System.out.println("Area of the triangle:" + triangle.getArea());
    }
}                    


    