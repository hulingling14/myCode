import java.util.*;


public class Solution3 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     *
     * @param s string�ַ��� ��һ������
     * @param t string�ַ��� �ڶ�������
     * @return string�ַ���
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