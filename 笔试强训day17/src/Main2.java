import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        int[] b = new int[n];
        int[] c = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
                b[i]+= a[i][j];
                c[j]+=a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = b[i] + c[j] - a[i][j];
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

//    public static int getSumI(int[][] a, int c) {
//        int[] b = new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//            int s = 0;
//            for (int j = 0; j < a[i].length; j++) {
//                s += a[i][j];
//            }
//            b[i] = s;
//        }
//        return b[c];
//    }
//
//    public static int getSumJ(int[][] a, int n, int m, int c) {
//        int[] b = new int[m];
//        for (int j = 0; j < m; j++) {
//            int s = 0;
//            for (int i = 0; i < n; i++) {
//                s += a[i][j];
//            }
//            b[j] = s;
//        }
//        return b[c];
//    }
}