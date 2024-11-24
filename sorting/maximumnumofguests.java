package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class maximumnumofguests {
	public static void main(String[] args) {
		int[] arr = {800,700,600,500};
		int[] dep = {840,820,830,530};
		System.out.println(max(arr,dep));
	}
	public static int max(int[] arr,int[] dep) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int res=1;
		int curr=1;
		int i=1;
		int j=0;
		int n=arr.length;
		while(i<n && j<n) {
			if(arr[i]<=dep[j]) {
				curr++;
				i++;
			}
			else if(arr[i]>dep[j]) {
				curr--;
				j++;
			}
			res=Math.max(res,curr);
		}
		return res;
	}
}


