import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pheptinh {

	private JFrame frame;
	private JTextField texta;
	private JTextField textb;
	private JRadioButton rdbtntru;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel;
	private JRadioButton rdbtnnhan;
	private JRadioButton rdbtnchia;
	private JTextField textkq;
	private JRadioButton rdbtncong;
	private JButton btnxacnhan;
	private JButton btnxoa;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pheptinh window = new pheptinh();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	//ktra co nhap du lieu hay khong
	public boolean Ktra() {
		if(texta.getText().isEmpty()||textb.getText().isEmpty()) {
			return false;
		}
		return true;
	}
	public pheptinh() {
		initialize();
		rdbtncong.setSelected(true);
		
		btnxacnhan = new JButton("X\u00E1c nh\u1EADn");
		btnxacnhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b;
				a = Double.parseDouble(texta.getText().toString());
				b = Double.parseDouble(textb.getText().toString());
				if(Ktra()) {
					if(rdbtncong.isSelected()) {
						textkq.setText(a+b+"");
					}
					if(rdbtntru.isSelected()) {
						textkq.setText(a-b+"");
					}
					if(rdbtnnhan.isSelected()) {
						textkq.setText(a*b+"");
					}
					if(rdbtnchia.isSelected()) {
						textkq.setText(a/b+"");
					}
				}
			}
		});
		
		
		btnxacnhan.setBounds(98, 204, 107, 21);
		frame.getContentPane().add(btnxacnhan);
		
		btnxoa = new JButton("X\u00F3a");
		btnxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texta.setText("");
				textb.setText("");
				textkq.setText("");
			}
		});
		btnxoa.setBounds(215, 204, 72, 21);
		frame.getContentPane().add(btnxoa);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbsoa = new JLabel("Nh\u1EADp s\u1ED1 a: ");
		lbsoa.setBounds(81, 44, 78, 13);
		frame.getContentPane().add(lbsoa);
		
		JLabel lbsob = new JLabel("Nh\u1EADp s\u1ED1 b: ");
		lbsob.setBounds(81, 66, 78, 13);
		frame.getContentPane().add(lbsob);
		
		texta = new JTextField();
		texta.setBounds(169, 41, 96, 19);
		frame.getContentPane().add(texta);
		texta.setColumns(10);
		
		textb = new JTextField();
		textb.setColumns(10);
		textb.setBounds(169, 63, 96, 19);
		frame.getContentPane().add(textb);
		
		rdbtncong = new JRadioButton("a+b");
		buttonGroup.add(rdbtncong);
		rdbtncong.setBounds(81, 128, 50, 21);
		frame.getContentPane().add(rdbtncong);
		
		rdbtntru = new JRadioButton("a-b");
		buttonGroup.add(rdbtntru);
		rdbtntru.setBounds(133, 128, 50, 21);
		frame.getContentPane().add(rdbtntru);
		
		lblNewLabel = new JLabel("Ch\u1ECDn ph\u00E9p t\u00EDnh: ");
		lblNewLabel.setBounds(81, 108, 124, 13);
		frame.getContentPane().add(lblNewLabel);
		
		rdbtnnhan = new JRadioButton("axb");
		buttonGroup.add(rdbtnnhan);
		rdbtnnhan.setBounds(185, 128, 50, 21);
		frame.getContentPane().add(rdbtnnhan);
		
		rdbtnchia = new JRadioButton("a/b");
		buttonGroup.add(rdbtnchia);
		rdbtnchia.setBounds(237, 128, 50, 21);
		frame.getContentPane().add(rdbtnchia);
		
		Label label = new Label("CACULATER");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setAlignment(Label.CENTER);
		label.setBounds(81, 10, 206, 21);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Resuilt: ");
		label_1.setBounds(81, 163, 59, 21);
		frame.getContentPane().add(label_1);
		
		textkq = new JTextField();
		textkq.setBounds(169, 165, 96, 19);
		frame.getContentPane().add(textkq);
		textkq.setColumns(10);
	}
}
