Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.
Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output:
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortArrOfZeroOneTwo {

    public static void sort(String[] arr) {

        StringBuffer sb = new StringBuffer();
        int count[] = new int[3];
        for (String v : arr
        ) {
            count[Integer.parseInt(v)] = count[Integer.parseInt(v)] + 1;
        }

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                sb.append(i + " ");
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());
            int j = 0;
            String[] arr = br.readLine().split(" ");
            sort(arr);
            System.out.println();
        }
    }
}
