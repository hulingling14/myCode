import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = getC(0, n, 0);
        System.out.println(count);
    }
    public static int getC(int count, int n, int c) {
        if(count<=n) {
            c++;
            return getC(count++, n, c);
        }
        return c;
    }
}