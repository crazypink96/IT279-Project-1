package alarmClock;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.JComponent; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class alarmClock {
	
	Scanner keyboard = new Scanner(System.in); 
	
	
	public alarmClock()
	{
		JFrame frame = new JFrame("Alarm Clock"); 
		createFormat(frame);
		frame.setSize(1000,300); 
		//frame.pack(); 
		frame.setVisible(true); 
	}

	public JPanel makeTextPanel(String text)
	{
		JPanel panel = new JPanel(false); 
		JLabel filler = new JLabel(text); 
		filler.setHorizontalAlignment(JLabel.CENTER);
		panel.setLayout(new GridLayout(0,6));  
		return panel; 
	}
	
	public void createFormat(JFrame frame)
	{
		
	}
	
	public void createAlarm()
	{
		String alarm, date, time, message; 
		alarm = JOptionPane.showInputDialog("Enter Date");
		date = keyboard.next(); 
		alarm = JOptionPane.showInputDialog("Enter Time");
		time = keyboard.next(); 
		
	}
	
}
