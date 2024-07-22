import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int max = -1, a = 0, b = 0;
        int ma = 0, mb = 0;
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            a = i;
            for (int j = i; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j))) {
                    b = j;
                } else break;
            }
            if (b - a > max) {
                max = b - a;
                ma = a;
                mb = b;
            }
        }
        for (int i = ma; i <= mb; i++) {
            System.out.print(str.charAt(i));
        }
    }
}