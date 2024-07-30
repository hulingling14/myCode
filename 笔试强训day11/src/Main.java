import java.util.*;
import java.io.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static PrintWriter out = new PrintWriter(new BufferedWriter(
            new OutputStreamWriter(System.out)));
    public static Read in = new Read();
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
    }
}
class Read {
    StringTokenizer st = new StringTokenizer("");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String next() throws IOException {
        while (!st.hasMoreTokens()) {
            st = new StringTokenizer(bf.readLine());
        }
        return st.nextToken();
    }

    String nextLine() throws IOException {
        return bf.readLine();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}