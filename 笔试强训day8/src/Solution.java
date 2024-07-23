import java.util.*;


public class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     * <p>
     * max increasing subsequence
     *
     * @param arr int����һά���� the array
     * @return int����
     */
    public static int MLS(int[] arr) {
        // write code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        Collections.sort(arrayList);
        int max = 1;
        int right = 1;
        int left = 0;
        while (right < arrayList.size()) {
            if (arrayList.get(right) == arrayList.get(right - 1) + 1) {
                if (right - left + 1 > max)
                    max = right - left + 1;
            } else {
                left = right;
            }
            right++;
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int[] a = {333,7,777,8,2,6,5,4,3,11,9,100000000};
        MLS(a);
    }
}