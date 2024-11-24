package sorting;

public class quicksortpartitionlomutopartition {
	public static void main(String[] args) {
		int[] ar = {3,8,6,12,10,7};
		lomuto2(ar,4,0,ar.length-1);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static void lomuto1(int[] ar,int p,int l,int h) {// here we consider that pivot element is last element
		int pivot = ar[p];
		int i=l-1;
		for(int j=l;j<=h-1;j++) {
			if(ar[j]<pivot) {
				i++;
				swap(ar,i,j);
			}
		}
		swap(ar,i+1,h);
	}
	public static void swap(int[] ar,int i,int j) {
		int res = ar[i];
		ar[i]=ar[j];
		ar[j]=res;
	}
	public static void lomuto2(int[] ar,int p,int l,int h) {// here we consider that pivot element is not last element
		swap(ar,p,h);// we make the pivot at the last position by swapping and then following the 
		lomuto1(ar,ar.length-1,l,h);
	}
}

