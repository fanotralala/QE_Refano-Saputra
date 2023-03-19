public class TugasNo5 {
    public static int hapusDuplikat(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] intArr1 = { 2, 3, 3, 3, 6, 9, 9 };
        int[] intArr2 = { 2, 2, 2, 11 };

        int len1 = hapusDuplikat(intArr1);
        int len2 = hapusDuplikat(intArr2);

        System.out.println("Sample Test Array 1 : " + len1);
        System.out.println("Sample Test Array 2 : " + len2);
    }
}
