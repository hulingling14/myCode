import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        String[] s = new String[4];
        int count = 0;
        while (N > 0) {
            if (N % 1000 == 0)
                s[count] = "," + "000";
            else {
                s[count] = "," + get(N % 1000) + N % 1000;
            }
            count++;
            N = N / 1000;
        }
        for (int i = count - 1; i >= 0; i--) {
            if (i == count - 1) {
                for (int j = 1; j < s[count - 1].length(); j++) {
                    if(j==1&&s[count - 1].charAt(1)!='0')
                        System.out.print(s[count - 1].charAt(1));
                    if (j!=1&&(s[count - 1].charAt(j)!='0'||s[count - 1].charAt(j-1)!='0'))
                        System.out.print(s[count - 1].charAt(j));
                }
            } else
                System.out.print(s[i]);
        }
    }

    public static String get(long n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        if (count == 1) return "00";
        else if (count == 2) return "0";
        else return "";
    }
}