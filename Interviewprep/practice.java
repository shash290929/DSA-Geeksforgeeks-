package Interviewprep;
import java.util.*;

public class practice {
	public static void main(String[] args) {
		int[] ar = {10,5,2,3,6};
		int sum=8;
		System.out.print(subsetsum(ar,sum,0,0));
	}
	static int subsetsum(int[] ar, int sum,int index,int res_sum) {
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
		return subsetsum(ar,sum,index+1,res_sum+ar[index])+subsetsum(ar,sum,index+1,res_sum);
	}
}
