package Arrays;

public class traprainingwater {
	public static void main(String[] args) {
		int[] ar= {2,0,2};
		System.out.print(trapwater(ar));
	}
	static int trapwater(int[] ar) {
		int trap=0;
		int n= ar.length;
		int[] lmaxar = new int[n];
		int[] rmaxar = new int[n];
		int lmax = Integer.MIN_VALUE;
		int rmax = Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>lmax) {
				lmax=ar[i];
			}
			lmaxar[i]=lmax;
			if(ar[n-1-i]>rmax) {
				rmax=ar[n-1-i];
			}
			rmaxar[n-1-i]=rmax;
		}
		for(int i=1;i<n-1;i++) {
			int trapwt = Math.min(lmaxar[i], rmaxar[i]) - ar[i];
			if(trapwt>0) {
				trap+=trapwt;
			}
		}
		return trap;
	}
}
