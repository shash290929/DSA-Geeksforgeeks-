package Arrays;

public class maximumdiff {
	public static void main(String[] args) {
		int[] ar = {30,20,10};
		System.out.print(maxdiff1(ar));
	}
	//good method but doesnot handle descending array
	static void maxdiff(int[] ar) {
		int[] lar = new int[ar.length];
		int[] small = new int[ar.length];
		lar[lar.length-1]=ar[ar.length-1];
		small[0]=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]<small[i-1]) {
				small[i]=ar[i];
			}
			else {
				small[i]=small[i-1];
			}
			if(ar[ar.length-1-i]>lar[ar.length-i]) {
				lar[lar.length-1-i]=ar[ar.length-1-i];
			}
			else {
				lar[lar.length-1-i]=lar[lar.length-i];
			}
		}
		for(int e: small) {
			System.out.print(e+" ");
		}
		System.out.println();
		for(int e:lar){
			System.out.print(e+" ");
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<ar.length-1;i++) {
			int dif=lar[i]-small[i];
			if(dif>max && lar[i]!=small[i]) {
				max=dif;
			}
		}
		System.out.println();
		System.out.print(max);
	}
	//better method
	static int maxdiff1(int[] ar) {
		int res =ar[1]-ar[0];
		int min = ar[0];
		for(int i=1;i<ar.length;i++) {
			res=Math.max(res, ar[i]-min);
			min=Math.min(min, ar[i]);
		}
		return res;
	}
}
