/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author VanDu
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class KeyEventDemo extends JFrame implements KeyListener {

    private String line1 = "", line2 = "";
    private String line3 = "";
    private TextArea textArea;

    public KeyEventDemo() {
        super("Demo Keys Events");    // set up TextArea 
        textArea = new TextArea(10, 15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        add(textArea);     // allow frame to process Key events 
        addKeyListener(this);
        setSize(300, 150);
        setVisible(true);
    }   // handle press of any key 

    public void keyPressed(KeyEvent event) {
        line1 = "Key pressed: " + event.getKeyText(event.getKeyCode());
        setLines2and3(event);
    }   // handle release of any key 

    public void keyReleased(KeyEvent event) {
        line1 = "Key released: " + event.getKeyText(event.getKeyCode());
        setLines2and3(event);
    }   // handle press of an action key 

    public void keyTyped(KeyEvent event) {
        line1 = "Key typed: " + event.getKeyChar();
        setLines2and3(event);
    }   // set second and third lines of output 

    private void setLines2and3(KeyEvent event) {
        line2 = "This key is " + (event.isActionKey() ? "" : "not ") + "an action key";
        String temp = event.getKeyModifiersText(event.getModifiers());
        line3 = "Modifier keys pressed: " + (temp.equals("") ? "none" : temp);
        textArea.setText(line1 + "\n" + line2 + "\n" + line3 + "\n");
    }  // execute application 

    public static void main(String args[]) {
        KeyEventDemo application = new KeyEventDemo();
    }
} // end class KeyDemo
