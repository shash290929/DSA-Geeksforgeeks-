package sorting;
import java.util.Arrays;

public class chocolatedistribution {
	public static void main(String[] args) {
		int[] ar = {3,4,1,9,56,7,9,12};
		System.out.print(chocdist(ar,5));
	}
	public static int chocdist(int[] ar,int m) {
		Arrays.sort(ar);
		int i=0;
		int n=ar.length;
		int min = Integer.MAX_VALUE;
		while(i<=(n-m)) {
			min = Math.min(min,Math.abs(ar[i]-ar[i+m-1]));
			i++;
		}
		return min;
	}
}
