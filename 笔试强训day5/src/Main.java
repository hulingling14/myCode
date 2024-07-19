import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int score = 0;
        int count=0;
        int[] arr = new int[3];
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        arr[2] = in.nextInt();
        for (int y = 1, o = 1, u = 1; o <= arr[1]; ) {
            if (count == q)
                break;
            if (y <= arr[0] && u <= arr[2]) {
                score += 2;
                y++;
                u++;
                o++;
            } else {
                o--;
                if (o + 2 <= arr[1]) {
                    score += 1;
                    o = o + 2;
                } else break;
            }
            System.out.println(score);
            count++;
        }
    }
}