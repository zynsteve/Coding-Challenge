package easy;

//168
public class ConvertToTitle {
	
	public String convertToTitle(int n) {
		String result = "";
        while(n != 0) {
            result = (char) ((n - 1) % 26 + 'A') + result;
            n = (n - 1) / 26;
        }
        return result;
    }
	
	public static void main(String[] arg) {
		ConvertToTitle c = new ConvertToTitle();
		System.out.print(c.convertToTitle(28));
	}
	
}
