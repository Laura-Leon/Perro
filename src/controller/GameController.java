package controller;

import java.util.LinkedList;

import model.Dog;
import model.Logic;
import processing.core.PApplet;

public class GameController {
	private Logic logic;
	private PApplet app;
	
	public GameController(PApplet app) {
		this.app = app;
		logic = new Logic(app);
	
	
	}
 
	public void sortList(char c) {
		logic.sortList(c);
	}

	public LinkedList<Dog> listDog() {
		return logic.getListDog();
	} 
}
