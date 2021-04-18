package Calculation;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

	
public class ScienceCalculator extends Calculator implements ActionListener{

	public ScienceCalculator() {
		CalculatingPanel CalPanel = getCalculatingPanel();
		ShowResultField ResultArea = getShowResultField();
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

		CalPanel.setBound(10,170,700,200);
		CalPanel.setFont(new Font("NewellsHand", Font.PLAIN, 30));
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
		if (CalPanel.EndExpression == true){
			CalPanel.EndExpression = false;
			CalPanel.setText("");
		}

		for(int i = 0; i < 10; i++) {
			if(e.getSource() == SymTable.numButton.Buttons[i]) {
				CalPanel.setText(CalPanel.getText().concat(Integer.toString(i)));
				CalPanel.setValue(CalPanel.getValue() * 10 + i);
			}
		}

		if(e.getSource() == SymTable.operButton.e) {
			CalPanel.setText(CalPanel.getText().concat("e"));
			CalPanel.setValue(Double.parseDouble(String.valueOf(Math.E)));
		}
		//concat nối thêm chuỗi cố định vào cuối chuỗi đã cho
		if(e.getSource() == SymTable.operButton.pi) {
			CalPanel.setText(CalPanel.getText().concat(e.getActionCommand()));
			CalPanel.setValue(Double.parseDouble(String.valueOf(Math.PI)));
		}
		
		if(e.getSource() == SymTable.operButton.dot) {
			CalPanel.setText(CalPanel.getText().concat("."));
			CalPanel.sign[CalPanel.nValues] = '.';
			CalPanel.nValues += 1;
		}
		
		if(e.getSource() == SymTable.operButton.abs) {
			CalPanel.setText("|" + CalPanel.getText() + "|");
			CalPanel.setValue(Math.abs(CalPanel.getValue()));
			// CalPanel.setText(String.valueOf(result));
		}
		if(e.getSource() == SymTable.operButton.sqrt) {
			CalPanel.setValue(Math.sqrt(CalPanel.getValue()));
			CalPanel.setText("sqrt(" + CalPanel.getText() + ")");
		}
		if(e.getSource() == SymTable.operButton.sqr) {
			double num = Double.parseDouble(CalPanel.getText());
			result = num * num;
			CalPanel.setText("sqr(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
			// ResultArea.Panel.setText(String.valueOf(result));
		}
		
		if(e.getSource() == SymTable.operButton.sin) {
			result = Math.sin(CalPanel.getValue());
			CalPanel.setText("sin(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
			// ResultArea.Panel.setText("sin("+ String.valueOf(num) + ") " + "=");
		}

		if(e.getSource() == SymTable.operButton.cos) {
			result = Math.cos(CalPanel.getValue());
			CalPanel.setText("cos(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
		}
		if(e.getSource() == SymTable.operButton.tan) {
			result = Math.tan(CalPanel.getValue());
			CalPanel.setText("tan(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
		}
		if(e.getSource() == SymTable.operButton.cot) {
			result = 1.0 / Math.tan(CalPanel.getValue());
			CalPanel.setText("cot(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
		}
		
		if(e.getSource() == SymTable.operButton.fac) {
			if ((int) CalPanel.getValue() == (int) CalPanel.getValue()){
				CalPanel.EndExpression = true;
				CalPanel.setText("Error Double Value Factorial!");
			} else{
				result = factorial((int) CalPanel.getValue());
				CalPanel.setText("(" + CalPanel.getText() + ")!");
				CalPanel.setValue(result);
			}
		}

		if(e.getSource() == SymTable.operButton.pow10) {
			CalPanel.setValue(Math.pow(10, CalPanel.getValue()));
			CalPanel.setText("10^(" + CalPanel.getText() + ")");
		}

		if(e.getSource() == SymTable.operButton.pow) {
			CalPanel.sign[CalPanel.nValues] = '^';
			CalPanel.nValues += 1;
			CalPanel.setText("(" + CalPanel.getText() + ")^");
		}

		if(e.getSource() == SymTable.operButton.round) {
			result = Math.round(CalPanel.getValue());
			CalPanel.setValue(result);
			CalPanel.setText("round(" + CalPanel.getText() + ") " + "=");
		}
		
		if(e.getSource() == SymTable.operButton.add) {
			CalPanel.sign[CalPanel.nValues] = '+';
			CalPanel.nValues += 1;
			CalPanel.setText(CalPanel.getText() + " + ");
		}

		if(e.getSource() == SymTable.operButton.sub) {
			CalPanel.sign[CalPanel.nValues] = '-';
			CalPanel.nValues += 1;
			CalPanel.setText(CalPanel.getText() + " - ");
			//ResultArea.Panel.setText(String.valueOf(num1));
		}
		if(e.getSource() == SymTable.operButton.mul) {
			CalPanel.sign[CalPanel.nValues] = '*';
			CalPanel.nValues += 1;
			CalPanel.setText(CalPanel.getText() + " * ");
			//ResultArea.Panel.setText(String.valueOf(num1));
		}

		if(e.getSource() == SymTable.operButton.div) {
			CalPanel.sign[CalPanel.nValues] = '/';
			CalPanel.nValues += 1;
			CalPanel.setText(CalPanel.getText() + " / ");
			//ResultArea.Panel.setText(String.valueOf(num1));
		}
		if(e.getSource() == SymTable.operButton.pow) {
			num1 = Double.parseDouble(CalPanel.getText());
			sign = "pow";
			CalPanel.setText("");
			//ResultArea.Panel.setText(String.valueOf(num1));
		}
		if(e.getSource() == SymTable.operButton.equ) {
			
			ResultArea.Panel.setText(String.valueOf(CalPanel.getGolbalValue()));
			CalPanel.setText(CalPanel.getText() + " =");
			CalPanel.resetValue();
			CalPanel.EndExpression = true;
		}
		if(e.getSource() == SymTable.operButton.clr) {
			CalPanel.setText("");
			CalPanel.resetValue();
			ResultArea.Panel.setText("");
		}

		// if(e.getSource() == SymTable.operButton.del) {
		// 	String s = CalPanel.getText();
		// 	CalPanel.setText(s.substring(0, s.length() - 1));
		// 	CalPanel.setText(s);
		// }
		
		// if(e.getSource() == SymTable.operButton.neg) {
		// 	double temp = Double.parseDouble(CalPanel.getText());
		// 	temp *=-1;
		// 	CalPanel.setText(String.valueOf(temp));
		// }
	
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
