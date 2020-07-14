#include <stdio.h>
int main()
{
    int n,k,i;
    printf("Enter size of array : ");
    scanf("%d",&n);
    int a[1000];
    printf("Enter array elements : ");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    printf("Enter the number of rotations : ");
    scanf("%d",&k);
    for(i=0;i<k;i++)
        a[n+i]=a[i];
    printf("The array after %d rotation(s) is : ",k);
    for(i=k;i<n+k;i++)
        printf("%d ",a[i]);
}
