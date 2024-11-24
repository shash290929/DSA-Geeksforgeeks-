package sorting;

public class quicksortpartitionnaivemethod {
	public static void main(String[] args) {
		int[] ar = {3,8,6,12,10,7};
		partition(ar,ar.length-1,0,ar.length-1);
	}
	public static void partition(int[] ar,int p,int l, int h) {
		int key =ar[p];
		int n1 = h-l+1;
		int k=l;
		int[] arr = new int[n1];
		for(int i=l;i<=h;i++) {
			if(ar[i]<=key && i!=p) {
				arr[k]=ar[i];
				k++;
			}
		}
		arr[k]=key;
		k++;
		for(int i=l;i<=h;i++) {
			if(ar[i]>key) {
				arr[k]=ar[i];
				k++;
			}
		}
		for(int t=l;t<=h;t++) {
			ar[t]=arr[t-l];
		}
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
}
