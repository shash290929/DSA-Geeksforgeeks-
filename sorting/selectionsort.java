package sorting;

public class selectionsort {
	public static void main(String[] args) {
		int[] ar = {5,4,3,2,1};
		selectionsort(ar);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static void selectionsort(int[] ar) {
		for(int i=0;i<ar.length-1;i++) {
			int min=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[min]>ar[j]) {
					min=j;
				}
			}
			int res = ar[min];
			ar[min]=ar[i];
			ar[i]=res;
		}
	}
}
