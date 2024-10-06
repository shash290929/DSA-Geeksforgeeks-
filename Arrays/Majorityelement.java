package Arrays;
import java.util.*;

public class Majorityelement {
	public static void main(String[] args) {
		int[] ar = {3,7,4,7,7,5};
		System.out.println(majority1(ar));
		System.out.print(majority2(ar));
	}
	//best method O(n) without any auxilary space
	static int majority2(int[] ar) {
		int res =possiblecandidateformajority(ar);
		int n=ar.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(ar[i]==ar[res]) {
				count++;
			}
		}
		if(count>(n/2)) {
			return res;
		}
		return -1;
	}
	static int possiblecandidateformajority(int[] ar) {
		int res=0;
		int count=1;
		for(int i=1;i<ar.length;i++) {
			if(ar[i]==ar[res]) {
				count++;
			}
			else {
				count--;
			}
			if(count==0) {
				res=i;
				count=1;
			}
		}
		return res; // potential majority
	}
	//using hashmap
	static boolean majority1(int[] ar){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++) {
			if(hm.containsKey(ar[i])) {
				hm.put(ar[i], hm.get(ar[i])+1);
			}
			else {
				hm.put(ar[i],1);
			}
		}
		int n=ar.length;
		for(HashMap.Entry<Integer,Integer> e:hm.entrySet()) {
//			System.out.println(e.getKey()+" "+e.getValue());
			if(e.getValue()>(n/2)) {
				return true;
			}
		}
		return false;
	}
}
