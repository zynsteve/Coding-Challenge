package easy;

//53
public class MaxSubArray {
	
	public int maxSubArray(int[] nums) {
		int n = nums.length;
        int sum = nums[0];
        int max = sum;
        for(int i = 1; i < n; i++){
            sum = nums[i] + (sum > 0 ? sum : 0);
            max = Math.max(max, sum);
        }
        return max;
    }
	
	public static void main(String[] arg) {
		int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		MaxSubArray m = new MaxSubArray();
		int result = m.maxSubArray(a);
		System.out.print(result);
	}
	
}
