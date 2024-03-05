package collectionFrameworks;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

	
	public class verlusteManipulieren {
		
	 
	    public static void trimNonGrowingNumbers(List<Integer> numbers) {
	        if (numbers == null || numbers.size() < 2) {
	            // Nicht genug Elemente zum Vergleichen oder ungültige Liste
	            return;
	        }
	 
	        Iterator<Integer> iterator = numbers.iterator();
	        double current = iterator.next();
	        while (iterator.hasNext()) {
	            double next = iterator.next();
	            if (next < current) {
	                iterator.remove();
	            } else {
	                current = next;
	            }
	        }
	    }
	 
	    public static void main(String[] args) {
	        // Test der Methode mit einem Beispiel
	        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5));
	        trimNonGrowingNumbers(numbers);
	        System.out.println(numbers); 
	    }
	}
