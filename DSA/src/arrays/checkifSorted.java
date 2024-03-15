package arrays;

public class checkifSorted {
	
	static boolean isSorted(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			if(ar[i] < ar[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {2,44,6,8,10,14};
		System.out.println(isSorted(ar));

	}

}
