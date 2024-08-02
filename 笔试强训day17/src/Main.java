import java.util.ArrayList;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (n > 0) {
            int a = n % 10;
            if (a % 2 == 0)
                arrayList.add(0);
            else arrayList.add(1);
            n = n / 10;
            count++;
        }
        int sum = 0;
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            count--;
            sum += arrayList.get(i) * Math.pow(10, count);
        }
        System.out.println(sum);
    }
}