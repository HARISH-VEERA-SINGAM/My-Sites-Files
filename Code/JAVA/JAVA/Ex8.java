import java.util.Scanner;
class Shape
{
    double getPerimeter()
    {
        return 0.0;
    }
    double getArea()
    {
        return 0.0;
    }
}
class Circle extends Shape
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    // Override getPerimeter() to calculate the perimeter of the circle
    double getPerimeter()
    {
        return 2 * 22.0/7.0 * radius;
    }
    // Override getArea() to calculate the area of the circle
    double getArea()
    {
        return 22.0/7.0 * radius * radius;
    }
}
class Ex8
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Radius of circle :");
        double rad=scan.nextFloat();
        Circle circle = new Circle(rad);
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
    }
}