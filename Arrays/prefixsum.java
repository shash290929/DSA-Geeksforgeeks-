package Arrays;

public class prefixsum {
	public static void main(String[] args) {
		int[] ar = {2,8,3,9,6,5,4};
		System.out.println(getSum(ar,0,2));
		System.out.println(getSum(ar,1,3));
		System.out.println(getSum(ar,2,6));
	}
	static int[] sum(int[] ar) {
		int[] arr = new int[ar.length];
		arr[0]=ar[0];
		for(int i=1;i<ar.length;i++) {
			arr[i]=arr[i-1]+ar[i];
		}
		return arr;
	}
	//to get the queries in 0(1)
	static int getSum(int[] ar,int l, int r) {
		int[] arr = sum(ar);
		if(l==0) {
			return arr[r];
		}
		return arr[r]-arr[l-1];
	}
	// regular method
	static int getSum1(int[] ar,int l,int r) {
		int sum;
		if(l==0) {
			sum=Sum(ar,r);
		}
		else {
			return Sum(ar,r)-Sum(ar,l-1);
		}
		return sum;
	}
	static int Sum(int[] ar,int r) {
		int sum=0;
		for(int i=0;i<=r;i++) {
			sum+=ar[i];
		}
		return sum;
	}
}
