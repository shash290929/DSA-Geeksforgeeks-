package Arrays;

public class leftrotatebyd {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7};
		int[] arr = rotatebyd3(ar,3);
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}
	static int[] rotateby1(int[] ar) {
		int res=ar[0];
		int i;
		for(i=1;i<ar.length;i++) {
			ar[i-1]=ar[i];
		}
		ar[i-1]=res;
		return ar;
	}
	//Naive method
	static int[] rotatebyd1(int[] ar,int d) {
		for(int i=0;i<d;i++) {
			rotateby1(ar);
		}
		return ar;
	}
	//Better solution
	static int[] rotatebyd2(int[] ar,int d) {
		int[] arr = new int[d];
		int i;
		for(i=0;i<d;i++) {
			arr[i]=ar[i];
		}
		for(;i<ar.length;i++) {
			ar[i-d]=ar[i];
		}
		for(int j=0;j<arr.length;j++) {
			ar[ar.length-d+j]=arr[j];
		}
		return ar;
	}
	//Best solution
	static int[] rotatebyd3(int[] ar,int d) {
		reverse(ar,0,d-1);
		reverse(ar,d,ar.length-1);
		reverse(ar,0,ar.length-1);
		return ar;
	}
	static int[] reverse(int[] ar,int low,int high) {
		while(low<high) {
			int res=ar[low];
			ar[low]=ar[high];
			ar[high]=res;
			low++;
			high--;
		}
		return ar;
	}
}
