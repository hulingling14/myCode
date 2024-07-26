import java.util.*;
import java.io.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static PrintWriter out = new PrintWriter(new BufferedWriter(
            new OutputStreamWriter(System.out)));
    public static Read in = new Read();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int prescent = 0;
        while ((n - 2 >= 0 && m - 1 >= 0) || (n - 1 >= 0 && m - 2 >= 0)) {
            if (n - 2 >= 0 && m - 1 >= 0 && prescent + a > prescent + b) {
                prescent += a;
                n = n - 2;
                m = m - 1;
            } else if (n - 1 >= 0 && m - 2 >= 0) {
                prescent += b;
                n = n - 1;
                m = m - 2;
            }
        }
        System.out.println(prescent);
        //System.out.println(getMax(n,m,a,b,prescent));
    }
//    public static int getMax(int n,int m,int a,int b,int p){
//        if((n-2>=0&&m-1>=0)||(n-1>=0&&m-2>=0)){
//            return getMax(n-=2,m--,a,b,p+=a)>getMax(n--,m-=2,a,b,p+=b)?getMax(n-=2,m--,a,b,p+=a):getMax(n--,m-=2,a,b,p+=b);
//        }
//        return p;
//    }
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
