Write a C program to calculate the digital root of a number.
#include<stdio.h>
int main() 
{
    int n;
    int i, d;
    int s=0;
    int sum=0;
    printf("Enter the Interger\n");
    scanf("%d", &n);
    while(n)
    { 
        d = n%10;       
        s = s+d;        
        n = n/10;    
    }     
    while(s) 
    { 
        i = s%10;
        sum = sum + i;        
        s = s/10;      
    }   
    printf("%d", sum);
}
