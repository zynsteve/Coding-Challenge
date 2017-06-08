package easy;

//202
public class HappyNumber {

	public boolean isHappy(int n) {
		int count = 0;
        while(n != 1) {
            n = convert(n);    
            count ++;
            if(count > 10) {
            	return false;
            }
        }
        return true;
    }
    
    public int convert(int n) {
        int[] digit = new int[16];
        int i = 0;
        while(n != 0) {
            digit[i] = n % 10;
            n = n / 10;
            i ++;
        }
        for(int k : digit) {
            n = n + k * k;
        }
        return n;
    }
	
	public static void main(String[] args) {
		HappyNumber h = new HappyNumber();
		System.out.println(h.isHappy(2));
	}

}
