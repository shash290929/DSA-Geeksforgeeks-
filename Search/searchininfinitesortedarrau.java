package Search;

public class searchininfinitesortedarrau {
	public static void main(String[] args) {
		int arr[] = new int[]{3, 5, 7, 9, 10, 90, 
                100, 130, 140, 160, 170};
		boolean ans = check(arr,101);
		System.out.print(ans);
	}
	static boolean check(int[] ar,int x) {
		int i=1;
		while(ar[i]<x) {
			if(ar[i]==x) {
				return true;
			}
			System.out.print(i);
			i=i*2;
		}
		System.out.println(i);
		return search(ar,(i/2)+1,i-1,x);
	}
	static boolean search(int[] ar,int start,int end,int x) {
		System.out.print(start+" "+end);
		int low =start;
		int high =end;
		while(low<=high){
			int mid=(low+high)/2;
			if(ar[mid]==x) {
				return true;
			}
			else if(ar[mid]>x) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return false;
	}
}
