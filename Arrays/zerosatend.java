package Arrays;
import java.util.*;

public class zerosatend {
	public static void main(String[] args) {
		int[] ar = {1,0,2,0,4,0,5,0,0,6};
		int[] arr = move(ar);
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}
	static int[] swap(int[] ar,int i,int j) {
		int res= ar[i];
		ar[i]=ar[j];
		ar[j]=res;
		return ar;
	}
	static int[] move(int[] ar){
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				swap(ar,i,count);
				count++;
			}
		}
		return ar;
	}
}
