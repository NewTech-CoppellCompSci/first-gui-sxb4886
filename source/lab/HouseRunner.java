package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HouseRunner {

	public static void main(String[] args) throws Exception {
		
		ArrayList<House> houseList = new ArrayList<House>();
		
		// #3 create a file scanner
		Scanner houseScan = new Scanner(new File("source/lab/data.txt"));
		int SQFT = 0;
		int bedrooms = 0;
		double bathrooms = 0.0;
		int price = 0;
		String address = "";
		String image = "";
		/*
		 * adds variables to allow a new pet to be added to the list then use a loop to
		 * scan in all the pets from the file
		 */
		while (houseScan.hasNext()) {
			SQFT = houseScan.nextInt();
			bedrooms = houseScan.nextInt();
			bathrooms = houseScan.nextDouble();
			price = houseScan.nextInt();
			address = houseScan.next();
			image = houseScan.next();
			houseList.add(new House(SQFT, bedrooms, bathrooms, price, address, image));
		}
	
	
		buildGUI();
		
		
	}
	
	
	
	
	public static void buildGUI() {
		
		JFrame frame = new JFrame("buyahouse,com");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //delete frame when program ends
		frame.setSize(3000, 3000);  //width and height
		
		JLabel label1 = new JLabel("Welcome to buyahouse.com!");
		label1.setBounds(20, 40, 180, 30); //give it bounds (x, y, width, height)
		frame.add(label1); 
		
		//create button
		JButton button1 = new JButton("Press Me!!");
		button1.setBounds(270, 40, 100, 30);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					
				//say what to do when button is pressed
						
				//make the output label say whatever is in the input text box
				
						
						
					}
					
				});
				frame.add(button1);
		
		frame.setLayout(null);  //don't use a default layout
		frame.setVisible(true);  //make it visible
		
	}
	
	
	
	
}
