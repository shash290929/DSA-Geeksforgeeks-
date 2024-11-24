package String;

public class leftmostrepeating {
	public static void main(String[] args) {
		String str ="geeksforgeeks";
		System.out.println(leftmost1(str));
		System.out.print(leftmost2(str));
	}
	public static int leftmost1(String s) {
		int[] arr = new int[26];
		int ind=-1;
		for(int i=s.length()-1;i>=0;i--) {
			if(arr[s.charAt(i)-'a']>0) {
				ind=i;	
			}
			arr[s.charAt(i)-'a']++;
		}
		return ind;
	}
	public static int leftmost2(String s) {
		int[] ar = new int[26];
		for(int i=0;i<26;i++) {
			ar[i]=-1;
		}
		int res= Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++) {
			if(ar[s.charAt(i)-'a']==-1)
				ar[s.charAt(i)-'a']=i;
			else
				res=Math.min(res,ar[s.charAt(i)-'a']);
		}
		return res;
	}
}
