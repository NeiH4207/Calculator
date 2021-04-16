package Calculation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	
public class ScienceCalculator extends Calculator implements  ActionListener {
	
	JTextArea historyArea;
	
	JTextArea showArea;
	JButton[] operatorButtons = new JButton[25];
	//JButton addButton, subButton, mulButton, divButton;
	//JButton dotButton, equButton, delButton, clrButton;
	//JButton sqrtButton, negButton;
	JButton sinButton, cosButton, tanButton, cotButton;
	JButton sqrButton, absButton, powButton, facButton;
	JButton eButton, piButton;
	JButton lnButton, logButton, pow10Button, roundButton, modButton;
	
	
	public ScienceCalculator(JFrame frame, Font font, JButton[] numberButtons, JButton[] operatorButtons, JPanel panel ,JTextArea resultArea, JTextArea historyArea) {
		super();
		this.historyArea = historyArea;
	}
	public ScienceCalculator() {
		frame = new JFrame("Science Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  //set full screen
		frame.setLayout(null);
		
		
		
		showArea = new JTextArea();
		//showArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		showArea.setBounds(10,50,1440,90);
		showArea.setFont(new Font("NewellsHand", Font.PLAIN, 50));
		frame.add(showArea);
		
		
		resultArea = new JTextArea();
		//resultArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		resultArea.setBounds(10,170,1440,200);
		resultArea.setFont(new Font("NewellsHand", Font.PLAIN, 50));
		frame.add(resultArea);
		
		
	
		JTextArea historyArea = new JTextArea("History");
		historyArea.setBounds(1460,10,450,980);
		frame.add(historyArea);
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton= new JButton(new ImageIcon("/images/div.png"));
		dotButton = new JButton(".");
		equButton = new JButton("=");
		sinButton = new JButton(new ImageIcon("/images/sin.png"));
		cosButton = new JButton(new ImageIcon("/images/cos.png"));
		tanButton = new JButton(new ImageIcon("/images/tan.png"));
		powButton = new JButton(new ImageIcon("/images/pow.png"));
		cotButton = new JButton(new ImageIcon("/images/cot.png"));
		eButton = new JButton("e");
		piButton = new JButton(new ImageIcon("/images/So_pi.png"));
		sqrButton = new JButton(new ImageIcon("/images/sqr.png"));
		sqrtButton = new JButton(new ImageIcon("/images/sqrt.png"));
		absButton = new JButton(new ImageIcon("/images/abs.png"));
		facButton = new JButton("n!");
		delButton = new JButton(new ImageIcon("/images/delete.png"));
		clrButton = new JButton(new ImageIcon("/images/abs.png"));
		negButton = new JButton("+/_");
		lnButton = new JButton("ln");
		logButton = new JButton("log");
		pow10Button = new JButton("x^10");
		roundButton = new JButton("x");
		modButton = new JButton("mod");
		
		
		operatorButtons[0] = addButton;
		operatorButtons[1] = subButton;
		operatorButtons[2] = mulButton;
		operatorButtons[3] = divButton;
		operatorButtons[4] = dotButton;
		operatorButtons[5] = equButton;
		operatorButtons[6] = sinButton;
		operatorButtons[7] = cosButton;
		operatorButtons[8] = tanButton;
		operatorButtons[9] = cotButton;
		operatorButtons[10] = absButton;
		operatorButtons[11] = facButton;
		operatorButtons[12] = eButton;
		operatorButtons[13] = piButton;
		operatorButtons[14] = powButton;
		operatorButtons[15] = sqrtButton;
		operatorButtons[16] = sqrButton;
		operatorButtons[17] = delButton;
		operatorButtons[18] = clrButton;
		operatorButtons[19] = negButton;
		operatorButtons[20] = lnButton;
		operatorButtons[21] = logButton;
		operatorButtons[22] = pow10Button;
		operatorButtons[23] = roundButton;
		operatorButtons[24] = modButton;
		
		

		
		
		for(int i = 0; i < 5; i++) {
			operatorButtons[i].addActionListener(this);
			operatorButtons[i].setFont(new Font("NewellsHand", Font.PLAIN, 60));
			operatorButtons[i].setFocusable(false);
			operatorButtons[i].setBackground(Color.WHITE);
		}
		
		
		for(int i = 5; i < 25; i++) {
			operatorButtons[i].addActionListener(this);
			operatorButtons[i].setFont(new Font("NewellsHand", Font.PLAIN, 50));
			operatorButtons[i].setFocusable(false);
			operatorButtons[i].setBackground(Color.WHITE);
		}
		
		for(int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(new Font("NewellsHand",Font.PLAIN, 60));
			numberButtons[i].setFocusable(false);
			numberButtons[i].setBackground(Color.WHITE);
		}
		//tạo 1 cái panel để add các số và các operator và panel đó
		
		panel = new JPanel();
		//panel.setBackground(Color.PINK);
		//setBound(trụcOx, trục Oy, rộng, dài)
		panel.setBounds(10,400,1440,600);
		panel.setLayout(new GridLayout(7,5,1,1));
		
		frame.add(panel);

		panel.add(lnButton);
		panel.add(logButton);
		panel.add(pow10Button);
		panel.add(delButton);
		panel.add(clrButton);
		
		panel.add(facButton);
		panel.add(piButton);
		panel.add(eButton);
		panel.add(roundButton);
		panel.add(modButton);
		
		panel.add(sinButton);
		panel.add(cosButton);
		panel.add(tanButton);
		panel.add(cotButton);
		panel.add(divButton);
		
		panel.add(powButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		
		panel.add(sqrButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]) ;
		panel.add(subButton);
		
		panel.add(sqrtButton);
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		
		panel.add(absButton);
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
		if(e.getSource() == numberButtons[i]) {
			resultArea.setText(resultArea.getText().concat(String.valueOf(i)));
			
		}
	}
		if(e.getSource() == eButton) {
			resultArea.setText(resultArea.getText().concat(String.valueOf(Math.E).substring(0,15)));
			showArea.setText(showArea.getText().concat(String.valueOf(Math.E).substring(0,15)));
		}
		//concat nối thêm chuỗi cố định vào cuối chuỗi đã cho
		if(e.getSource() == piButton) {
			resultArea.setText(resultArea.getText().concat((String.valueOf(Math.PI).substring(0, 15))));
			showArea.setText(showArea.getText().concat((String.valueOf(Math.PI).substring(0, 15))));
		}
	
	if(e.getSource() == dotButton) {
		resultArea.setText(resultArea.getText().concat("."));
		showArea.setText(showArea.getText().concat("."));
	}
	if(e.getSource() == absButton) {
		double num = Double.parseDouble(resultArea.getText());
		if(num < 0) {
			result = (-1) * num;
		}else {
			result = num;
		}
		resultArea.setText(String.valueOf(result));
		showArea.setText("abs(" + String.valueOf(result) + ")");
	}
	if(e.getSource() == sqrtButton) {
		num1 = Double.parseDouble(resultArea.getText());
		result = Math.sqrt(num1);
		resultArea.setText(String.valueOf(result));
		showArea.setText(String.valueOf(result));
	}
	if(e.getSource() == sqrButton) {
		num1 = Double.parseDouble(resultArea.getText());
		result = num1 * num1;
		resultArea.setText(String.valueOf(result));
		showArea.setText(String.valueOf(result));
	}
	
	if(e.getSource() == sinButton) {
		double num = Double.parseDouble(resultArea.getText());
		result = Math.sin(num);
		resultArea.setText(String.valueOf(result));
		showArea.setText("sin("+ String.valueOf(num) + ") "+ "=");
	}
	if(e.getSource() == cosButton) {
		double num = Double.parseDouble(resultArea.getText());
		result = Math.cos(num);
		resultArea.setText(String.valueOf(result));
		showArea.setText("cos("+ String.valueOf(num) + ") " + "=");
	}
	if(e.getSource() == tanButton) {
		double num = Double.parseDouble(resultArea.getText());
		result = Math.tan(num);
		resultArea.setText(String.valueOf(result));
		showArea.setText("tan("+ String.valueOf(num) + ") " + "=");
	}
	if(e.getSource() == cotButton) {
		double num = Double.parseDouble(resultArea.getText());
		result = 1 / (Math.tan(num));
		resultArea.setText("cot(String.valueOf(result)");
		showArea.setText("cot("+ String.valueOf(num) + ") " + "=");
	}
	
	
	if(e.getSource() == facButton) {
		int num = Integer.parseInt(resultArea.getText());
		result = factorial(num);
		resultArea.setText(String.valueOf(result));
		showArea.setText(String.valueOf(num) + "! " + "=");
	}
	if(e.getSource() == pow10Button) {
		int num = Integer.parseInt(resultArea.getText());
		result = Math.pow(10, num);
		resultArea.setText(String.valueOf(result));
		showArea.setText("10^" + String.valueOf(num));
	}
	if(e.getSource() == roundButton) {
		double num = Double.parseDouble(resultArea.getText());
		result = Math.ceil(num);
		resultArea.setText(String.valueOf(result));
		showArea.setText("celi(" + String.valueOf(num) + ") " + "=");
	}
	
	
	if(e.getSource() == addButton) {
		num1 = Double.parseDouble(resultArea.getText());
		sign = "+";
		resultArea.setText("");
		//showArea.setText(String.valueOf(num1));
	}
	if(e.getSource() == subButton) {
		num1 = Double.parseDouble(resultArea.getText());
		sign = "-";
		resultArea.setText("");
		//showArea.setText(String.valueOf(num1));
	}
	if(e.getSource() == mulButton) {
		num1 = Double.parseDouble(resultArea.getText());
		sign = "*";
		resultArea.setText("");
		//showArea.setText(String.valueOf(num1));
	}

	if(e.getSource() == divButton) {
		num1 = Double.parseDouble(resultArea.getText());
		sign ="/";
		resultArea.setText("");
		//showArea.setText(String.valueOf(num1));
	}
	if(e.getSource() == powButton) {
		num1 = Double.parseDouble(resultArea.getText());
		sign = "pow";
		resultArea.setText("");
		//showArea.setText(String.valueOf(num1));
	}
	if(e.getSource() == equButton) {
		num2 = Double.parseDouble(resultArea.getText());
		showArea.setText(String.valueOf(num2));
		switch(sign) {
		case "+":
			result = num1 + num2;
			break;
		
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "pow":
			result = Math.pow(num1, num2);
	}
		
		showArea.setText(String.valueOf(num1)+ " " + sign + " " + String.valueOf(num2) + " =");
		resultArea.setText(String.valueOf(result));
		num1 = result;
		
	}
	if(e.getSource() == clrButton) {
		resultArea.setText("");
		
	}
	if(e.getSource() == delButton) {
		String result = resultArea.getText();
		resultArea.setText("");
		for(int i = 0; i < result.length() - 1; i++) {
			resultArea.setText(resultArea.getText()+ result.charAt(i));
			
			
		}
		
	}
	if(e.getSource()==negButton) {
		double temp = Double.parseDouble(resultArea.getText());
		temp *=-1;
		resultArea.setText(String.valueOf(temp));
	}
	
		
	}
// hàm tính giai thừa
	public double factorial(int number) {
		double result = 1;
		if ((number == 0) || (number ==1)) {
		return 1;
		}
		for(int i = 1; i <= number; i++) {
		result *= i;
		}
		return result;
	}

	public static void main(String [] args) {
		ScienceCalculator sicenCal = new ScienceCalculator ();
	}
}
