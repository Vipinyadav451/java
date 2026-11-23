public class twoSum {
    static int[] gettwosum(int nums[], int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    int ans[] = { i, j };
                    System.out.println(ans[i] + ", " + ans[j]);
                    return ans;

                }
            }
        }
        // for(int k:nums){
        // System.out.println(k);

        int ans[] = {};
        return ans;
    }

    static void main(String[] args) {
        int nums[] = { 2, 7, 4, 8, 3, 8, 4 };
        gettwosum(nums, 11);
        // System.out.println("print the pair of element which sum is equal==target :" +
        // res);

    }
}