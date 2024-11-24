package sorting;

public class kthsmallest {
	public static void main(String[] args) {
		int[] ar = {3,2,1,5,6,4};
		System.out.print(kthsmallest(ar,5,0,ar.length-1));
	}
	public static int kthsmallest(int[] ar,int k,int l,int h) {
		int p = partition(ar,l,h);
		if(p == (k-1)) {
			return ar[p];
		}
		else if(p<(k-1)) {
			return kthsmallest(ar,k,p+1,h);
		}
		else {
			return kthsmallest(ar,k,l,p-1);
		}
	}
	public static int partition(int[] ar,int l,int h) {
		int i=l-1;
		int pivot = ar[h];
		for(int j=l;j<h;j++) {
			if(ar[j]<pivot) {
				i++;
				swap(ar,i,j);
			}
		}
		swap(ar,i+1,h);
		return i+1;
	}
	public static void swap(int[] ar,int i,int j) {
		int res = ar[i];
		ar[i] = ar[j];
		ar[j] = res;
	}
}

