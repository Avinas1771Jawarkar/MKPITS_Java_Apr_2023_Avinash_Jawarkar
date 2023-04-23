#include<stdio.h >
#include<conio.h>
void main()
{
int w1,w2,n1,n2,result;
printf("weight of item 1: ");
scanf("%d",&w1);
printf("weight of item 2: ");
scanf("%d",&w2);
printf("no. of item purchase: ");
scanf("%d",&n1);
printf("no. of item purchase: ");
scanf("%d",&n2);
result=((w1*n1)+(w2*n2))/(n1+n2);
printf("average value =%d",result);

getch();
}
