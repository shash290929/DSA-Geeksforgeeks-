package HashSet;
import java.util.*;

public class intersectionofunsortedarray {
	public static void main(String[] args) {
		int[] ar1 = {10,15,20,25,30,35,40};
		int[] ar2 = {30,5,15,80};
		intersection(ar1,ar2);
	}
	public static void intersection(int[] ar1,int[] ar2) {
		HashSet<Integer> lm = new HashSet<>();
		for(int i=0;i<ar2.length;i++) {
			lm.add(ar2[i]);
		}
		for(int i=0;i<ar1.length;i++) {
			if(lm.contains(ar1[i])) {
				System.out.print(ar1[i]+" ");
			}
		}
	}
}
