package recursion;

public class sumofdigits {
	public static void main(String[] args) {
		System.out.print(sumofdigit(873,0));
	}
	static int sumofdigit(int n,int sum) {
		if(n<=9) {
			return sum+n;
		}
		return sumofdigit(n/10,sum+(n%10));
	}
}
