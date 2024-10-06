package recursion;

public class ropecut {
	public static void main(String[] args) {
		System.out.print(ropecutt(9,2,2,2));
	}
	static int ropecutt(int n, int a,int b,int c) {
		if(n<0) {
			return -1;
		}
		if(n==0) {
			return 0;
		}
		int res=Math.max(ropecutt(n-a,a,b,c),Math.max(ropecutt(n-b,a,b,c), ropecutt(n-c,a,b,c)));
		if(res<0) {
			return res;
		}
		return res+1;
	}
}
