/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.icon;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

/**
 *
 * @author VanDu
 */
public class frmSinhVien extends JFrame {
    
    public frmSinhVien() {
        
        taoForm();
        taoMenu();
        taoToolbar();
        
        setTitle("Them moi sinh vien");
         
        pack();
        setVisible(true);
         
    }
    
    public static void main(String[] args) {
        frmSinhVien sv = new frmSinhVien();
       
    }
    
    private void taoForm() {
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,2));
        
        JLabel lblMaSinhVien = new JLabel("Ma sinh vien:");
        JTextField txtMaSinhVien = new JTextField();
        
        JLabel lblTenSinhVien = new JLabel("Ho Ten:");
        JTextField txtTenSinhVien = new JTextField();
        
        JLabel lblNamSinhSinhVien = new JLabel("Nam sinh:");
        JTextField txtNamSinhSinhVien = new JTextField();
        
        JLabel lblNoiSinhSinhVien = new JLabel("Noi sinh:");
        String[] noiSinhs = {"TPHCM", "Ha Noi", "Thanh Hoa"};
        JComboBox cboNoiSinhSinhVien = new JComboBox(noiSinhs); 
        
        JLabel lblGioiTinhSinhVien = new JLabel("Gioi tinh:");
        JRadioButton radGioiTinhNam = new JRadioButton("Nam");
        JRadioButton radGioiTinhNu = new JRadioButton("Nu");
        ButtonGroup grpGioiTinh = new ButtonGroup();
        grpGioiTinh.add(radGioiTinhNam);
        grpGioiTinh.add(radGioiTinhNu);
        
        JPanel pnlGioiTinh = new JPanel();
        pnlGioiTinh.add(radGioiTinhNam);
        pnlGioiTinh.add(radGioiTinhNu);
        
        JButton btnThemMoi = new JButton("Them moi");
        btnThemMoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maSinhVien = txtMaSinhVien.getText();
                String tenSinhVien = txtTenSinhVien.getText();
                int namSinh = Integer.parseInt(txtNamSinhSinhVien.getText());
                String noiSinh = cboNoiSinhSinhVien.getSelectedItem().toString();
                
                String gioiTinh = "";
                if(radGioiTinhNam.isSelected())
                    gioiTinh = "Nam";
                else
                    gioiTinh = "Nu";
                
                JOptionPane.showMessageDialog(rootPane, maSinhVien + " " + tenSinhVien + " " + namSinh + " " + noiSinh + " " + gioiTinh);
            }
        });
        
        JButton btnHuyBo = new JButton("Huy bo");
        
        panel.add(lblMaSinhVien);
        panel.add(txtMaSinhVien);
        
        panel.add(lblTenSinhVien);
        panel.add(txtTenSinhVien);
        
        panel.add(lblNamSinhSinhVien);
        panel.add(txtNamSinhSinhVien);
        
        panel.add(lblGioiTinhSinhVien);
        panel.add(pnlGioiTinh);
        
        panel.add(lblNoiSinhSinhVien);
        panel.add(cboNoiSinhSinhVien);
        
        panel.add(btnThemMoi);
        panel.add(btnHuyBo);
        
        getContentPane().add(panel, BorderLayout.CENTER);
      
    }
    
    private void taoMenu() {
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuFile = new JMenu("File");
        JMenu menuAbout = new JMenu("About");
        
        menuBar.add(menuFile);
        menuBar.add(menuAbout);
        
        setJMenuBar(menuBar);
        
        JMenuItem menuItemOpen = new JMenuItem("Open", new ImageIcon("./images/open.png"));
        menuFile.add(menuItemOpen);
        
        menuFile.addSeparator();
        
        JMenuItem menuItemExit = new JMenuItem("Exit", new ImageIcon("./images/exit.png"));
         menuItemExit.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.ALT_MASK));
        menuFile.add(menuItemExit);
        
        menuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        JMenuItem menuItemTacGia = new JMenuItem("Tac gia", new ImageIcon("./images/info.png"));
        menuFile.add(menuItemTacGia);
        
        menuAbout.add(menuItemTacGia);
        
        menuItemTacGia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Thong bao! Tac gia ne!!");
            }
        });
    }
    
    private void taoToolbar() {
        JToolBar toolbar = new JToolBar();
        
        JButton btnExit = new JButton("Exit", new ImageIcon("./images/exit.png"));
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(rootPane, "Ban co muon thoat khong?");
                if(result == JOptionPane.YES_OPTION)
                    System.exit(0);
                
            }
        });
        
        toolbar.add(btnExit);
        
        getContentPane().add(toolbar, BorderLayout.NORTH);
        
        
        
    }
}
