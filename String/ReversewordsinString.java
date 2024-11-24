package String;

public class ReversewordsinString {
	public static void main(String[] args) {
		String s ="My Name is Shashank Raj";
		char[] ar = s.toCharArray();
		int i=0;
		int j=ar.length-1;
		while(i<j) {
			char t = ar[i];
			ar[i]=ar[j];
			ar[j]=t;
			i++;
			j--;
		}
		String s1 = new String(ar);
		System.out.print(s1);
		
		
//		StringBuilder sb = new StringBuilder("GeeksforGeeks");
//		reverse(sb,0,sb.length()-1);
//		System.out.print(sb);
		
//		String s ="My Name is Shashank Raj";
//		String s1 = reverseWords(s);
//		System.out.print(s1);
	}
	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder(s);
		int start=0;
		for(int end=0;end<sb.length();end++) {
			if(sb.charAt(end)==' ') {
				reverse(sb,start,end-1);
				start=end+1;
			}
		}
		reverse(sb,start,sb.length()-1);
		reverse(sb,0,sb.length()-1);
		s = sb.toString();
		return s;
	}
	public static void reverse(StringBuilder sb,int start,int end) {
		while(start<end) {
			char c =sb.charAt(start);
			sb.setCharAt(start,sb.charAt(end));
			sb.setCharAt(end,c);
			start++;
			end--;
		}
	}
}
