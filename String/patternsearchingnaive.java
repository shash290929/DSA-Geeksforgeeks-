package String;

public class patternsearchingnaive {
	public static void main(String[] args) {
		String text = "AAAAA";
		String pat = "AAA";
		search(text,pat);
	}
	public static void search(String text,String pat) {
		int k =pat.length();
		int start=0;
		for(int end = k;end<=text.length();end++) {
			if(text.substring(start,end).equals(pat)) {
				System.out.print(start+" ");
			}
			start++;
		}
	}
}
