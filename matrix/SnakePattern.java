package matrix;

public class SnakePattern {
	public static void main(String[] args) {
		int[][] ar = {{1,2,3},{4,5,6},{7,8,9}};
		SnakePattern(ar);
	}
	public static void SnakePattern(int[][] ar) {
		for(int i=0;i<ar.length;i++) {
			if(i%2==0) {
				for(int j=0;j<ar[i].length;j++) {
					System.out.print(ar[i][j]);
				}
			}
			else {
				for(int j=ar.length-1;j>=0;j--) {
					System.out.print(ar[i][j]);
				}
			}
			System.out.println();
		}
	}
}
