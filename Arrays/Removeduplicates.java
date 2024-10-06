package Arrays;
import java.util.*;

public class Removeduplicates {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int[] arr = {10,20,20,30,30,30,40,40,40,50,50};
		for(int e:arr) {
			ar.add(e);
		}
		System.out.print(ar);
		int k=3;
		System.out.print(removeduplicates(ar));
	}
	//remove duplicates from 
	static ArrayList<Integer> removeduplicates(ArrayList<Integer> ar){
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		int res=ar.get(0);
		ar1.add(res);
		for(int i=1;i<ar.size();i++) {
			if(ar.get(i)==res) {
				continue;
			}
			else {
				res=ar.get(i);
				ar1.add(res);
			}
		}
		return ar1;
	}
}
