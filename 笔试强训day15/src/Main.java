import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
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