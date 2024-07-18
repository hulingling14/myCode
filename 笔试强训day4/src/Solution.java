import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param board string字符串一维数组
     * @param word  string字符串
     * @return bool布尔型
     */
    public static boolean exist(String[] board, String word) {
        char[][] a = new char[board.length][];
        for (int i = 0; i < a.length; i++) {
            a[i] = board[i].toCharArray();
        }
        char[] w = word.toCharArray();
        int count = 0;
        int b = 0;
        int c = 0;
        int f = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (f == 0 && a[i][j] == w[count]) {
                    b = i;
                    c = j;
                    f = 1;
                    count++;
                }
                if (f == 1 && a[i][j] == w[0]) {
                    b = i;
                    c = j;
                }
                if (count < w.length && a[i][j] == w[count]) {
                    if (i == b || j == c) {
                        b = i;
                        c = j;
                        count++;
                        a[i][j]='0';
                    }
                    if(a[i][j-1]==w[count]&&a[i][j]!='0'){
                        count++;
                    }
                }
            }
        }
        if (count == w.length)
            return true;
        return false;
}
        public static void main (String[]args){
            String[] board = {"XYZE", "SFZS", "XDEE"};
            System.out.println(exist(board, "XYZZED"));
        }
}