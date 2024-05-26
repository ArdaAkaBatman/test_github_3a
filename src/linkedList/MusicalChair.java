package linkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class MusicalChair {

	private List<String> names;
	
	public MusicalChair(String... names) {
		if(names.length > 0) {
			// Array.asList(names) - wandelt ein Array in eine Liste um
			this.names = new LinkedList<String>(Arrays.asList(names));
		}
	}

	public List<String> getNames() {
		return names;
	}

	public void setName(List<String> names) {
		this.names = names;
	}
	
	public String toString() {
		Iterator<String> itr = this.names.iterator();
		String tmp = "";
		while(itr.hasNext()) {
			tmp = tmp + itr.next() + ", ";
		}
		return tmp;
	}
	
	
	
	
	public void rotate(int distance) {
		Collections.rotate(this.names, distance);
	}
	
	public void rotateAndRemoveLast(int distance) {
		 if(!this.names.isEmpty()) {
	     rotate(distance);
	     ((LinkedList<String>) this.names).removeLast();
		 
		 }
		 }
	
	public String play() {
        if(!this.names.isEmpty()) {
        	while(this.names.size() > 1) {
        	int randomNumber = ThreadLocalRandom.current().nextInt();
        	this.rotateAndRemoveLast(randomNumber);
        	System.out.println(this.names);
        	}
        }
        return this.names.get(0);
	}
}