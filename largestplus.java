import java.io.*; 
class largestplus
{
    static int N = 10;
    static int findLargestPlus(int mat[][]) 
    { 
	int left[][] = new int[N][N]; 
	int right[][] = new int[N][N]; 
	int top[][] = new int[N][N]; 
	int bottom[][] = new int[N][N]; 
	for (int i = 0; i < N; i++) { 
	top[0][i] = mat[0][i]; 
        bottom[N - 1][i] = mat[N - 1][i]; 
        left[i][0] = mat[i][0]; 
	right[i][N - 1] = mat[i][N - 1]; 
     } 
        for (int i = 0; i < N; i++) 
	{ 
	    for (int j = 1; j < N; j++) 
	    { 
		if (mat[i][j] == 1) 
		left[i][j] = left[i][j - 1] + 1; 
		else
		left[i][j] = 0; 
		if (mat[j][i] == 1) 
		top[j][i] = top[j - 1][i] + 1; 
		else
		top[j][i] = 0; 
                j = N - 1 - j; 
                if (mat[j][i] == 1) 
		bottom[j][i] = bottom[j + 1][i] + 1; 
		else
		bottom[j][i] = 0; 
                if (mat[i][j] == 1) 
                right[i][j] = right[i][j + 1] + 1; 
                else
                right[i][j] = 0; 
                j = N - 1 - j; 
            } 
	} 
        int n = 0; 
        for (int i = 0; i < N; i++) 
	{ 
            for (int j = 0; j < N; j++) 
	    { 
        int len = Math.min(Math.min(top[i][j],  
        bottom[i][j]),Math.min(left[i][j],  
        right[i][j])); 
        if (len > n) 
        n = len; 
            } 
        } 
        if (n > 0) 
        return 4 * (n - 1) + 1; 
        return 0; 
    } 
    public static void main(String[] args) 
    { 
    int mat[][] = { 
            { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
            { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 }, 
            { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, 
            { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 }, 
            { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }, 
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, 
            { 1, 0, 0, 0, 1, 0, 0, 1, 0, 1 }, 
            { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 }, 
            { 1, 1, 0, 0, 1, 0, 1, 0, 0, 1 }, 
            { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 } 
        }; 
        System.out.println(findLargestPlus(mat)); 
    } 
} 
