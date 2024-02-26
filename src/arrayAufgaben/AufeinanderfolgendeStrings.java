package arrayAufgaben;

public class AufeinanderfolgendeStrings {

	public static boolean isProbablyApproaching(String[] signs) {
	    if (signs == null || signs.length < 2) {
	        return false; 
	    }
 
	    for (int i = 0; i < signs.length - 1; i++) {
	        if (signs[i].equals(signs[i + 1])) {
	            return true; 
	        }
	    }
	    return false; 
	}
	
	public static void main (String[]args) {
		String[] signs1 = { "F", "DO", "MOS", "MOS", "MOS", "MOS", "WES" };
		System.out.println(isProbablyApproaching(signs1) );	// true
	
		String[] signs2 = { "F", "DO", "MOS", "MOS", "WES", "MOS", "MOS" };
		System.out.println(isProbablyApproaching(signs2) );	// false
}
}