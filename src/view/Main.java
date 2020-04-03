package view;



import controller.GameController;
import processing.core.PApplet;

public class Main extends PApplet {
	private GameController controller;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}
	public void settings() {
		size(600,600);
		
	}

	public void setup() {
		controller = new GameController(this);
	}

	public void draw() {
		background(0);
	
		
		for (int i = 0; i < controller.listDog().size(); i++) {
			controller.listDog().get(i).drawText((i*(50))+ 80, this);
		}
		
	}

	
	
	public void keyPressed() {
		controller.sortList(key);
		
	}
}
