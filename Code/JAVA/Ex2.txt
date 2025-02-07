import java.util.Scanner;
public class Ex2
{
public static void main(String args[])
{
int a,b,big;
Scanner scan=new Scanner(System.in);
System.out.println("Enter two numbers :");
a=scan.nextInt();
b=scan.nextInt();
big=(a>b)?a:b;
System.out.println("Largest="+big);
}
}