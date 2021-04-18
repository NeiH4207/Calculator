package Calculation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Length extends Calculator implements ActionListener {
	
	JPanel Panel;
	JTextField toText;
	JTextField fromText;
	
	JLabel from, to;
	JComboBox toBox, fromBox;
	
	JButton deleButton, dotButton, enterButton;
	String sign;
	double temp, result;
	public Length() {
		SymbolTable SymTable = getSymbolTable();
		frame = new JFrame("Length");
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

		String []  item = {"Kilometres", "Centimetres", "Metres", "Inches", "Miles"};
		fromBox = new JComboBox(item);
		fromBox.setSelectedIndex(2);
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
		
        NumberButton numButton = new NumberButton();
        
		deleButton = new JButton("Delete");
		deleButton.setFont(new Font("NewellsHand", Font.PLAIN, 40));
		deleButton.addActionListener(this);
		
		dotButton = new JButton(".");
		dotButton.setFont(new Font("NewellsHand", Font.PLAIN, 40));
		dotButton.addActionListener(this);
		
		Panel = new JPanel();
		Panel.setBounds(5,300,572,400);
		Panel.setLayout(new GridLayout(4,3,1,1));
/*

		
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
		*/
		
		for (JButton button : numButton.Buttons){
            Panel.add(button);
        }


		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == SymTable.numButton.Buttons[i]) {
				CalPanel.Panel.setText(CalPanel.Panel.getText().concat(Integer.toString(i)));
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
			case "Kilometres":
				medium = temp * 1000;
				break;
			
			case "Metres":
				medium = temp;
				break;
			case "Centimetres":
				medium = temp / 100;
				break;
			case "Inches":
				medium = temp * 0.0254;
				break;
			case "Miles":
				medium = 1609.34 * temp;
			}
			
			switch (valueToBox){
			case "Kilometres":
				result = medium /1000;
				break;
			
			case "Metres":
				result = medium;
				break;
			case "Centimetres":
				result = medium * 100;
				break;
			case "Inches":
				result = medium * 100/2.54;
				break;
			case "Miles":
				result = medium * 0.00062137;
			}
			toText.setText(String.valueOf(result));
			}
		}

		public static void main(String [] args) {
			new Length();
		}

}
