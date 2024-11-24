package sorting;

public class seggregateposneg {
	public static void main(String[] args) {
		int[] ar = {15,-3,-2,18};
		seggregate(ar);
		for(int e:ar) {
			System.out.print(e+" ");
		}
	}
	public static void seggregate(int[] ar) {
		int l=-1;
		int h=ar.length;
		while(true) {
			do {
				l++;
			}while(ar[l]<0);
			do {
				h--;
			}while(ar[h]>0);
			if(l>=h) {
				return;
			}
			swap(ar,l,h);
		}
	}
	public static void swap(int[] ar,int i,int j) {
		int res = ar[i];
		ar[i]=ar[j];
		ar[j]=res;
	}
}
