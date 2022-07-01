package gui.icon;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseEventDemo extends JFrame implements MouseListener {
	public MouseEventDemo() {
		setTitle("Mouse click!!!");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(this);
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseEventDemo();
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		int radius = 25;
		JFrame comp = (JFrame) e.getSource();
		Graphics g = comp.getGraphics();

		g.fillOval(e.getX() - radius, e.getY() - radius, 2 * radius, 2 * radius);
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

}
