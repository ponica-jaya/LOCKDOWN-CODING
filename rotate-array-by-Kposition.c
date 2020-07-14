#include <stdio.h> 
void displayMatrix(int mat[][],int N); 
void rotateMatrix(int mat[][], int N) 
{ 
	for (int x = 0; x < N / 2; x++) { 
		for (int y = x; y < N - x - 1; y++) { 
			int temp = mat[x][y]; 
			mat[x][y] = mat[y][N - 1 - x]; 
			mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y]; 
			mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x]; 
			mat[N - 1 - y][x] = temp; 
		} 
	} 
} 
void displayMatrix(int mat[][], int N) 
{ 
	for (int i = 0; i < N; i++) { 
		for (int j = 0; j < N; j++) 
			printf("%2d ", mat[i][j]); 

		printf("\n"); 
	} 
	printf("\n"); 
} 
int main() 
{ 
	int N;
	printf("Enter size of square matrix : ");
	scanf("%d",&N);
	int mat[N][N];
	printf("Enter matrix elements :\n");
	for(int i=0;i<n;i++)
		for(int j=0;j<N;j++)
			scanf("%d",mat[i][j]);
	rotateMatrix(mat,N); 
	displayMatrix(mat,N); 
	return 0; 
} 
