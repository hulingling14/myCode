import java.util.ArrayList;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int count = 0;
        ArrayList<Character> arrayList1 = new ArrayList<>();
        ArrayList<Character> arrayList2 = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            arrayList1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            arrayList2.add(s2.charAt(i));
        }
        int a = arrayList2.indexOf(s1.charAt(0));
        //if(s2.length()-a>=s1.length()) {
        for (int i = 1, j = a + 1; i < s1.length() && j < s2.length(); i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                count++;
            }
        }
        //}
        System.out.println(count);
//        int count = 0;
//        int min = 0;
//        if(s2.contains(s1)){
//            System.out.println(0);
//            return;
//        }
//        for (int i = 0, j =1; i < s1.length() && j < s2.length(); i++,j++) {
//            if (s1.charAt(i) != s2.charAt(i)) {
//                count++;
//            }
//            if (s1.charAt(i) != s2.charAt(j))
//                min++;
//        }
//        if (min <= count)System.out.print(min);
//        else System.out.print(count);
//    }
    }
}