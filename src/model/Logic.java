package model;


import java.util.Collections;
import java.util.LinkedList;


import processing.core.PApplet;

public class Logic {
	private String[] info1,info2;
	public PApplet app;
	private LinkedList<Dog> listDog;
	private int id;
	private String name;
	private String raza; 
	private String edad,date; 


	
	
	
	public Logic(PApplet app) {
		this.app = app; 
		this.listDog = new LinkedList<Dog>();
	
		info1 = app.loadStrings("../data/datosUno.txt");
		info2 = app.loadStrings("../data/datosDos.txt"); 

	
		for (int i = 0; i < info1.length; i++) {
			String [ ] splited = info1[i].split(",");
			for (int j = 0; j < info2.length; j++) {
				String [ ] splited2 = info2[j].split(",");
				if(splited2[0].equals(splited[0])) {
					id = Integer.parseInt(splited[0]);
					edad = splited[2];
					name = splited[1];
					raza = splited2[1];
					date = splited2[2];
					listDog.add(new Dog(id,name,raza, edad,date,app));
					
				}
			}
		}	
		
	}
	public void addListDog(int id,String name,String raza,String edad, String date,PApplet app ) {
		listDog.add(new Dog (id,name,raza,edad,date,app ));
	}
	
		public void sortList(char c) {
		switch (c) { 
		case 'p': 
			Collections.sort(listDog) ;
			
		System.out.println("putos");
			
			
			break;
		case 'o':
			Collections.sort(listDog, new DogAge()) ;
			System.out.println("age");
			break;
			
			
		
		case 'i':
			Collections.sort(listDog, new DogName()) ;
			System.out.println("name");
			break;
			
		case 'u':
			Collections.sort(listDog, new DogRaza()) ;
			System.out.println("raza");
			break;
		case 'y':
			Collections.sort(listDog, new DogBirth()) ;
			System.out.println("birth");
			break;
		
		}
		
	}
	public LinkedList<Dog> getListDog() {
		
		return listDog;
	}
	public void setListDog( LinkedList<Dog>listDog) {
	
		this.listDog = listDog;
	}


}
