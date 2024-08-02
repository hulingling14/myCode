import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串 原串
     * @param arg char字符型一维数组 需替换数组
     * @return string字符串
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