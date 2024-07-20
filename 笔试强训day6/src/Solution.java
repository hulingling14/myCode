import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public static String solve (String s, String t) {
        // write code here
        if(s.length()==0){
            return t;
        }else if(t.length()==0){
            return s;
        }else {
            long ss = Long.parseLong(s);
            //System.out.println(ss);
            long tt = Long.parseLong(t);
            //System.out.println(tt);
            long sum = ss + tt;
            String solvee = String.valueOf(sum);
            return solvee;
        }
    }

    public static void main(String[] args) {
        String s=solve("2","1");
        System.out.println(s);
    }
}