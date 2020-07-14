import java.util.Scanner;
public class Duplicate {
   
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        myObj.nextLine(); //ignore one space
        String [] s = myObj.nextLine().split(" ");
        if(s.length==n) {
            int [] arr = new int [n];
            for(int i=0; i<n;i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            for (int x = 0; x < arr.length; x++) {
                for (int y = x + 1 ; y < arr.length; y++) {
                    if (arr[x]==arr[y]) {
                        System.out.println(arr[x]);
                    }
                }
            }
        }else {
            System.out.println("Enter Array of length " + n);
        }
       
    }
}
