package zusatzbeispiele;


public class Division {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
	 
	
	
public static double divide(int x, int y) {
	if (y > 0) {
		return x / y;
	} else {
		throw new ArithmeticException();
	}
}
public static void main(String[] args) {
	try {
		System.out.println(ANSI_GREEN+divide(12,2));
	} catch (ArithmeticException a) {
		System.out.println(ANSI_RED + "Kein Division durch 0!");
	}
}

}
	
	
	
	

