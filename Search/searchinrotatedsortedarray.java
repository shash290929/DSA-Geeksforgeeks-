package Search;

public class searchinrotatedsortedarray {
	public static void main(String[] args) {
		int[] ar = {4,5,6,7,0,1,2};
		System.out.print(search(ar,1));
	}
	static int search(int[] ar,int x) {
		int low=0;
		int high=ar.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(ar[mid]==x) {
				return mid;
			}
			else if(ar[0]<=ar[mid]) {
				if(x>=ar[0] && x<ar[mid]) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
			else {
				if(x<=ar[ar.length-1] && x>ar[mid]) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
		}
		return -1;
	}
}
