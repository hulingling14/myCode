import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int f = 0;
            a[i] = in.nextInt();
            if (a[i] % 2 != 0) {
                a[i] *= 2;
            }
            for (int j = 1; Math.pow(2, j) <= a[i]; j++) {
                if (Math.pow(2, j) == a[i]) {
                    f = 1;
                }
            }
            if (f == 0) {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}