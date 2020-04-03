package model;

import java.util.Comparator;

public class DogAge implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		int age1= Integer.parseInt(o1.getAge());
		int age2= Integer.parseInt(o2.getAge());
    	return age2- age1;
	}

	

}
