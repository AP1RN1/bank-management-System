package bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{
	//instance Variable
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,btnExit;
	String pin;
	//param construction
	public Transactions(String Pin) {
		setTitle("Transaction Page");
		this.pin=pin;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
		Image i2=i1.getImage().getScaledInstance(1000, 1100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel lblImage=new JLabel(i3);
		lblImage.setBounds(0,0,960,1000);
		add(lblImage);
		
		l1=new JLabel("Please Select Ur Transaction");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Tahoma",Font.BOLD,18));
		l1.setBounds(100,270,200,35);
		//add(l1);
		lblImage.add(l1);
		
		b1=new JButton("Deposit");
		b1.setBounds(100,310,100,35);
		lblImage.add(b1);
		b2=new JButton("WITHDRAWL");
		b2.setBounds(200,310,100,35);
		lblImage.add(b2);
		b3=new JButton("FAST CASH");
		b3.setBounds(100,340,100,35);
		lblImage.add(b3);
		b4=new JButton("Mini Statement");
		b4.setBounds(200,340,100,35);
		lblImage.add(b4);
		b5=new JButton("PIN Change");
		b5.setBounds(100,380,100,35);
		lblImage.add(b5);
		b6=new JButton("Balance check");
		b6.setBounds(200,380,100,35);
		lblImage.add(b6);
		btnExit=new JButton("Exit");
		btnExit.setBounds(100,420,100,35);
		lblImage.add(btnExit);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		btnExit.addActionListener(this);

		
		setSize(960,1000);
		setLocation(300,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Transactions("");

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnExit) {
			System.exit(0);
		}
		else if(ae.getSource()==b1) {
			setVisible(false);
			new Deposit(pin).setVisible(true);
		}
	}

}
