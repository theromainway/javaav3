package fr.dauphine.ja.nomprenom.shapes.model;

public class Circle {
	private Point center; 
	private int radius; 
	
	public Circle(Point center, int radius) {
	       this.center= center; 
	       this.radius= radius; 
	}
	
	@Override
	public String toString() {
		return center+","+radius+","+radius;	
	}
}
