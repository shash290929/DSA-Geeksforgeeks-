package Arrays;

public class Reverseanarray {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		int[] arr = reverse(ar,0,ar.length-1);
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}
	static int[] reverse(int[] ar, int i, int j) {
		while(i<j) {
			int res=ar[i];
			ar[i]=ar[j];
			ar[j]=res;
			i++;
			j--;
		}
		return ar;
	}
}
