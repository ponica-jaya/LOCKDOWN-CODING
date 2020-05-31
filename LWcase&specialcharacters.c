Write a C Program to count Uppercase, Lowercase, special character and numeric values for a given String

#include <stdio.h>
int main()
{
    //1
    char inputString[100];
    int upperCount,lowerCount,specialCount,digitCount,i;
    //2
    printf("Enter a String : ");
    gets(inputString);
    //3
    printf("String input is %s ",inputString);
    //4
    upperCount = lowerCount = specialCount = digitCount = 0;
    //5
    for(i =0; inputString[i]!= '\0'; i++){
      //6
      if(inputString[i] >= 'A' && inputString[i] <= 'Z'){ upperCount ++; }else if(inputString[i] >= 'a' && inputString[i] <= 'z'){ lowerCount ++; }else if(inputString[i] >= '0' && inputString[i] <= '9'){
        digitCount ++;
      }else{
        specialCount ++;
      }
    }
    //7
    printf("\nUpper case count : %d \n",upperCount);
    printf("Lower case count : %d \n",lowerCount);
    printf("Digit count : %d \n",digitCount);
    printf("Special character count : %d \n",specialCount);
    return 0;
}
