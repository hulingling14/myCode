import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count = 0;
        while (count < t) {
            boolean f = false;
            count++;
            int[] a = new int[6];
            int b = 0, c = 0, d = 0;
            int[] e = new int[3];
            for (int i = 0; i < 6; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    for (int k = 0; k < 6; k++) {
                        if (i != j && j != k && i != k && a[i] + a[j] > a[k] && a[i] + a[k] > a[j] && a[j] + a[k] > a[i]
                                && Math.abs(a[i] - a[j]) < a[k] && Math.abs(a[i] - a[k]) < a[j] && Math.abs(a[j] - a[k]) < a[i]) {
                            b = a[i];
                            c = a[j];
                            d = a[k];
                            for (int l = 0, g = 0; l < 6; l++, g++) {
                                if(g==3)
                                    break;
                                if (l != i && l != j && l != k) {
                                    e[g] = a[l];
                                }
                            }
                            if (e[0] + e[1] > e[2] && e[0] + e[2] > e[1] && e[1] + e[2] > e[0] &&
                                    Math.abs(e[0] - e[1]) < e[2] && Math.abs(e[0] - e[2]) < e[1] && Math.abs(e[1] - e[2]) < e[0]) {
                                System.out.println("Yes");
                                f = true;
                                break;
                            }
                        }
                    }
                    if (f) break;
                }
                if (f) break;
            }
            if (!f) System.out.println("No");
        }
//        int t = in.nextInt();
//        for (int i = 0; i < t; i++) {
//            int x1 = in.nextInt();
//            int x2 = in.nextInt();
//            int x3 = in.nextInt();
//            int x4 = in.nextInt();
//            int x5 = in.nextInt();
//            int x6 = in.nextInt();
//            if (x1 + x2 > x3 && x1 + x3 > x2 && x2 + x3 > x1 && Math.abs(x1 - x2) < x3 &&
//                    Math.abs(x1 - x3) < x2 && Math.abs(x2 - x3) < x1) {
//                if (x4 + x5 > x6 && x4 + x6 > x5 && x5 + x6 > x4 && Math.abs(x4 - x5) < x6 &&
//                        Math.abs(x4 - x6) < x5 && Math.abs(x5 - x6) < x4) {
//                    System.out.println("Yes");
//                    continue;
//                }
//            }
//            if (x1 + x2 > x4 && x1 + x4 > x2 && x2 + x4 > x1 && Math.abs(x1 - x2) < x4 &&
//                    Math.abs(x1 - x4) < x2 && Math.abs(x2 - x4) < x1) {
//                if (x3 + x5 > x6 && x3 + x6 > x5 && x5 + x6 > x3 && Math.abs(x3 - x5) < x6 &&
//                        Math.abs(x3 - x6) < x5 && Math.abs(x5 - x6) < x3) {
//                    System.out.println("Yes");
//                    continue;
//                }
//            }
//            if (x1 + x2 > x5 && x1 + x5 > x2 && x2 + x5 > x1 && Math.abs(x1 - x2) < x5 &&
//                    Math.abs(x1 - x5) < x2 && Math.abs(x2 - x5) < x1) {
//                if (x4 + x3 > x6 && x4 + x6 > x3 && x3 + x6 > x4 && Math.abs(x4 - x3) < x6 &&
//                        Math.abs(x4 - x6) < x3 && Math.abs(x3 - x6) < x4) {
//                    System.out.println("Yes");
//                    continue;
//                }
//            }
//            if (x1 + x2 > x6 && x1 + x6 > x2 && x2 + x6 > x1 && Math.abs(x1 - x2) < x6 &&
//                    Math.abs(x1 - x6) < x2 && Math.abs(x2 - x6) < x1) {
//                if (x4 + x5 > x3 && x4 + x3 > x5 && x5 + x3 > x4 && Math.abs(x4 - x5) < x3 &&
//                        Math.abs(x4 - x3) < x5 && Math.abs(x5 - x3) < x4) {
//                    System.out.println("Yes");
//                    continue;
//                }
//            }
//            if (x4 + x2 > x3 && x4 + x3 > x2 && x2 + x3 > x4 && Math.abs(x4 - x2) < x3 &&
//                    Math.abs(x4 - x3) < x2 && Math.abs(x2 - x3) < x4) {
//                if (x1 + x5 > x6 && x1 + x6 > x5 && x5 + x6 > x1 && Math.abs(x1 - x5) < x6 &&
//                        Math.abs(x1 - x6) < x5 && Math.abs(x5 - x6) < x1) {
//                    System.out.println("Yes");
//                    continue;
//                }
//            }
//            if (x5 + x2 > x3 && x5 + x3 > x2 && x2 + x3 > x5 && Math.abs(x5 - x2) < x3 &&
//                    Math.abs(x5 - x3) < x2 && Math.abs(x2 - x3) < x5) {
//                if (x4 + x1 > x6 && x4 + x6 > x1 && x1 + x6 > x4 && Math.abs(x4 - x1) < x6 &&
//                        Math.abs(x4 - x6 ) < x1 && Math.abs(x1 - x6) < x4) {
//                    System.out.println("Yes");
//                    continue;
//                }
//            }
//            if (x6 + x2 > x3 && x6 + x3 > x2 && x2 + x3 > x6 && Math.abs(x6 - x2) < x3 &&
//                    Math.abs(x6 - x3) < x2 && Math.abs(x2 - x3) < x6) {
//                if (x4 + x5 > x1 && x4 + x1 > x5 && x5 + x1 > x4 && Math.abs(x4 - x5) < x1 &&
//                        Math.abs(x4 - x1) < x5 && Math.abs(x5 - x1) < x4) {
//                    System.out.println("Yes");
//                    continue;
//                }
//            }
//            System.out.println("No");
//        }
//        return;
    }
}