import java.util.*;


public class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * ����������֮��
     * @param s string�ַ��� ��ʾ��һ������
     * @param t string�ַ��� ��ʾ�ڶ�������
     * @return string�ַ���
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