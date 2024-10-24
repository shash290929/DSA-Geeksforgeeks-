package Search;

public class squareroot {
	public static void main(String[] args) {
		System.out.print(srt(10));
	}
	static int srt(int n) {
		int start=1;
		int end=n;
		int ans=-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(mid*mid==n) {
				return mid;
			}
			else if(mid*mid > n) {
				end=mid-1;
			}
			else {
				ans=mid;
				start=mid+1;
			}
		}
		return ans;
	}
}
