package gui.maytinh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MayTinh2 extends JFrame implements ActionListener{
	private JLabel soB;
	private JLabel soA;
	private JLabel kq;

	private JTextField txtSoA;
	private JTextField txtSoB;
	private JLabel lbKQ;
	
	
	private JButton cong;
	private JButton tru;
	private JButton chia;
	private JButton nhan;
	
	 
	
	public MayTinh2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("May Tinh 2");
		this.add(center(), BorderLayout.CENTER);
		this.add(footer(),BorderLayout.SOUTH);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}

	public JPanel center() {
		JPanel lbCenter = new JPanel(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(5, 5, 5, 5);
		// cot 1
		soA = new JLabel("A=");
		gc.gridx = 0;
		gc.gridy = 0;
		lbCenter.add(soA, gc);

		soB = new JLabel("B=");
		gc.gridx = 0;
		gc.gridy = -1;
		lbCenter.add(soB, gc);

		kq = new JLabel("Ket Qua:");
		gc.gridx = 0;
		gc.gridy = -2;
	
		lbCenter.add(kq, gc);

		// cot 2

		gc.gridx = 1;
		gc.gridy = 0;
		txtSoA = new JTextField(10);
		lbCenter.add(txtSoA, gc);

		gc.gridx = 1;
		gc.gridy = -1;
		txtSoB = new JTextField(10);
		lbCenter.add(txtSoB, gc);
		
		
		
        gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = -2;
		lbKQ = new JLabel();
		lbCenter.add(lbKQ, gc);
		
		return lbCenter;
	}

	public JPanel footer() {
      JPanel lbFoot = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 5));
      cong = new JButton("+");
      cong.addActionListener(this);
      
      
      tru = new JButton("-");
      tru.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(lbFoot, "Hello", "Add", JOptionPane.ERROR_MESSAGE);
		}
	});
      
      nhan = new JButton("/");
      nhan.addActionListener(this);
      
      chia = new JButton("*");
      chia.addActionListener(this);
      
      lbFoot.add(cong);
      lbFoot.add(tru);
      lbFoot.add(chia);
      lbFoot.add(nhan);
      return lbFoot;
	}

	public static void main(String[] args) {
		new MayTinh2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int soA = Integer.parseInt(txtSoA.getText());
		int soB = Integer.parseInt(txtSoB.getText());
		
		if(e.getActionCommand() == "+") {
		   lbKQ.setText(String.valueOf(soA+soB));
		
		}else if(e.getActionCommand() == "-") {
			lbKQ.setText( String.valueOf(soA-soB));
		}else if(e.getActionCommand() == "*") {
			lbKQ.setText( String.valueOf(soA*soB));
		}else if(e.getActionCommand() == "/") {
			lbKQ.setText( String.valueOf((float)soA/soB));
		}
		
		
	}
}
