package Arrays;

/*
*  Find the sum for contiguous subarray within
*  a one dimensional array of numbers has the largest sum
*
* */



public class KadansAlgorithm {

    public int lagestSum(int[] nums) {
        int sum = 0, max_sum = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum < 0) {
                sum = 0;
            }
            if (max_sum < sum) {
                max_sum = sum;
            }
        }
        return max_sum;
    }

    public int getMax(int[] a) {
        return lagestSum(a);
    }

    public static void main(String[] args) {
        KadansAlgorithm k = new KadansAlgorithm();
        int[] nums = {2, -10, 11, 3, 4, -5, 1};
        System.out.println(k.lagestSum(nums));
    }
}
