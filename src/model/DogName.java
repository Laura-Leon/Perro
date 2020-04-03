package model;

import java.util.Comparator;

public class DogName implements Comparator<Dog> {
		   
		
	    public int compare(Dog perro1,Dog perro2) {
	    	return perro1.getName().compareTo(perro2.getName());
	    }

		
}
