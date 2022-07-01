package gui.icon;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MouseClickAction extends MouseAdapter {

	@Override
	public void mousePressed(MouseEvent e) {
		int radius = 25;
		JFrame comp = (JFrame)e.getSource();
		Graphics g = comp.getGraphics();
		
		g.fillOval(e.getX()-radius, e.getY()-radius, 2*radius, 2*radius);
	}
}
