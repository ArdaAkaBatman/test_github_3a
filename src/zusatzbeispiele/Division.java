package zusatzbeispiele;


public class Division {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
	
	    public static double divide(int x, int y) {
	        try {
	            return x / y;
	        } catch (ArithmeticException e) {
	        	System.out.println(ANSI_RED + "Division durch Null ist nicht erlaubt! Bitte einen anderen Wert verwenden!" + ANSI_RESET);
	            return Double.NaN; 
	        }
	    }
	    
	    public static void main(String[] args) {
	        Double result1 = divide(10, 2);    
	        if (result1 != null) {
	            System.out.println("Das Ergebnis der Division ist: " + result1);
	        }

	        Double result2 = divide(2100, 0);
	        if (result2 != null) {
	            System.out.println("Das Ergebnis der Division ist: " + result2);
	        }
	    }
	}
	
	
	
	
	
	
	

