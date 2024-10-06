package recursion;

public class Towerofhanoi {
	public static void main(String[] args){
		TOH(3,"A","B","C");
	}
	static void TOH(int n, String from_rod, String aux_rod, String to_rod) {
		if(n==0) {
			return;
		}
		TOH(n-1,from_rod,to_rod,aux_rod);
		System.out.println("Move disc "+n+" from "+from_rod+" to "+to_rod);
		TOH(n-1,aux_rod,from_rod,to_rod);
	}
	
}
