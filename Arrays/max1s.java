package Arrays;

public class max1s {
	public static void main(String[] args) {
		int[] ar = {1,0,1,1,1,1,0,1,1,0,0,1,1};
		System.out.print(max1ss(ar));
	}
	static int max1ss(int[] ar) {
		int freq=1;
		int res=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==1) {
				freq++;
			}
			else {
				freq=0;
			}
			res = Math.max(freq, res);
		}
		return res;
	}
}
