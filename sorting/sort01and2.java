package sorting;

public class sort01and2 {
	public static void main(String[] args) {
		int[] ar = {0,1,0,2,1,2};
		sort(ar);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static void sort(int[] ar) {
		int i=0;
		int mid=0;
		int j=ar.length-1;
		while(mid<=j) {
			if(ar[mid]==0) {
				swap(ar,mid,i);
				i++;
				mid++;
			}
			else if(ar[mid]==1) {
				mid++;
			}
			else {
				swap(ar,mid,j);
				j--;
			}
		}
	}
	public static void swap(int[] ar,int i,int j) {
		int res =ar[i];
		ar[i]=ar[j];
		ar[j]=res;
	}
}
