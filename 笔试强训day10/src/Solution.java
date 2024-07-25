import java.util.*;


public class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param A string�ַ���
     * @return int����
     */
    public static int getLongestPalindrome(String A) {
        // write code here
        int max = 0;
        for (int i = A.length() - 1; i > 0; i--) {
            int left = 0, right = i;
            while (left <= right) {
                if (A.charAt(left) != A.charAt(right)) break;
                left++;
                right--;
            }
            if (left > right) {
                max = i;
                break;
            }
        }
        return max + 1;
    }

    public static void main(String[] args) {
        System.out.println(getLongestPalindrome("abbbbbc"));
    }
}