import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (!arrayList.contains(a)) {
                arrayList.add(a);
            }
        }
        for (int i = 0; i < m; i++) {
            int b = in.nextInt();
            if (!arrayList.contains(b)) {
                arrayList.add(b);
            }
        }
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}