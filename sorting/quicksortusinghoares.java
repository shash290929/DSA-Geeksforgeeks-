package sorting;

public class quicksortusinghoares {
	public static void main(String[] args){
		int[] ar = {8,4,7,9,3,10,5};
		quicksort(ar,0,ar.length-1);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static void quicksort(int[] ar, int l,int h) {
		if(l<h) {
			int p = partiton(ar,l,h);
			quicksort(ar,l,p);
			quicksort(ar,p+1,h);
		}
	}
	public static int partiton(int[] ar,int l,int h) {
		int pivot=ar[l];
		int i=l-1;
		int j=h+1;
		while(true) {
			do {
				i++;
			}while(ar[i]<pivot);
			do {
				j--;
			}while(ar[j]>pivot);
			if(i>=j) {
				return j;
			}
			swap(ar,i,j);
		}
	}
	public static void swap(int[] ar,int i,int j) {
		int res = ar[i];
		ar[i]=ar[j];
		ar[j]=res;
	}
}
