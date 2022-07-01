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
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo extends JFrame {

    public FlowLayoutDemo(String title) {
        setTitle(title);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.BLUE);//set màu nên cho JPanel 
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Thêm các control trên 1 dòng");
        JButton btn3 = new JButton("Hết chỗ chứa thì xuống dòng");
        pnFlow.add(btn1);//ad Jbutton vào JPanel 
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        Container con = getContentPane();//lấy lớp chứa của cửa sổ windows 
        con.add(pnFlow);// add lớp chứa JPanel vào cửa sổ 
    }

    public static void main(String[] args) {
        FlowLayoutDemo myUI = new FlowLayoutDemo("Demo FlowLayout");
        myUI.setSize(400, 100);
// thiết lập sự kiện đóng cửa sổ  
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);//Nằm giữa màn hình 
        myUI.setVisible(true);//cho phép cửa sổ hiển thị. 
    }
}
