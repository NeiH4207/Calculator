package Calculation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
public class StandardCalculator extends Calculator implements ActionListener {
	
	
	JButton[] numberButtons = new JButton[10];
	JButton[] operatorButtons = new JButton[10];
	JButton addButton, subButton, mulButton, divButton;
	JButton dotButton, equButton, delButton, clrButton;
	JButton sqrtButton, negButton;
	
	
	public StandardCalculator() {
		frame = new JFrame("Standard Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(390,550);
		frame.setLayout(null);
		
		
		
		resultArea = new JTextArea();
		resultArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		resultArea.setBounds(5,15,400,140);
		resultArea.setFont(new Font("NewellsHand",Font.PLAIN, 50));
		resultArea.setBackground(Color.white);
		frame.add(resultArea);
			
			addButton = new JButton("+");
			subButton = new JButton("-");
			mulButton = new JButton("*");
			divButton = new JButton("/");
			delButton = new JButton(new ImageIcon("C://Users//lengo//OneDrive//Hình ảnh/delete1.png"));
			clrButton = new JButton(new ImageIcon("C://Users//lengo//OneDrive//Hình ảnh/clear1.png"));
			dotButton = new JButton(".");
			equButton = new JButton("=");
			sqrtButton = new JButton(new ImageIcon("C://Users//lengo//OneDrive//Hình ảnh/sqrt1.png"));
			negButton = new JButton("+/_");
		
		
			operatorButtons[0] = addButton;
			operatorButtons[1] = subButton;
			operatorButtons[2] = mulButton;
			operatorButtons[3] = divButton;
			operatorButtons[4] = dotButton;
			operatorButtons[5] = equButton;
			operatorButtons[6] = negButton;
			operatorButtons[7] = sqrtButton;
			operatorButtons[8] = delButton;
			
			
			operatorButtons[9] = clrButton;
		
		for(int i = 0; i < 10;i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(new Font("NewellsHand",Font.PLAIN, 40));
			numberButtons[i].setFocusable(false);
			numberButtons[i].setBackground(Color.WHITE);
		}
		for(int i = 0;i < 10;i++) {
			operatorButtons[i].addActionListener(this);
		    operatorButtons[i].setFont(new Font("NewellsHand", Font.PLAIN,40));
			operatorButtons[i].setFocusable(false);
			operatorButtons[i].setBackground(Color.WHITE);
			
		}
		
		
		panel = new JPanel();
		
		panel.setBounds(7,160,355,340);
		panel.setLayout(new GridLayout(5,4,1,1));
		
		//add các button vào panel
		
		panel.add(sqrtButton);
		panel.add(delButton);
		panel.add(clrButton);
		panel.add(divButton);
		
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
	
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		
		panel.add(negButton);
		panel.add(numberButtons[0]);
		panel.add(dotButton);
		panel.add(equButton);
		
		frame.add(panel);
		frame.setVisible(true);
		
		

		
	}
public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == numberButtons[i]) {//chỉ nhập được số (cho số thứ nhất)
				resultArea.setText(resultArea.getText().concat(String.valueOf(i)));
				
			}
		}
		
		
		if(e.getSource() == dotButton) {
			resultArea.setText(resultArea.getText().concat("."));
			
		}
		
		
		
		if(e.getSource() == addButton) {
			num1 = Integer.parseInt(resultArea.getText());
			sign = "+";
			resultArea.setText("");
			
		}
		if(e.getSource() == subButton) {
			num1 = Integer.parseInt(resultArea.getText());
			sign = "-";
			resultArea.setText("");
			
		}
		if(e.getSource() == mulButton) {
			num1 = Integer.parseInt(resultArea.getText());
			sign ="*";
			resultArea.setText("");
			
		}

		if(e.getSource() == divButton) {
			num1 = Integer.parseInt(resultArea.getText());
			sign ="/";
			resultArea.setText("");
			
		}
		if(e.getSource() == sqrtButton) {
			num1 = Integer.parseInt(resultArea.getText());
			result = Math.sqrt(num1);
			resultArea.setText(String.valueOf(result));
		}
		if(e.getSource() == equButton) {
			num2 = Integer.parseInt(resultArea.getText());
			
			switch(sign) {
			case "+":
				result =(int) (num1 + num2);
				break;
				
			
			case "-":
				result =(int) (num1 - num2);
				break;
			case "*":
				result =(int) ( num1 * num2);
				break;
			case "/":
				result =(int ) (num1 / num2);
				break;
		}
			resultArea.setText(String.valueOf(result));
			num1 = result;
			
		}
		if(e.getSource() == clrButton) {
			resultArea.setText("");
			
		}
		if(e.getSource() == delButton) {
			String string = resultArea.getText();
			resultArea.setText("");
			for(int i = 0; i < string.length() - 1; i++) {
				resultArea.setText(resultArea.getText()+ string.charAt(i));
				  	
			}
			
		}
		if(e.getSource() == negButton) {
			int temp = Integer.parseInt(resultArea.getText());
			temp *= -1;
			resultArea.setText(Integer.toString(temp));
		}
		
			
		}
	public static void main (String [] args) {
		StandardCalculator standCal = new StandardCalculator();
	}
}

