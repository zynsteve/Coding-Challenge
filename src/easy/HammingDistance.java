package easy;

//461
public class HammingDistance {
	public int hammingDistance(int x, int y) {
        int count = 0;
        while(x >= 1 || y >= 1) {
            if(x % 2 != y % 2) count ++;
            x = x/2;
            y = y/2;
        }
        return count;
    }
}
