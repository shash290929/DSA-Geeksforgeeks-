package HashSet;
import java.util.*;

public class longestcommonspanbetween2arrays {
	public static void main(String[] args) {
		int[] ar1 = {0,1,0,0,0,0};
		int[] ar2 = {1,0,1,0,0,1};
		System.out.print(longest(ar1,ar2));
	}
	public static int longest(int[] ar1,int[] ar2) {
		int[] temp = new int[ar1.length];
		for(int i=0;i<ar1.length;i++) {
			temp[i]=ar1[i]-ar2[i];
		}
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0,-1);
		int res=0;
		int max_len =0;
		int sum=0;
		for(int i=0;i<temp.length;i++) {
			sum+=temp[i];
			if(hm.containsKey(sum)) {
				res = i-hm.get(sum);
			}
			else {
				hm.put(sum,i);
			}
			max_len = Math.max(max_len,res);
		}
		return max_len;
	}
}
