package String_builder;
 
public class PasswordTester {
 
	public static boolean isGoodPassword(String password) {
		if (password.length() < 8){
			System.err.println("Das Passwort ist zu kurz! Mindestens 8 Zeichen!");
		}
		
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;
		
		for (char c : password.toCharArray()) {
	            if (Character.isLowerCase(c)) {
	                hasLowerCase = true;
	            } else if (Character.isUpperCase(c)) {
	                hasUpperCase = true;
	            } else if (Character.isDigit(c)) {
	                hasDigit = true;
	            } else {
	                hasSpecialChar = true;
	            }
	        }
	        if (!hasLowerCase) {
	            System.err.println("Das Passwort muss mindestens einen Kleinbuchstaben enthalten.");
	            return false;
	        }
	        if (!hasUpperCase) {
	            System.err.println("Das Passwort muss mindestens einen Grossbuchstaben enthalten.");
	            return false;
	        }
	        if (!hasDigit) {
	            System.err.println("Das Passwort muss mindestens eine Ziffer enthalten.");
	            return false;
	        }
	        if (!hasSpecialChar) {
	            System.err.println("Das Passwort muss mindestens ein Sonderzeichen enthalten.");
	            return false;
	        }
	        return true;
	    }
 
	    public static void main(String[] args) {
	        String password = "uihiDK2s!S";
 
	        if (isGoodPassword(password)) {
	        	String greenColor = "\u001B[32m";
	        	String resetColor = "\u001B[0m";
	        	System.out.println(greenColor + "Passwort angenommen!" + resetColor);
	        } else {
	            System.err.println("Passwort abgelehnt!");
	        }
	    }
	}