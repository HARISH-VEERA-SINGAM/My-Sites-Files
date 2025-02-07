#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
clrscr();
printf("Enter values for a and b\n");
scanf("%d%d",&a,&b);
c=a;
a=b;
b=c;
printf("swapping a&b values using third variable c is %d\t%d\n",a,b);
getch();
}