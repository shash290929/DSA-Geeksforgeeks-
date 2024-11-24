package sorting;

public class mergefunction {
	public static void main(String[] args) {
		int[] ar = {10,15};
		int[] arr =mergefunc(ar,0,0,1);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static int[] mergefunc(int[] ar,int low,int mid, int high) {
		int n1 = mid-low+1;
		int n2 = high-mid;
		int[] left =  new int[n1];
		int[] right = new int[n2];
		for(int i=0;i<n1;i++) {
			left[i]=ar[i];
		}
		for(int i=(mid+1);i<ar.length;i++) {
			//System.out.print(i+" "+(mid+1));
			right[i-(mid+1)]=ar[i];
		}
		sort(ar,left,right);
		return ar;
	}
	public static void sort(int[] arr,int [] ar1,int[] ar2) {
		int i=0;
		int j=0;
		int k=0;
		while(i< ar1.length && j<ar2.length) {
			if(ar1[i]<=ar2[j]) {
				arr[k]=ar1[i];
				i++;
			}
			else {
				arr[k]=ar2[j];
				j++;
			}
			k++;
		}
		while(i<ar1.length) {
			arr[k]=ar1[i];
			i++;
			k++;
		}
		while(j<ar2.length) {
			arr[k]=ar2[j];
			j++;
			k++;
		}
	}
}
