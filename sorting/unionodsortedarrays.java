package sorting;

public class unionodsortedarrays {
	public static void main(String[] args) {
		int[] a = {3,5,10,10,10,15,15,20};
		int[] b = {5,10,10,15};
		union(a,b);
	}
	static void union(int[] ar1,int[] ar2) {
		int i=0;
		int j=0;
		int n1 = ar1.length;
		int n2 = ar2.length;
		while(i<n1 && j<n2) {
			if(i>0 && ar1[i]==ar1[i-1]) {
				i++;
				continue;
			}
			if(j>0 && ar2[j]==ar2[j-1]) {
				j++;
				continue;
			}
			if(ar1[i]==ar2[j]) {
				System.out.print(ar1[i]+" ");
				i++;
				j++;
			}
			else if(ar1[i]<ar2[j]) {
				System.out.print(ar1[i]+" ");
				i++;
			}
			else {
				System.out.print(ar2[j]+" ");
				j++;
			}
		}
		while(i<n1) {
			while(i>0 && ar1[i]==ar1[i-1]) {
				i++;
			}
			System.out.print(ar1[i]+" ");
			i++;
		}
		while(j<n2) {
			while(j>0 && ar2[j]==ar2[j-1]) {
				j++;
			}
			System.out.print(ar2[j]+" ");
			j++;
		}
	}
}
