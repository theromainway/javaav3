package fr.dauphine.ja.nomprenom.shapes.model;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Point
		Point p1=new Point(3, 6);
		Point p2=new Point(7, 8);
		System.out.println(p1+" et "+p2);	
		
		//Polyline
		ArrayList<Point> listpoint = new ArrayList<>();
		listpoint.add(p1);
		listpoint.add(p2);
		Polyline trait=new Polyline(listpoint,3);
		System.out.println(trait);
		
		//Circle
		Point centre=new Point(5,6);
		int rayon = 5;
		Circle cercle=new Circle(centre, rayon);
		System.out.println(cercle);
		}

}
