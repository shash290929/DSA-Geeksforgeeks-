package sorting;

import java.util.*;

public class mergeintervals {
	public static void main(String[] args) { //SC -> O(nlogn) TC -> O(1) 
		ArrayList<Pair> p = new ArrayList<>();
		p.add(new Pair(7,9));
		p.add(new Pair(6,10));
		p.add(new Pair(4,5));
		p.add(new Pair(1,3));
		p.add(new Pair(2,4));
		Collections.sort(p,new sortbyfirst());
		
		for(Pair e:p) {
			System.out.print("("+e.first()+" "+e.second()+")");
		}
		System.out.println();
		int n= p.size();
		ArrayList<Pair> ans = new ArrayList<Pair>();
		for(int i=1;i<p.size();i++) {
			if(p.get(i).first()<=p.get(i-1).second()) {
				p.set(i,new Pair(p.get(i-1).first(),Math.max(p.get(i-1).second(),p.get(i).second())));
//				p.set(i-1,new Pair(0,0));
				p.remove(i-1);
				i--;
			}
			for(Pair e:p) {
				System.out.print("("+e.first()+" "+e.second()+")");
			}
			System.out.println();
		}
		
		for(Pair e:p) {
			System.out.print("("+e.first()+" "+e.second()+")");
		}
	}
}

class sortbyfirst implements Comparator<Pair>{
	public int compare(Pair p1,Pair p2) {
		return p1.a-p2.a;
	}
}

class Pair{
	int a;
	int b;
	public Pair(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public void show() {
		System.out.println(a+" "+b);
	}
	public int first() {
		return a;
	}
	public int second() {
		return b;
	}
}