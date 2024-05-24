package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import ch05.AbstractServer;
import ch05.MyThreadServer;

public class Mainframe extends JFrame {

	private MyThreadServer myThreadServer;
	private AbstractServer abstractServer;
	private JLabel label1;
	private JPanel panel1;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	Scanner scanner;

	public Mainframe() {
		initData();
		setInitLayout();
		addEventListener();
		setLayout(new BorderLayout());

	}

	public void initData() {
		myThreadServer = new MyThreadServer();
		label1 = new JLabel();
		panel1 = new JPanel();
//		panel2= new JPanel();
		button1 = new JButton("접속");
		button2 = new JButton("해제");
//		button1.setHorizontalAlignment(SwingConstants.CENTER);
		button1.setVerticalAlignment(SwingConstants.BOTTOM);
		button2.setVerticalAlignment(SwingConstants.BOTTOM);
		panel1.setBackground(Color.red);
		panel1.setLayout(new GridLayout(3, 1, 50, 150));
//		panel1.setLayout(new GridLayout(1, 2));
		panel1.add(label1);
		panel1.add(button1);
		panel1.add(button2);
//		add(panel2);
//		add(label1);
		add(panel1);

		setSize(400, 600);
	}

	public void setInitLayout() {
		setVisible(true);
		setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addEventListener() {
		button1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				MyThreadServer myThreadServer = new MyThreadServer();
				myThreadServer.run();
				
				
			}
		});

	}

	public static void main(String[] args) {
		new Mainframe();
	}
}
