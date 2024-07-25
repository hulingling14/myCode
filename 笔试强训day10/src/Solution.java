import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param A string字符串
     * @return int整型
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