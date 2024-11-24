package String;

public class checkifsubsequence {
	public static void main(String[] args) {
		  String s1 = "ahbgcd";
		  String s2 = "acb";
		  System.out.println(check1(s1,s2));
		  System.out.println(check2(s1,s2,0,0));
	}
	public static boolean check1(String s1, String s2) {
		int i = 0;
		int j = 0;
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)==s2.charAt(j))
				j++;
			i++;
		}
		if(j==s2.length())
			return true;
		return false;
	}
	
	public static boolean check2(String s1, String s2,int i,int j) {
		if(j==s2.length())
			return true;
		else if(i==s1.length())
			return false;
		
		if(s1.charAt(i)==s2.charAt(j))
			return check2(s1,s2,i+1,j+1);
		return check2(s1,s2,i+1,j);
	}
}
