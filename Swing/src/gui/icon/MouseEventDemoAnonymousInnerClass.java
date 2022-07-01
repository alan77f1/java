package gui.icon;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseEventDemoAnonymousInnerClass extends JFrame {
	public MouseEventDemoAnonymousInnerClass() {
		setTitle("Mouse click!!!");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(new MousePressedListener());
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseEventDemoAnonymousInnerClass();
	}

	class MousePressedListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int radius = 25;
			JFrame comp = (JFrame) e.getSource();
			Graphics g = comp.getGraphics();

			g.fillOval(e.getX() - radius, e.getY() - radius, 2 * radius, 2 * radius);
		}
	}
}
