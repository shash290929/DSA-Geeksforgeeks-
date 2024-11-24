package sorting;

public class quicksortpartitionhoaresmethod {
	public static void main(String[] args) {
		int[] ar = {5,3,8,4,2,7,1,10};
		System.out.println(hoarse(ar,0,0,ar.length-1));
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static int hoarse(int[] ar,int p,int l,int h) {
		int pivot = ar[p];
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
