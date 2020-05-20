Given an array a[] of size n which contains elements from 0 to n-1, write a program printDuplicates which prints the duplicate elements of the given array. If no duplicate element is found print -1.
Input:
The first line of input must contains an integer n which denotes number of elements of Array. Second line contains n space separated integers denoting elements of array a[].

Output:
Print the duplicate elements from the given array.

import java.util.Scanner;
class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            GfG g = new GfG();
            g.printDuplicates(a, n);
            System.out.println();
        }
    }
}// } Driver Code Ends/



/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below*/

class GfG
{
      public static void printDuplicates(int arr[], int n)
       {
           //add code here.
           boolean flag=true;
           for(int i=0;i<n;i++)
           {
               int ind=arr[i]%n;
               arr[ind]=arr[ind]+n;
               
           }
           for(int i=0;i<n;i++)
           {
               if(arr[i]/n>1)
               {
                   flag=false;
                   System.out.print(i+" ");
               }
               
           }
           if(flag==true)
           {
               System.out.print("-1");
           }
       }
}
