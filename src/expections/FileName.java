package expections;

import java.io.EOFException;

public class FileName{

    /**
     * Überprüft, ob der angegebene Dateiname die Erweiterung ".java" hat.
     * 
     * @param fileName der zu überprüfende Dateiname.
     * @return 1, wenn der Dateiname mit ".java" endet, 0, wenn er dies nicht tut, und -1, wenn eine {@link NullPointerException} oder {@link EOFException} abgefangen wird.
     */
    private static int CheckFileExtension(String fileName) {
        try {
            if (fileName.endsWith(".java")) {
                return 1;
            } else {
                return 0;
            }
        } catch (NullPointerException e) {
            return -1;
        }
    }

    /**
     * Die Hauptmethode, um die Verwendung der {@code CheckFileExtension} Methode zu demonstrieren.
     * 
     * @param args die Kommandozeilenargumente.
     */
    public static void main(String[] args) {
        String f1 = "File.java";
        String f2 = "File.txt";
        String f3 = null;
        
        System.out.println(CheckFileExtension(f1));
        System.out.println(CheckFileExtension(f2));
        System.out.println(CheckFileExtension(f3));
    }
}
