import java.util.Scanner;
class Ex4
{
public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    int marks[] = new int[5];
    int sum =0;
    double aver ;
    System.out.println("enter your tenth standard marks one bye one:");
    for (int i=0;i<5;i++)
    {
    System.out.print("Subject"+(i+1)+":");
    marks[i]=s.nextInt();
    sum += marks[i];
    }
    aver = sum/5.0;
    System.out.println("Total marks:"+sum);
    System.out.println("average marks:"+aver);
 }
}
