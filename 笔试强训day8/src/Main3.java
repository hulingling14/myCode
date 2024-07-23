import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = in.next();
            a[i] = s.toCharArray();
        }
        int score = getMax(a, n, m, 0, 0, 0);
        System.out.println(score);
    }

    public static int getMax(char[][] a, int n, int m, int i, int j, int score) {
        if (i < n && j < m) {
            if (a[i][j] == 'l') score += 4;
            if (a[i][j] == 'o') score += 3;
            if (a[i][j] == 'v') score += 2;
            if (a[i][j] == 'e') score += 1;
            return getMax(a, n, m, i, j + 1, score) > getMax(a, n, m, i + 1, j, score) ? getMax(a, n, m, i, j + 1, score) : getMax(a, n, m, i + 1, j, score);
        }
        return score;
    }
}