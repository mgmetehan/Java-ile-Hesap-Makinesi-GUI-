package Hesap;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class HesapMakinesi extends JFrame {
	private double sayi, sonuc;
	int secenek;
	JFrame frame = new JFrame();
	JPanel panel;
	JTextField text;
	JLabel label;

	/// isaretlerin fontunu degistir

	public void add(String str) {// sayi yazmayi saglar
		text.setText(text.getText() + str);
	}

	public void islem() {
		switch (secenek) {
		case 1:
			sonuc = sayi + Double.parseDouble(text.getText());
			text.setText(Double.toString(sonuc));
			break;
		case 2:
			sonuc = sayi - Double.parseDouble(text.getText());
			text.setText(Double.toString(sonuc));
			break;
		case 3:
			sonuc = sayi * Double.parseDouble(text.getText());
			text.setText(Double.toString(sonuc));
			break;
		case 4:
			sonuc = sayi / Double.parseDouble(text.getText());
			text.setText(Double.toString(sonuc));
			break;
		}
	}


	public void start() {
		frame = new JFrame("Hesap Makinesi");
		// JOptionPane.showMessageDialog(frame, "Hesap Makinesine Hos Geldiniz");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 400, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);// frame buyutulup kuculmez

		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(panel);
		panel.setLayout(null);

		text = new JTextField();
		text.setEditable(false);
		text.setHorizontalAlignment(SwingConstants.RIGHT);
		text.setBounds(50, 45, 290, 70);
		text.setFont(new Font("Arial Black", Font.PLAIN, 20));
		panel.add(text);
		text.setColumns(10);

		label = new JLabel("");
		label.setBounds(0, 20, 320, 20);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(label);

		JPanel p = new JPanel();
		p.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		p.setBounds(10, 150, 370, 300);
		panel.add(p);
		p.setLayout(new GridLayout(4, 4, 0, 0));

		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add(e.getActionCommand());
			}
		});
		p.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add(e.getActionCommand());
			}
		});
		p.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add(e.getActionCommand());
			}
		});
		p.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_3.setBackground(new Color(255, 99, 71));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					sayi = Double.parseDouble(text.getText());
					secenek = 1;
					text.setText(" ");
					label.setText(sayi + e.getActionCommand());// JButton icinde verdigin yaziyi verir
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		p.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add(e.getActionCommand());
			}
		});
		p.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add(e.getActionCommand());
			}
		});
		p.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add(e.getActionCommand());
			}
		});
		p.add(btnNewButton_6);
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_7.setBackground(new Color(255, 99, 71));
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					sayi = Double.parseDouble(text.getText());
					secenek = 2;
					text.setText(" ");
					label.setText(sayi + e.getActionCommand());
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});
		p.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_8.setBackground(new Color(192, 192, 192));
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add(e.getActionCommand());
			}
		});
		p.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_9.setBackground(new Color(192, 192, 192));
		btnNewButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add(e.getActionCommand());
			}
		});
		p.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_10.setBackground(new Color(192, 192, 192));
		btnNewButton_10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add(e.getActionCommand());
			}
		});
		p.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_11.setBackground(new Color(255, 99, 71));
		btnNewButton_11.setForeground(Color.WHITE);
		btnNewButton_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					sayi = Double.parseDouble(text.getText());
					secenek = 3;
					text.setText(" ");
					label.setText(sayi + e.getActionCommand());
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		p.add(btnNewButton_11);
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_12.setBackground(new Color(192, 192, 192));
		btnNewButton_12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add(e.getActionCommand());
			}
		});
		p.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_13.setBackground(new Color(255, 99, 71));
		btnNewButton_13.setForeground(Color.WHITE);
		btnNewButton_13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				islem();
				label.setText("");
			}
		});
		p.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("C");
		btnNewButton_14.setFont(new Font("Arial Black", Font.PLAIN, 20));
		// btnNewButton_14.setForeground(Color.RED);
		btnNewButton_14.setBackground(Color.RED);
		btnNewButton_14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText(" ");
			}
		});
		p.add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("%");
		btnNewButton_15.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_15.setBackground(new Color(255, 99, 71));
		btnNewButton_15.setForeground(Color.WHITE);
		btnNewButton_15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					sayi = Double.parseDouble(text.getText());
					if (sayi == 0) {
						text.setText("0");
					}
					secenek = 4;
					text.setText(" ");
					label.setText(sayi + e.getActionCommand());
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});
		p.add(btnNewButton_15);

		frame.setVisible(true);
	}

}
