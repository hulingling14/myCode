import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        int[] a = new int[3];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') a[0]++;
            if (str.charAt(i) == 'h') a[1]++;
            if (str.charAt(i) == 'y') a[2]++;
        }
        for (int i = 0; i < a[0]; i++) {
            for (int j = 0; j < a[1]; j++) {
                for (int k = 0; k < a[2]; k++) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}