import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public static int maxLength(int[] arr) {
        // write code here
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[j - 1]) {
                    count++;
                } else break;
            }
            if (count + 1 > max)
                max = count + 1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxLength(new int[]{4,5,4,5}));
    }
}