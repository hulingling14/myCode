import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] f = new int[100000];
        f[0] = 0;
        f[1] = 1;
        int a = 0;
        int b = 0;
        int min = 0;
        for (int i = 2; i < 100000; i++) {
            f[i] = f[i - 1] + f[i - 2];
            if (f[i] >= n) {
                a = f[i]-n;
                b = n - f[i - 1];
                if (b >= a) {
                    min = a;
                } else {
                    min = b;
                }
                break;
            }
        }
        System.out.println(min);
    }
}