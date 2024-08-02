import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = 0;
        for (long i = 1;; i++) {
            if (i * i >= x) {
                y = i * i;
                if ((i - 1) * (i - 1) <= x && x - (i - 1) * (i - 1) < y - x) {
                    y = (i - 1) * (i - 1);
                }
                break;
            }
        }
        System.out.print(y);
    }
}