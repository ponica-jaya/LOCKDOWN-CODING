#include <stdio.h>

void main()
{
    int num, sum, rem;

    printf("Please Enter any number = ");
    scanf("%d", &num);

    while(num >= 10)
    {
        for (sum=0; num > 0; num= num/10)
        {
            rem = num % 10;
            sum=sum + rem;
        }
        if(sum >= 10)
        {
            num = sum;
        }
        else
        {
            printf("digital Root of Given num = %d", sum);
            break;
        }
    }

}
