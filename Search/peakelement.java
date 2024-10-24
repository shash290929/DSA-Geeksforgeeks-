package Search;

public class peakelement {
	public static void main(String[] args) {
		int[] ar = {90,80,100};
		System.out.print(peak1(ar,ar.length));
	}
	static int peak2(int[] ar,int n) {
		int low=0;
		int high=ar.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if((mid==0 || ar[mid-1]<=ar[mid]) && (mid==n-1 || ar[mid+1]<=ar[mid])){
				return mid;
			}
			else if(mid>0 && ar[mid-1]>=ar[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	static int peak1(int[] ar,int n) {
		int max1=ar[n-1];
		int max2=ar[n-1];
		for(int i=n-2;i>=0;i--) {
			max1=Math.max(max1, ar[i]);
			if(max1==max2) {
				return max1;
			}
			else {
				max2=ar[i];
			}
		}
		if(ar[0]>ar[1]) {
			return ar[0];
		}
		return -1;
	}
}
