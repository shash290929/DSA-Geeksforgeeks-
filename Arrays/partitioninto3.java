package Arrays;

public class partitioninto3 {
	public static void main(String[] arg) {
		int[] ar = {0,2,1,-6,6,-7,9,1,2,0,1};
		System.out.print(prefixsum(ar));
	}
	static boolean prefixsum(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		if(sum%3!=0) {
			return false;
		}
		int s1 = sum/3;
		int s2 = s1*2;
		boolean check1=false;
		boolean check2=false;
		int presum=0;
		for(int i=0;i<ar.length;i++) {
			presum+=ar[i];
			if(presum==s1 && check1==false) {
				check1=true;
			}
			else if(presum==s2 && check1 && check2==false) {
				return true;
			}
		}
		return false;
	}
}
