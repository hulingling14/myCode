import java.util.*;


public class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param str string�ַ��� ԭ��
     * @param arg char�ַ���һά���� ���滻����
     * @return string�ַ���
     */
    public static String formatString(String str, char[] arg) {
        // write code here
        str = str.replaceAll("%s", ",");
        System.out.println(str);
        int count = 0;
        String s = "";
        String[] strs = str.split(",");
        for (int i = 0; i < strs.length; i++) {
                s+=strs[i];
                s+=
        }
        while (count < arg.length) {
            s += arg[count];
            count++;
        }
//        String s = "";
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != '%' && str.charAt(i) != 's') {
//                s += str.charAt(i);
//            } else {
//                if (str.charAt(i) == '%') {
//                    s += arg[count];
//                    count++;
//                }
//            }
//        }
//        while (count < arg.length) {
//            s += arg[count];
//            count++;
//        }
//        return s;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(formatString("a%sbc%s", new char[]{'B', 'D'}));
    }
}