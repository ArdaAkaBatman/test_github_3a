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
		
		List<String> entries = new ArrayList<String>();
		entries.add("A1");
		entries.add("A2");
		entries.add("A3");
		entries.add("A4");
		entries.add("B1");
		entries.add("B2");
		entries.add("B3");
		entries.add("B4");
		entries.add("C1");
		entries.add("C2");
		entries.add("C3");
		entries.add("C4");
		entries.add("A4");
		entries.add("B4");
		entries.add("C4");
		
		  try {
	            reduceToComments(entries);
	            System.out.println(entries);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	

	}
	
	





