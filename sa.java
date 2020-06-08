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
