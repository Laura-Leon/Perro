package model;

import processing.core.PApplet;


public class Dog implements Comparable<Dog>{
	private int id,posY,posX;
	String age;
	private String name,raza,date;
	private PApplet app;
	
	public Dog(int id, String name, String raza,String age,String date, PApplet app) { 
	this.age = age;
	this.name = name; 
	this.raza = raza;
	this.id = id;
	
	
	//this.posY = posY; 
	this.posX = 50;
	this.app = app;
	this.date = date;
	
	}
public void drawText(int posY,PApplet app) {
	app.fill(255);
	app.text("ID", 50, 45);
	app.text (this.id, posX, posY);
	app.text("NAME", 100, 45);
	app.text (this.name, posX + 50, posY);
	app.text("AGE", 190, 45);
	app.text (this.age, posX+ 150, posY);
	app.text("RAZA", 280, 45);
	app.text (this.raza, posX + 220, posY);
	app.text("BIRTH DATE", 460, 45);
	app.text (this.date, posX+ 400, posY);

	
}

public int compareTo(Dog dogtwo) {
	return this.id - dogtwo.getId();
	
}


public int getPosX() {
	return posX;
}
public void setPosX(int posX) {
	this.posX = posX;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPosY() {
	return posY;
}
public void setPosY(int posY) {
	this.posY = posY;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRaza() {
	return raza;
}
public void setRaza(String raza) {
	this.raza = raza;
}

public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public PApplet getApp() {
	return app;
}
public void setApp(PApplet app) {
	this.app = app;
}

}
