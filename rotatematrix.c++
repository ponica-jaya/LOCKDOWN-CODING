#include <iostream>
#define M 3
#define N 3
using namespace std;
void displayMatrix(int matrix[][M])
{
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < M; j++)
        {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }
}
int main()
{
    int matrix[N][M];
    cout<<"Enter the matrix elements"<<endl;
    for(int i = 0 ; i < M ; i++)
    {
        for(int j = 0 ; j < N ; j++)
        {
            cin >> matrix[i][j]; 
        }
    }
    cout << "The given matrix is" << endl;
    displayMatrix(matrix);
    int temp[M];
    int k;
    cout << "Number of rotations : ";
    cin >> k; 
    k = k % M;
    for (int i = 0; i < N; i++)
    {
        for (int t = 0; t < M - k; t++)
        {
            temp[t] = matrix[i][t];
        }
        for (int j = M - k; j < M; j++)
        {
            matrix[i][j - M + k] = matrix[i][j];
        }
        for (int j = k; j < M; j++)
        {
            matrix[i][j] = temp[j - k];
        }
    }
    cout<<"\nThe rotated matrix is\n";
    displayMatrix(matrix);
    return 0;
}
