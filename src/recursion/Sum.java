package recursion;

public class Sum {
	
	public static int sumOfNaturalNumbers(int n) {
		if(n == 0) {
			return 0;
		} else {
			return n + sumOfNaturalNumbers(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumOfNaturalNumbers(4));
		
	}

}