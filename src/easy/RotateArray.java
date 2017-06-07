package easy;

import java.util.LinkedList;
import java.util.Queue;

//189
public class RotateArray {

	public void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		Queue<Integer> q = new LinkedList<Integer>();
        for(int i = n - k; i < n; i ++) {
        	q.add(nums[i]);
        }
        for(int i = 0; i < n - k; i ++) {
        	q.add(nums[i]);
        }
        for(int i = 0; i < n; i++) {
        	nums[i] = q.poll(); 
        }
	} 
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		RotateArray r = new RotateArray();
		r.rotate(nums, 8);
		for(int i = 0; i < nums.length; i ++) {
			System.out.print(nums[i]);
		}
	}

}
