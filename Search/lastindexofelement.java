package Search;

public class lastindexofelement {
	public static void main(String[] args) {
		int[] ar= {10,10,10,10,20,20,40};
		System.out.print(lastindex(ar,10));
	}
	static int lastindex(int[] ar,int x) {
		int start=0;
		int end=ar.length-1;
		while(start<=end) {
			int mid = end +(start-end)/2;
			if(ar[mid]==x && (mid==ar.length-1 || ar[mid+1]!=x)) {
				return mid;
			}
			if(ar[mid]<=x) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}
}
