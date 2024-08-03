import java.util.*;


public class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param param string�ַ���
     * @return string�ַ���
     */
    public static String compressString(String param) {
        // write code here
        String s = "";
        for (int i = 0; i < param.length(); ) {
            s += param.charAt(i);
            int count = 1;
            int j = i + 1;
            while (j < param.length() && param.charAt(j) == param.charAt(j - 1)) {
                count++;
                j++;
            }
            if (count > 1) {
                s += count;
                i += count;
            } else i++;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(compressString("shopeew"));
    }
}