public class TugasNo6 {
    public static int findMax(int[] nums, int k) {
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] intArr1 = { 2, 1, 5, 1, 3, 2 };
        int[] intArr2 = { 2, 3, 4, 1, 5 };

        int maxSum1 = findMax(intArr1, 3);
        int maxSum2 = findMax(intArr2, 2);

        System.out.println("Sample Test Array 1 : " + maxSum1);
        System.out.println("Sample Test Array 2 : " + maxSum2);
    }
}
