import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.print(strings[i]+" ");
        }
    }
}