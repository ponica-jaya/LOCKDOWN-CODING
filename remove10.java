import java.util.*;

class remove_10{
public static void main(String args[])
	{
	 int n,i,m=0,k,j=0;
	System.out.println("Enter size of an array:");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int a[]=new int [n];
	System.out.printf("Enter %d array elements seperated by space",n);
	System.out.println();
	for(i=0;i<n;i++)				//for input of array 
	{																
		a[i]=s.nextInt();
	}
	System.out.println("The given array");
	for(i=0;i<n;i++)				//for display of inputed array
	{	
		System.out.print(a[i]+"\t");
	}
	System.out.println();
	for(i=0;i<n;i++)			//for assiging 0 in place of 10
	{	
		if(a[i]==10)
		{
			a[i]=0;
		}
	}
	System.out.println("The resultant array is:");
	for(i=0;i<n;i++)				
	{	if(a[i]>0)
		{
		a[j]=a[i];
		j++;
		m++;
		}
	}
	for(k=m;k<n;k++)
	{
		a[j]=0;
		j++;
	}
	
	for(j=0;j<n;j++)
	{
		System.out.print(a[j]+"\t");
	}


	}

}
