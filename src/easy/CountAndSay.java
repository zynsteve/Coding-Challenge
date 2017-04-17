package easy;

//38
public class CountAndSay {
    
	public String countAndSay(int n) {
        if (n < 1) {
            return null;
        }
        String result = "1";
        for (int i = 2; i <= n ; i ++) {
            result = helper(result);
        }
        return result;
    }

    public String helper(String str) {
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count ++;
            }
            else {
                builder.append(count);
                builder.append(str.charAt(i - 1));
                count = 1;
            }
        }
        builder.append(count);
        builder.append(str.charAt(str.length() - 1));
        return builder.toString();
    }
	     
	public static void main(String[] arg) {
		CountAndSay c = new CountAndSay();
		System.out.print(c.countAndSay(5));
	}
	
}
