package Calculation;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

	
public class ScienceCalculator extends Calculator implements ActionListener{

	public ScienceCalculator() {
		CalculatingPanel ResultArea = getCalculatingPanel();
		ShowResultField CalPanel = getShowResultField();
		HistoryField HistoryArea = getHistoryField();
		SymbolTable SymTable = getSymbolTable();
		Processor Processor = getProcessor();

		frame = new JFrame("Science Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1080,760);
		frame.setLayout(null);
		
		ResultArea.Panel.setBounds(10, 50, 700, 90);
		ResultArea.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 30));
		frame.add(ResultArea.Panel);

		CalPanel.Panel.setBounds(10,170,700,200);
		CalPanel.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 50));
		frame.add(CalPanel.Panel);
		
		HistoryArea.Panel.setBounds(720,10, 350, 750);
		HistoryArea.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 30));
		frame.add(HistoryArea.Panel);

		SymTable.Panel.setBounds(10,400,700,320);
		SymTable.Panel.setLayout(new GridLayout(7,5,1,1));

		for (JButton button : SymTable.numButton.Buttons){
            button.addActionListener(this);
        }
        
        for (JButton button : SymTable.operButton.Buttons){
            button.addActionListener(this);
        }
		frame.add(SymTable.Panel);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

        // // String s = e.getActionCommand();
		// System.out.println(SymTable.operButton.e);
		// System.out.println(e.getActionCommand());

		for(int i = 0; i < 10; i++) {
			if(e.getSource() == SymTable.numButton.Buttons[i]) {
				CalPanel.Panel.setText(CalPanel.Panel.getText().concat(Integer.toString(i)));
			}
		}

		if(e.getSource() == SymTable.operButton.e) {
			CalPanel.Panel.setText(CalPanel.Panel.getText().concat("e"));
			ResultArea.Panel.setText(ResultArea.Panel.getText().concat(String.valueOf(Math.E).substring(0,15)));
		}
		//concat nối thêm chuỗi cố định vào cuối chuỗi đã cho
		if(e.getSource() == SymTable.operButton.pi) {
			CalPanel.Panel.setText(CalPanel.Panel.getText().concat(e.getActionCommand()));
			ResultArea.Panel.setText(ResultArea.Panel.getText().concat((String.valueOf(Math.PI).substring(0, 15))));
		}
		
		if(e.getSource() == SymTable.operButton.dot) {
			CalPanel.Panel.setText(CalPanel.Panel.getText().concat("."));
			ResultArea.Panel.setText(ResultArea.Panel.getText().concat("."));
		}
		if(e.getSource() == SymTable.operButton.abs) {
			double num = Double.parseDouble(CalPanel.Panel.getText());
			if(num < 0) {
				result = (-1) * num;
			}else {
				result = num;
			}
			CalPanel.Panel.setText(String.valueOf(result));
			ResultArea.Panel.setText("abs(" + String.valueOf(result) + ")");
		}
		if(e.getSource() == SymTable.operButton.sqrt) {
			num1 = Double.parseDouble(CalPanel.Panel.getText());
			result = Math.sqrt(num1);
			CalPanel.Panel.setText(String.valueOf(result));
			ResultArea.Panel.setText(String.valueOf(result));
		}
		if(e.getSource() == SymTable.operButton.sqr) {
			num1 = Double.parseDouble(CalPanel.Panel.getText());
			result = num1 * num1;
			CalPanel.Panel.setText(String.valueOf(result));
			ResultArea.Panel.setText(String.valueOf(result));
		}
		
		if(e.getSource() == SymTable.operButton.sin) {
			double num = Double.parseDouble(CalPanel.Panel.getText());
			result = Math.sin(num);
			CalPanel.Panel.setText(String.valueOf(result));
			ResultArea.Panel.setText("sin("+ String.valueOf(num) + ") "+ "=");
		}
		if(e.getSource() == SymTable.operButton.cos) {
			double num = Double.parseDouble(CalPanel.Panel.getText());
			result = Math.cos(num);
			CalPanel.Panel.setText(String.valueOf(result));
			ResultArea.Panel.setText("cos("+ String.valueOf(num) + ") " + "=");
		}
		if(e.getSource() == SymTable.operButton.tan) {
			double num = Double.parseDouble(CalPanel.Panel.getText());
			result = Math.tan(num);
			CalPanel.Panel.setText(String.valueOf(result));
			ResultArea.Panel.setText("tan("+ String.valueOf(num) + ") " + "=");
		}
		if(e.getSource() == SymTable.operButton.cot) {
			double num = Double.parseDouble(CalPanel.Panel.getText());
			result = 1 / (Math.tan(num));
			CalPanel.Panel.setText("cot(String.valueOf(result)");
			ResultArea.Panel.setText("cot("+ String.valueOf(num) + ") " + "=");
		}
		
		
		if(e.getSource() == SymTable.operButton.fac) {
			int num = Integer.parseInt(CalPanel.Panel.getText());
			result = factorial(num);
			CalPanel.Panel.setText(String.valueOf(result));
			ResultArea.Panel.setText(String.valueOf(num) + "! " + "=");
		}
		if(e.getSource() == SymTable.operButton.pow10) {
			int num = Integer.parseInt(CalPanel.Panel.getText());
			result = Math.pow(10, num);
			CalPanel.Panel.setText(String.valueOf(result));
			ResultArea.Panel.setText("10^" + String.valueOf(num));
		}
		if(e.getSource() == SymTable.operButton.round) {
			double num = Double.parseDouble(CalPanel.Panel.getText());
			result = Math.ceil(num);
			CalPanel.Panel.setText(String.valueOf(result));
			ResultArea.Panel.setText("celi(" + String.valueOf(num) + ") " + "=");
		}
		
		
		if(e.getSource() == SymTable.operButton.add) {
			num1 = Double.parseDouble(CalPanel.Panel.getText());
			sign = "+";
			CalPanel.Panel.setText(e.getActionCommand() + "+");
			//ResultArea.Panel.setText(String.valueOf(num1));
		}
		if(e.getSource() == SymTable.operButton.sub) {
			num1 = Double.parseDouble(e.getActionCommand());
			sign = "-";
			CalPanel.Panel.setText("");
			//ResultArea.Panel.setText(String.valueOf(num1));
		}
		if(e.getSource() == SymTable.operButton.mul) {
			num1 = Double.parseDouble(CalPanel.Panel.getText());
			sign = "*";
			CalPanel.Panel.setText("");
			//ResultArea.Panel.setText(String.valueOf(num1));
		}

		if(e.getSource() == SymTable.operButton.div) {
			num1 = Double.parseDouble(CalPanel.Panel.getText());
			sign ="/";
			CalPanel.Panel.setText("");
			//ResultArea.Panel.setText(String.valueOf(num1));
		}
		if(e.getSource() == SymTable.operButton.pow) {
			num1 = Double.parseDouble(CalPanel.Panel.getText());
			sign = "pow";
			CalPanel.Panel.setText("");
			//ResultArea.Panel.setText(String.valueOf(num1));
		}
		if(e.getSource() == SymTable.operButton.equ) {
			num2 = Double.parseDouble(CalPanel.Panel.getText());
			HistoryArea.add(CalPanel.Panel.getText());
			HistoryArea.show();
			ResultArea.Panel.setText(String.valueOf(num2));
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
			
			ResultArea.Panel.setText(String.valueOf(num1)+ " " + sign + " " + String.valueOf(num2) + " =");
			CalPanel.Panel.setText(String.valueOf(result));
			num1 = result;
			
		}
		if(e.getSource() == SymTable.operButton.clr) {
			CalPanel.Panel.setText("");
			
		}
		if(e.getSource() == SymTable.operButton.del) {
			String result = CalPanel.Panel.getText();
			CalPanel.Panel.setText("");
			for(int i = 0; i < result.length() - 1; i++) {
				CalPanel.Panel.setText(CalPanel.Panel.getText()+ result.charAt(i));
				
				
			}
			
		}
		if(e.getSource() == SymTable.operButton.neg) {
			double temp = Double.parseDouble(CalPanel.Panel.getText());
			temp *=-1;
			CalPanel.Panel.setText(String.valueOf(temp));
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
		new ScienceCalculator ();
	}

}
