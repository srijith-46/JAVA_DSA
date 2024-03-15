package arrays;

public class ReverseArray {
	
	static void reverse(int[] ar) {
		int i = 0, j = ar.length-1;
		while(i<j)
		{
			int t = ar[i];
			ar[i] = ar[j];
			ar[j] = t;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		int[] ar = {2,3,4,5,6,7,8};
		for(int i=0 ; i<ar.length; i++) {
			System.out.print(ar[i]+ "");
		}
		reverse(ar);
		System.out.println();
		for(int i=0 ; i<ar.length; i++) {
			System.out.print(ar[i]+ "");
		}
		
	}

}
