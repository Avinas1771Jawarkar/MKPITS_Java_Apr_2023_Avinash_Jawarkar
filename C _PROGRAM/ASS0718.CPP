#include<stdio.h>
#include<conio.h>
void main()
{
int sec, hour, minute, second;
printf("Enter seconds: ");
scanf("%d",&sec);
hour = sec/3600;
minute = (sec - hour*3600)/60;
second = sec - hour*3600 - minute*60;
printf("%d second = %d hours : %d minute : %d seconds", sec,hour,minute,second);
getch();
}