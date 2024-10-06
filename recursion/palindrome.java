package recursion;

public class palindrome {
	public static void main(String[] args) {
		String s = "geeks";
		System.out.print(palindrome(s,0,s.length()-1));
	}
	static boolean palindrome(String s,int start,int end) {
		if(start>=end) {
			return true;
		}
		if(s.charAt(start)==s.charAt(end)) {
			return palindrome(s,start+1,end-1);
		}
		return false;
	}
}
