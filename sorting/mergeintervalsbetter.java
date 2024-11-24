package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class mergeintervalsbetter {
	public static void main(String[] args) {
		int[][] ar = {{5,10},{3,15},{18,30},{2,7}};
		Arrays.sort(ar,new sortbyfirstval());
		for(int[] e1:ar) {
			for(int e2:e1) {
				System.out.print(e2+" ");
			}
			System.out.println();
		}
		System.out.println("sorted");
		
		int res = 0;
		for(int i=1;i<ar.length;i++) {
			if(ar[i][0]<=ar[res][1]) {
				ar[res][1]=Math.max(ar[i][1],ar[res][1]);
			}
			else {
				res++;
				ar[res]=ar[i];
			}
		}
		for(int j=0;j<=res;j++) {
			System.out.println(ar[j][0]+" "+ar[j][1]);
		}
	}
}

class sortbyfirstval implements Comparator<int[]>{
		public int compare(int[] a,int[] b) {
			return a[0]-b[0];
	}
}
