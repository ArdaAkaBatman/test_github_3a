package collectionFrameworks;

import java.util.ArrayList;
import java.util.List;

public class kommentareFiltern {


	public static void reduceToComments(List<String> lines) {
        if (lines.size() % 4 != 0) {
            throw new IllegalArgumentException("Illegal size of list, must be divisible by 4");
        }
        for (int i = 0; i < lines.size(); i++) {
            if (i % 4 < 3) {
                lines.set(i, null);
            }
        }
        lines.removeIf(s -> s == null);
    }
	
	public static void main (String[]args) {
		
		List<String> eintrag = new ArrayList<String>;
		eintrag.add("A1");
		eintrag.add("A2");
		eintrag.add("A3");
		eintrag.add("A4");
		eintrag.add("B1");
		eintrag.add("B2");
		eintrag.add("B3");
		eintrag.add("B4");
		eintrag.add("C1");
		eintrag.add("C2");
		eintrag.add("C3");
		eintrag.add("C4");
		eintrag.add("A4");
		eintrag.add("B4");
		eintrag.add("C4");
		
		  try {
	            reduceToComments(eintrag);
	            System.out.println(eintrag);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	

	}
	
	





