package Programmer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Weight implements ActionListener {
	JFrame frame;
	JPanel panel;
	Font fontNumber;
	JTextArea resultArea;
	JTextField toText;
	JTextField fromText;
	JLabel from, to;
	JComboBox toBox, fromBox;
	JButton[] numberButtons = new JButton[10];
	JButton deleButton, dotButton, enterButton;
	String sign;
	double temp, result;
	public Weight() {
		frame = new JFrame("Weight");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 750);
		frame.setLayout(null);
	
		from = new JLabel("From");
	    from.setBounds(20,50,75,25);
	    from.setFont(new Font("NewellsHand",Font.PLAIN, 30));
	    frame.add(from);
	    
	    to = new JLabel("To");
	    to.setBounds(20,120,75,25);
	    to.setFont(new Font("NewellsHand",Font.PLAIN, 30));
	    frame.add(to);
		
		fromText = new JTextField();
		fromText.setBounds(150,50,180,40);
		fromText.setFont(new Font("NewellsHand",Font.PLAIN, 30));
		fromText.setText("");
		frame.add(fromText);
		
		enterButton = new JButton("Enter");
		enterButton.setBounds(20,200,135,40);
		enterButton.setFont(new Font("NewellsHand",Font.PLAIN, 30));
		enterButton.setBackground(Color.WHITE);
		enterButton.addActionListener(this);
		frame.add(enterButton);

		String []  item = {"Kilograms", "Grams", "Pounds"};
		fromBox = new JComboBox(item);
		fromBox.setSelectedIndex(0);
		fromBox.addActionListener(this);
        fromBox.setBounds(400, 50, 150, 40);
        frame.add(fromBox);
		
        
		toText = new JTextField();
		toText.setBounds(150,120,180,40);
		toText.setFont(new Font("NewellsHand",Font.PLAIN, 30));
		frame.add(toText);
		toBox = new JComboBox(item);
		toBox.addActionListener(this);
        toBox.setBounds(400, 120, 150, 40);
        frame.add(toBox);
		
		for(int i = 0; i < 10;i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(new Font("NewellsHand",Font.PLAIN, 40));
			numberButtons[i].setFocusable(false);
			numberButtons[i].setBackground(Color.WHITE);
		}
		deleButton = new JButton("Delete");
		deleButton.setFont(new Font("NewellsHand", Font.PLAIN, 40));
		deleButton.addActionListener(this);
		
		dotButton = new JButton(".");
		dotButton.setFont(new Font("NewellsHand", Font.PLAIN, 40));
		dotButton.addActionListener(this);
		panel = new JPanel();
		
		panel.setBounds(5,300,572,400);
		panel.setLayout(new GridLayout(4,3,1,1));


		
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		
		panel.add(dotButton);
		panel.add(numberButtons[0]);
		panel.add(deleButton);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == numberButtons[i]) {//chỉ nhập được số (cho số thứ nhất)
				fromText.setText(fromText.getText().concat(String.valueOf(i)));
				temp = Double.parseDouble(fromText.getText());
			}
		}
		if(e.getSource() == dotButton) {
			fromText.setText(fromText.getText().concat("."));
			
		}
		if(e.getSource() == deleButton) {
			String value = "";
			toText.setText(String.valueOf(value));
			fromText.setText(String.valueOf(value));
		}
	
	
		if(e.getSource() == enterButton) {
			String valueFromBox = (String) fromBox.getSelectedItem();
			String valueToBox = (String) toBox.getSelectedItem();
			double medium = 0;
			switch (valueFromBox){
			case "Kilograms":
				medium = temp;
				break;
			
			case "Grams":
				medium = temp / 1000;
				break;
			case "Pounds":
				medium = temp * 0.453592;
			}
			switch (valueToBox){
			case "Kilograms":
				result = medium;
				break;
			
			case "Grams":
				result = medium * 1000;
				break;
			case "Pounds":
				result = medium * 2.204623;
			}
			toText.setText(String.valueOf(result));
			}
	
		}
	public static void main (String [] args) {
		Weight weight = new Weight();
	}
}
