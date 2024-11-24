package sorting;
import java.util.Arrays;

public class minimumdiff {
	public static void main(String[] args) {
		int[] ar = {1,4,2,10,15,12};
		System.out.print(mindiff(ar));
	}
	public static int mindiff(int [] ar) {
		Arrays.sort(ar);
		int min =Integer.MAX_VALUE;
		for(int i=1;i<ar.length;i++) {
			min=Math.min(min,Math.abs(ar[i]-ar[i-1]));
		}
		return min;
	}
}
