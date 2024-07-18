import java.util.*;


public class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param board string�ַ���һά����
     * @param word  string�ַ���
     * @return bool������
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