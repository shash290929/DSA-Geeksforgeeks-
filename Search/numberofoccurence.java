package Search;

public class numberofoccurence {
	public static void main(String[] args) {
		int[] ar= {10,10,10,10,20,20,40};
		System.out.print(numofocc(ar,10));
	}
	static int numofocc(int[] ar,int x) {
		int first=firstoccurence(ar,x);
		int last=lastindex(ar,x);
		if(first==-1) {
			return 0;
		}
		return last-first+1;
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
