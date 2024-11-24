package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] ar = {5,4,3,2,1};
		bubblesort(ar,ar.length);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	static void bubblesort(int[] ar, int n) {
		for(int i=0;i<n-1;i++) {
			boolean swap =false;
			for(int j=0;j<n-1-i;j++) {
				if(ar[j]>ar[j+1]) {
					swap(ar,j,j+1);
					swap=true;
				}
			}
			if(swap==false) {
				break;
			}
		}
	}
	public static void swap(int[] ar, int a, int b) {
		int res = ar[a];
		ar[a]=ar[b];
		ar[b]=res;
	}
}
