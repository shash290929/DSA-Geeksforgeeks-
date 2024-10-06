package recursion;

public class Sumofnatural {
	public static void main(String[] args) {
		System.out.print(sum(5));
		System.out.println();
		System.out.print(sum1(5,0));
	}
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}
	static int sum1(int n, int val) {
		if(n==1) {
			return val+1;
		}
		return sum1(n-1,val+n);
	}
}
