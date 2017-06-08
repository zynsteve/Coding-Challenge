package easy;

//191
public class NumberOfOneBits {

	public int hammingWeight(int n) {
		int ones = 0;
    	while(n != 0) {
    		ones = ones + (n & 1);
    		n = n>>>1;
    	}
    	return ones;
    }
	
	public static void main(String[] args) {
		NumberOfOneBits n = new NumberOfOneBits();
		System.out.println(n.hammingWeight(128));
	}

}
