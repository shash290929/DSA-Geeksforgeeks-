package sorting;

public class insertionsort {
	public static void main(String[] args) {
		int[] ar = {5,4,3,2,1};
		insertionsort(ar);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static void insertionsort(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			int j=i-1;
			int key=ar[i];
			while(j>=0 && ar[j]>key) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
	}
}
