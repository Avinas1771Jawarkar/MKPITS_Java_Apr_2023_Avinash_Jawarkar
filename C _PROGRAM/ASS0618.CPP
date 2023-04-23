#include<stdio.h>
#include<conio.h>
void main()
{l
int hundred,fifty,twenty,ten,five,two,one,amount;
int hunn, fiftyy, twentyy, tenn, fivee, twoo, onee;
printf("Enter the amount: ");
scanf("%d",&amount);

hundred = amount / 100;
hunn = amount % 100;
fifty = hunn / 50;
fiftyy = hunn % 50;
twenty = fiftyy / 20;
twentyy = fiftyy % 20;
ten = twentyy / 10;
tenn = twentyy % 10;
five = tenn / 5;
fivee = tenn % 5;
two = fivee / 2;
twoo = fivee % 2;
one = twoo / 1;
onee = twoo % 1;

printf("Hundreds: %d\n",hundred);
printf("Fifty: %d\n",fifty);
printf("Twenty: %d\n",twenty);
printf("Ten: %d\n",ten);
printf("Five: %d\n",five);
printf("Two: %d\n",two);
printf("One: %d\n",one);
getch();
}

