import java.util.*;


public class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param arr int����һά���� the array
     * @return int����
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