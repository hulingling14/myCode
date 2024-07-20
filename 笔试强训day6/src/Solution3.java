import java.util.*;


public class Solution3 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串 第一个整数
     * @param t string字符串 第二个整数
     * @return string字符串
     */
    public String solve (String s, String t) {
        if(s.equals("0")||t.equals("0")){
            return "0";
        }else {
            long ss = Long.parseLong(s);
            //System.out.println(ss);
            long tt = Long.parseLong(t);
            //System.out.println(tt);
            long sum = ss * tt;
            String solvee = String.valueOf(sum);
            return solvee;
        }
    }
}