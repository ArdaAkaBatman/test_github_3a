package linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	// private = Sichtbarkeitsbereich auf die eigene Klasse beschränkt
	// static = unabhängig von einem Objekt, gehört zur Klasse
	// final = Wert der Variable bleibt nach Initialisierung unveränderbar
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Zwiebeln?|Tomaten?|Melanzani"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		for(ListIterator<String> iterator = ingredients.listIterator();
				iterator.hasNext();) {
			String ingredient = iterator.next();
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("Käse");
			}
		}
	}

	public static void main(String[] args) {
		List<String> ingredients = new LinkedList<String>();
		Collections.addAll(ingredients, "Gnocchi", "Paprika", "Tomaten", "Pfeffer", "Melanzani");
		insertCheeseAroundVegetable(ingredients);
		System.out.println(ingredients);

	}

}