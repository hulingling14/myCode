import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (x >= a[i]) {
                x += a[i];
            } else {
                x +=gcd(x, a[i]);
            }
        }
        System.out.print(x);
    }
    public static int gcd(int a,int b){
        int c=a%b;
        while(c>0){
            a=b;
            b=c;
            c=a%b;
        }
        return b;
    }
}