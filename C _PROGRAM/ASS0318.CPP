//find the maximum value form three interger
#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
printf("enter the  value of a,b,c,");
scanf("%d%d%d",&a,&b,&c);
if(a<b)
{
if(a<c)
{
printf("maximun value of a=%d",a);
}

else
{
printf("maximum vakue of c=%d",c);
}

 printf("maximum value of b %d ",b);
}
getch();
}