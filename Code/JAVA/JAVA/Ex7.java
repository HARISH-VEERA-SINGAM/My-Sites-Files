import java.util.Scanner;
class Area
{
double findArea(double length,double breadth)
{
return length * breadth;
}
public double findArea(double base,double height, boolean isTrangle)
{
return 0.5 * base * height;
}
public double findArea(double side)
{
return side * side;
} 
}
class Ex7 
{
public static void main(string args[])
{
Scanner scan=new Scanner(System.in);
Area c = new Area();
double le,br,rect,ba,ht,tri,s,square;
System.out.println("Enter Length and Breadth of Rectangle :");
le=scan.nextInt();
br=scan.nextInt();
rect = c.findArea(le, br);
System.out.println("Enter Base and Height of Triangle :");
ba=scan.nextInt();
ht=scan.nextInt();
tri = c.findArea(ba, ht, true);
System.out.println("Enter Side of Square :");
s=scan.nextInt();
square = c.findArea(s);
System.out.println("Area of the rectangle: " + rect);
System.out.println("Area of the triangle: " + tri);
System.out.println("Area of the square:" + square);
}
}