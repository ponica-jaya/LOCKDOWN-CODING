#include <stdio.h>
int main()
{
    char str[100];
    int upper,lower,special,digit,i;
    printf("Enter a String : ");
    gets(str);
    printf("String input is %s ",str);
    upper = lower = special = digit = 0;
    for(i =0; str[i]!= '\0'; i++)
    {
    if(str[i] >= 'A' && str[i] <= 'Z')
    { 
        upper ++; 
    }
    else if(str[i] >= 'a' && str[i] <= 'z')
    { 
        lower ++;
    }
    else if(str[i] >= '0' && str[i] <= '9')
    {
        digit ++;
    }
    else
    {
        special ++;
    }
    }
    printf("\nUpper case count : %d \n",upper);
    printf("Lower case count : %d \n",lower);
    printf("Digit count : %d \n",digit);
    printf("Special character count : %d \n",special);
    return 0;
}
