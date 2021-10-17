package fr.dauphine.ja.nomprenom.shapes.view;

import javax.swing.JPanel;

import fr.dauphine.ja.nomprenom.shapes.controller.MouseController;
import fr.dauphine.ja.nomprenom.shapes.model.Point;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyDisplay extends JPanel implements MouseController{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void paintComponent(Graphics g) {
		Point centre=new Point(120,40);
		int rayon = 60;
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(centre.getX(),centre.getY(),rayon, rayon);
    }

    public static void main(String[] args) {

                JFrame frame = new JFrame("Java Avance - Graphic Display");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new MyDisplay());
                frame.setSize(500,200);
                frame.setVisible(true);
    }
}
