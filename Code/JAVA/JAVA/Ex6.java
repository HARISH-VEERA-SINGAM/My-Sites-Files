import java.util.Scanner;
class Student
{
String name;
int age;
String rollno;
Student(String n, int a, String rn, String c)
{
   name = n;
   age = a;
   rollno = rn;
    String course = c;
}
void display(String course)
{
 System.out.println("Name:"+name);
 System.out.println("Age:"+age);
 System.out.println("Roll Number:"+rollno);
 System.out.println("Course:"+course);
}
}
public class Ex6
{
    public static void main(String args[])
{
 Scanner s = new Scanner(System.in);
 int i,n;
 System.out.print("Enter the number of students: ");
 n = s.nextInt();
 s.nextLine();
 Student students[] = new Student[n];
 for (i = 0;i<n;i++)
 {
  System.out.println("Enter details for student"+(i + 1)+":");
  System.out.print("Name: ");
  String name=s.nextLine();
  System.out.print("Age:");
  int age = s.nextInt();
  s.nextLine();
  System.out.print("Roll Number:");
  String rollno =s.nextLine();
  System.out.print("Coures: ");
  String course = s.nextLine();
  students[i] =new Student(name,age,rollno,course);
 }
 System.out.println("/nStudent Details:");
 for(i=0;i<n;i++)
 {
     students[i].display();
     System.out.println();
 }
}
}
  
