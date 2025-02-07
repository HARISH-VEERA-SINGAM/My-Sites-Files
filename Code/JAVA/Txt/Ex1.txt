import java.util.Scanner;
class Ex1
{
public static void main(String args[])
{
    float cel,far;
    Scanner s=new Scanner(System.in);
    System.out.println("enter temperature in celsius :");
    cel=s.nextInt();
    far=cel*9/5+32;
    System.out.println("temp in fahrenheit :"+far);
}
}
