#include <stdio.h>
#include<conio.h>
void main()
{
int a, b,c;
printf("enter the value of a and b");
scanf("%d%d",&a,&b);
c=b;
b=a;
a=c;
printf("%d%d",a,b);
getch();
}
