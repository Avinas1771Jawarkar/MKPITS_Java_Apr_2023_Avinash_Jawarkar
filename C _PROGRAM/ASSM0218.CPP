#include <stdio.h>
#include<conio.h>
void main()
{
int id,hour, value, sal;
printf("ente employee id:");
scanf("%d",&id);
printf("tootal no. of hour: ");
scanf("%d",&hour);
printf("enter salary/hour: ");
scanf("%d",&value);
sal=hour*value;
printf("empolyee id =%d ",id);
printf("salary=%d ",sal);
getch();
}
