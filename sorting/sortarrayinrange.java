package sorting;

public class sortarrayinrange {
	public static void main(String[] args) {
		int[] ar = {10,5,6,3,20,9,40};
		int[] range = {5,10};
		sort(ar,range);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static void sort(int[] ar,int[] range) {
		int l=range[0];
		int r=range[1];
		int mid=0;
		int i=0;
		int j=ar.length-1;
		while(mid<=j) {
			if(ar[mid]<l) {
				swap(ar,mid,i);
				i++;
				mid++;
			}
			else if(ar[mid]>=l && ar[mid]<=r) {
				mid++;
			}
			else {
				swap(ar,mid,j);
				j--;
			}
		}
	}
	public static void swap(int[] ar,int i,int j) {
		int res = ar[i];
		ar[i] = ar[j];
		ar[j] = res;
	}
}
