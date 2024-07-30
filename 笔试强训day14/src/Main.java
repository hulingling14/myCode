import java.util.ArrayList;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] str1 = in.next().toCharArray();
        char[] str2 = in.next().toCharArray();
        ArrayList<Character> a1 = new ArrayList<>();
        ArrayList<Character> a2 = new ArrayList<>();
        for (int i = 0; i < str1.length; i++) {
            a1.add(str1[i]);
        }
        for (int i = 0; i < str2.length; i++) {
            a2.add(str2[i]);
            if (a1.contains(str2[i])) {
                a1.remove(a1.indexOf(str2[i]));
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
//        for (int i = 0; i < str2.length; i++) {
//            int f = 0;
//            for (int j = 0; j < str1.length; j++) {
//                if (str1[j] == '1') {
//                    continue;
//                }
//                if (str2[i] == str1[j]) {
//                    str1[j] = '1';
//                    f = 1;
//                    break;
//                }
//            }
//            if (f == 0) {
//                System.out.println("No");
//                return;
//            }
//        }
//        System.out.print("Yes");
    }
}