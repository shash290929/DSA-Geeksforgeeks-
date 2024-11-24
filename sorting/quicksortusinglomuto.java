package sorting;

public class quicksortusinglomuto {
	public static void main(String[] args) {
		int[] ar = {8,4,7,9,3,10,5};
		quicksort(ar,0,ar.length-1);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static void quicksort(int[] ar,int l,int h) {
		if(l<h) {
			int p = partition(ar,l,h);
			quicksort(ar,l,p-1);
			quicksort(ar,p+1,h);
		}
	}
	public static int partition(int[] ar, int l,int h) {
		int pivot = ar[h];
		int i=l-1;
		for(int j=l;j<h;j++) {
			if(ar[j]<pivot) {
				i++;
				swap(ar,j,i);
			}
		}
		swap(ar,i+1,h);
		return i+1;
	}
	public static void swap(int[] ar,int x,int y) {
		int res =ar[x];
		ar[x]=ar[y];
		ar[y]=res;
	}
}
