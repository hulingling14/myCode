import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            boolean f = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    f = false;
                    break;
                }
            }
            if (f)
                System.out.print(str1.charAt(i));
        }
    }
}