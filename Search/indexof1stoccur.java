package Search;

public class indexof1stoccur {
	public static void main(String[] args) {
		int[] ar= {10,10,10,10,20,20,40};
		System.out.print(firstoccurence(ar,10));
	}
	static int firstoccurence(int[] ar,int x) {
		int start=0;
		int end=ar.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(ar[mid]==x && (mid==0 || ar[mid-1]!=x)) {
				return mid;
			}
			if(ar[mid]>=x) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
}
