package sorting;

public class mergesort {
	public static void main(String[] args) {
		int[] ar = {10,5,30,15,7};
		mergesort(ar,0,ar.length-1);
//		int[] ar = {10};
//		mergefunction(ar,0,0,0);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static void mergesort(int[] ar,int l,int r) {
		if(l<r) {
			int m = l+(r-l)/2;
			mergesort(ar,l,m);
			mergesort(ar,m+1,r);
			mergefunction(ar,l,m,r);
		}
	}
	public static void mergefunction(int[] ar,int l,int m,int r) {
		int n1= m-l+1;
		int n2 = r-m;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i=0;i<n1;i++) {
			left[i]=ar[l+i];
		}
		for(int j=0;j<n2;j++) {
			right[j]=ar[j+m+1];
		}
		int i=0;int j=0;int k=l;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				ar[k]=left[i];
				i++;
			}
			else {
				ar[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			ar[k]=left[i];
			i++;
			k++;
		}
		while(j<n2) {
			ar[k]=right[j];
			j++;
			k++;
		}
	}
}
