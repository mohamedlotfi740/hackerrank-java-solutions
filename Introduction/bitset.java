import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            BitSet a = (x == 1) ? b1 : b2;
            BitSet b = (y == 1) ? b1 : b2;

            if (op.equals("AND")) a.and(b);
            else if (op.equals("OR")) a.or(b);
            else if (op.equals("XOR")) a.xor(b);
            else if (op.equals("FLIP")) a.flip(y);
            else if (op.equals("SET")) a.set(y);

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        sc.close();
    }
}
