package Search;

public class BinarySearch {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60};
		System.out.println(search2(ar,10));
	}
	//linear search
	static int search1(int[] ar,int x) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==x) {
				return i;
			}
		}
		return -1;
	}
	//iterative method
	static int search2(int[] ar,int x) {
		int start=0;
		int end=ar.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(ar[mid]==x) {
				return mid;
			}
			else if(ar[mid]>x) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	//recursive solution
	static int search3(int[] ar,int x,int start,int end) {
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(ar[mid]==x) {
			return mid;
		}
		if(ar[mid]>x) {
			return search3(ar,x,start,mid-1);
		}
		return search3(ar,x,mid+1,end);
	}
}
