package recursion;

public class Permutation {
	public static void main(String[] args) {
//		System.out.print(swap(""))
		StringBuilder s = new StringBuilder("ABC");
		pos(s,0);
	}
	static void swap(StringBuilder sb, int i, int j) {
		sb.setCharAt(i, sb.charAt(j));
		sb.setCharAt(j, sb.charAt(i));
		//System.out.print(sb.toString());
	}
	static void pos(StringBuilder s,int i) {
		if(i==s.length()-1) {
			System.out.println(s);
			return;
		}
		for(int j=i;j<s.length();j++) {
			swap(s,i,j);
			pos(s,i+1);
			swap(s,i,j);
		}
	}
}
