package recursion;

public class q1toN {
	public static void main(String[] args) {
		q1toN(5);
		System.out.println();
		q1toN_1(5,1);
	}
	static void q1toN(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		q1toN(n-1);
		System.out.print(n+" ");
	}
	static void q1toN_1(int n,int val) {
		if(n==1) {
			System.out.print(val+" ");
			return;
		}
		System.out.print(val+" ");
		q1toN_1(n-1,val+1);
	}
}
