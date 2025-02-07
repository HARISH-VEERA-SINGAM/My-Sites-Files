#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
float p,n,r,si,ci;
clrscr();
printf("Enter priniciple Amount:\n");
scanf("%f",&p);
printf("Enter Rate of interest:\n");
scanf("%f",&r);
printf("Enter No:of years:\n");
scanf("%f",&n);
si=(p*n*r)/100;
ci=(p*pow((1+r/100),n)-p);
printf("simple_interest is:%7.2f\n",si);
printf("compound_interest is:%7.2f",ci);
getch();
}