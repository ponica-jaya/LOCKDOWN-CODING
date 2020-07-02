// Java implementation to find the minimum of the maximum difference of the adjacent elements after removing K elements from the array 
import java.util.*;  
class MAD
{
    static int minimumAdjacentDifference(int a[],int n, int k) 
    { 
        int minDiff = Integer.MAX_VALUE; 
        for (int i = 0; i < (1 << n); i++)
 	{ 
        	int cnt = Integer.bitCount(i); 
 	        if (cnt == n - k)
		{ 
	                 Vector<Integer> temp = new Vector<Integer>(); 
                	for (int j = 0; j < n; j++)
 			{ 
               		     if ((i & (1 << j)) != 0) 
                        		temp.add(a[j]); 
               		} 
	                int maxDiff = Integer.MIN_VALUE; 
                	for (int j = 0; j < temp.size() - 1; j++) 
			{ 
                    		maxDiff = Math.max(maxDiff,  
                   		temp.get(j + 1) - temp.get(j)); 
               		} 
                	minDiff = Math.min(minDiff, maxDiff); 
            	} 
        } 
        return minDiff; 
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        int k = 2; 
        int a[] = { 3, 7, 8, 10, 14 }; 
        System.out.println(minimumAdjacentDifference(a, n, k)); 
    } 
} 
