Write a C Program to rotate the matrix by K times Program in C
Rotate the matrix by K times means rotating the given NN matrix to the specified (K) number of times. For example, consider the 33 matrix, which has to be rotated once,
Enter the Size of the Matrix: 3, 3
Enter the Elements of the Matrix: 10, 20, 39, 40, 50, 60, 70, 80, 90
Enter the value of K (Number of Rotations): 1
Matrix before Rotation:
10 20 30
40 50 60
70 80 90
Matrix after Rotation:
20 30 10
50 60 40
80 90 70


#include<stdio.h>
#define M 3 
#define N 3
void rotateMatrix(int matrix[][M], int k) { 
 
  int temp[M]; 
  
  
  k = k % M; 
  
  for (int i = 0; i < N; i++) { 
  
    
    for (int t = 0; t < M - k; t++) 
      temp[t] = matrix[i][t]; 
  
    
    for (int j = M - k; j < M; j++) 
      matrix[i][j - M + k] = matrix[i][j]; 
  
    
    for (int j = k; j < M; j++) 
      matrix[i][j] = temp[j - k]; 
  } 
} 
  

void displayMatrix(int matrix[][M]) 
{ 
  for (int i = 0; i < N; i++) 
   { 
    for (int j = 0; j < M; j++)
        {
            printf("%d\t",matrix[i][j]);
        }
      printf("\n");
   }
  
  
 
} 

int main() { 
  int matrix[N][M] = {{12, 23, 34}, 
                     {45, 56, 67},  
                     {78, 89, 91}}; 
  int k = 2; 
  
  
  rotateMatrix(matrix, k); 
  
  
  displayMatrix(matrix); 
  
  return 0; 
} 
