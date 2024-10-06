package recursion;
import java.util.*;

public class subsetsum {
	public static void main(String[] args) {
		int[] ar = {10,5,2,3,6};
		System.out.print(sumofsubset(ar,8,0,0));
	}
	static int sumofsubset(int[] ar,int sum,int index,int res_sum) {
		if(index==ar.length) {
			if(res_sum==sum) {
				return 1;
			}
			else {
				return 0;
			}
		}
		if(res_sum>sum) {
			return 0;
		}
		return(sumofsubset(ar,sum,index+1,res_sum)+sumofsubset(ar,sum,index+1,res_sum+ar[index]));
		
	}
}
