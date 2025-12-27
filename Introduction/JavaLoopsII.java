import java.util.*;

class Solution {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (1 << j) * b;   // 2^j * b
                System.out.print(sum);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        in.close();
    }
}
