package HashSet;
import java.util.*;

public class distinctelementinwindow {
	public static void main(String[] args) {
		int[] ar = {7,6,3,2,6,7,2,6,3,3,1};
		int k=4;
		count(ar,k);
	}
	public static void count(int[] ar,int k) {
		HashMap<Integer,Integer> hs = new HashMap<>(); 
		for(int i=0;i<k;i++) {
			hs.put(ar[i],hs.getOrDefault(ar[i],0)+1);
		}
		System.out.print(hs.size()+" ");
		for(int i=k;i<ar.length;i++) {
			if(hs.get(ar[i-k])==1)
				hs.remove(ar[i-k]);
			else
				hs.put(ar[i-k],hs.get(ar[i-k])-1);
			hs.put(ar[i],hs.getOrDefault(ar[i],0)+1);
			System.out.print(hs.size()+" ");
		}
	}
}
