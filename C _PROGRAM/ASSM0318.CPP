#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int n1, n2,n3;
printf("enter the n1: ");
scanf("%d",&n1);
printf ("enter the n2: " );
scanf("%d",  n2);
printf("denter the n3: ");
scanf("%d",&n3);
if(n1>n2 && n1>n3)
printf("%d is largest value",n1);
if(n2>n1 && n2>n3)
printf ("%d is largest value" ,n2);
if(n3>n1 && n3>n2)
printf("%d is largest value",n3);
getch();
}
