import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.next();
            int score = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'W') {
                    if (j >= 2 && s.charAt(j - 1) == 'W' && s.charAt(j - 2) == 'W') {
                        score += k;
                    } else score += 1;
                } else if(s.charAt(j) == 'L'){
                    score -= 1;
                }
            }
            System.out.println(score);
        }
    }
}