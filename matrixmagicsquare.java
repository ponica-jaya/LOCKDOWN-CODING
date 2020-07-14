import java.util.Scanner;
import java.io.*; 
public class  Matrix_Magic_Square.java{
	    static int N = 3;
	    static boolean isMagicSquare(int mat[][]) 
	    { 
	         int sum = 0,sum2=0;  
	        for (int i = 0; i < N; i++) 
	            sum = sum + mat[i][i]; 
	   
	        for (int i = 0; i < N; i++) 
	            sum2 = sum2 + mat[i][N-1-i]; 
	  
	        if(sum!=sum2)  
	            return false; 
	 
	        for (int i = 0; i < N; i++) { 
	  
	            int rowSum = 0; 
	            for (int j = 0; j < N; j++) 
	                rowSum += mat[i][j]; 
	            if (rowSum != sum) 
	                return false; 
	        }
	        for (int i = 0; i < N; i++) { 
	  
	            int colSum = 0; 
	            for (int j = 0; j < N; j++) 
	                colSum += mat[j][i]; 
	            if (sum != colSum) 
	                return false; 
	        } 
	  
	        return true; 
	    } 
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows in matrix:");
            int p = sc.nextInt();
            System.out.print("Enter number of columns in first matrix:");
            int q = sc.nextInt();
            int mat[][] = new int[p][q];
            System.out.println("Enter all the elements of matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    mat[i][j] = sc.nextInt();
                }
            }
	  
	        if (isMagicSquare(mat)) 
	            System.out.println("Magic matrix"); 
	        else
	            System.out.println("Not a magic" + 
	                                    " matrix"); 
	    }
}
