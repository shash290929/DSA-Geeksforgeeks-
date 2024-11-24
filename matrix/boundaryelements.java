package matrix;

public class boundaryelements {
	public static void main(String[] args) {
		int[][] ar = {{1,2,3},{4,5,6},{7,8,9}};
		boundary(ar);
	}
	public static void boundary(int[][] ar) {
		for(int i=0;i<ar[0].length;i++) {
			System.out.print(ar[0][i]);
		}
		for(int i=1;i<ar.length;i++) {
			System.out.print(ar[i][ar[0].length-1]);
		}
		for(int i=ar[0].length-2;i>=0;i--) {
			System.out.print(ar[ar.length-1][i]);
		}
		for(int i=ar.length-2;i>0;i--) {
			System.out.print(ar[i][0]);
		}
	}
}
