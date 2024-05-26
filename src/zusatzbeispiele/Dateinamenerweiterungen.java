package zusatzbeispiele;

public class Dateinamenerweiterungen {
	
	
	public static int checkFileExtension(String fileName) throws InvalidFileNameException {
        if (fileName == null || fileName.trim().isEmpty()) {
            throw new InvalidFileNameException("Dateiname ist ungültig oder leer.");
        }
        if (!fileName.endsWith(".java")) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        try {
            int score = checkFileExtension("Example.java");
            System.out.println("Punkte: " + score);
            score = checkFileExtension("Example.txt");
            System.out.println("Punkte: " + score);
            score = checkFileExtension("");
            System.out.println("Punkte: " + score);
        } catch (InvalidFileNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
 
class InvalidFileNameException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidFileNameException(String message) {
        super(message);

    }
}

