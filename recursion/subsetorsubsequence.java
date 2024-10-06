package recursion;

public class subsetorsubsequence {
	public static void main(String[] args) {
		subset("ABC","",0);
	}
	static void subset(String s, String res,int index) {
		if(index==s.length()) {
			if(res!="") {
				System.out.println(res);
			}
			return;
		}
		subset(s,res,index+1);
		subset(s,res+s.charAt(index),index+1);
	}
}
