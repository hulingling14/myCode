import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int h = in.nextInt();
        int b = in.nextInt();
        int k = in.nextInt();
        int c = 0;
        while (h > 0 && k > 0) {
            c += (a + b);
            h -= b;
            k -= a;
        }
        if (h > 0) {
            c += a * 10;
        }
        if (k > 0) {
            c += b * 10;
        }
        System.out.print(c);
    }
}