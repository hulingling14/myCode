import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param param string字符串
     * @return string字符串
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