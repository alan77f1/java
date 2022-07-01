package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;

public class JToolbarJMenuBarDemo extends JFrame {
	public JToolbarJMenuBarDemo () {
		setTitle("JToolbar JMenuBar Demo");
		JToolBar toolbar = new JToolBar();

		JButton exitButton = new JButton("Exit");
		exitButton.setIcon(new ImageIcon("./images/info.png"));
		toolbar.add(exitButton);

		getContentPane().add(toolbar, BorderLayout.NORTH);
		showMenuDemo();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);

		
	}
	private void showMenuDemo() {
		// Tao mot menu bar
		final JMenuBar menuBar = new JMenuBar();
		// Tao cac menu
		JMenu fileMenu = new JMenu("File");
		final JMenu aboutMenu = new JMenu("About");
		// tao cac item
		JMenuItem openMenuItem = new JMenuItem("Open");
		openMenuItem.setActionCommand("Open");
		JMenuItem saveMenuItem = new JMenuItem("Save");
		saveMenuItem.setActionCommand("Save");
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setActionCommand("Exit");
		MenuItemListener menuItemListener = new MenuItemListener();
		openMenuItem.addActionListener(menuItemListener);
		saveMenuItem.addActionListener(menuItemListener);
		exitMenuItem.addActionListener(menuItemListener);
		final JCheckBoxMenuItem showWindowMenu = new JCheckBoxMenuItem("Show About", true);
		showWindowMenu.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (showWindowMenu.getState()) {
					menuBar.add(aboutMenu);
				} else {
					menuBar.remove(aboutMenu);
				}
			}
		});
		final JRadioButtonMenuItem showLinksMenu = new JRadioButtonMenuItem("Show Links", false);
		// Them item toi cac menu
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(showWindowMenu);
		fileMenu.addSeparator();
		fileMenu.add(showLinksMenu);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		// Them menu toi menubar
		menuBar.add(fileMenu);
		menuBar.add(aboutMenu);
		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {
		new JToolbarJMenuBarDemo();
	}
	
	 class MenuItemListener implements ActionListener {

	        public void actionPerformed(ActionEvent e) {
	            System.out.println("dajkshdkjasd");
	        }
	    }
}
