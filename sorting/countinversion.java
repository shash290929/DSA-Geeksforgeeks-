package sorting;

public class countinversion {
	public static void main(String[] args) {
		int[] ar = {1,2,0};
		System.out.print(countinversion(ar,0,ar.length-1));
	}
	public static int countinversion(int[] ar1,int l,int r) {
		int res=0;
		if(l<r) {
			int m = l+(r-l)/2;
			res+=countinversion(ar1,l,m);
			res+=countinversion(ar1,m+1,r);
			res+=mergeandcount(ar1,l,m,r);
		}
		return res;
	}
	public static int mergeandcount(int[] ar1,int l,int m,int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int[] left =new int[n1];
		int[] right = new int[n2];
		for(int i=0;i<n1;i++) {
			left[i]=ar1[l+i];
		}
		for(int i=0;i<n2;i++) {
			right[i]=ar1[m+1+i];
		}
		int i=0;
		int j=0;
		int count=0;
		int k=l;
		while(i < n1 && j<n2) {
			if(left[i]<=right[j]) {
				ar1[k]=left[i];
				i++;
			}
			else {
				count=count+(n1-i);
				ar1[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			ar1[k]=left[i];
			i++;
			k++;
		}
		while(j<n2) {
			ar1[k]=right[j];
			j++;
			k++;
		}
		return count;
	}
}
