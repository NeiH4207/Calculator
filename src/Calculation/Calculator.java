package Calculation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
	
public class Calculator implements ActionListener {
	
	
	JFrame frame;
	Font font;
	JTextArea resultArea;
	JButton[] numberButtons = new JButton[10];
	JButton[] operatorButtons = new JButton[15];
	JButton addButton, subButton, mulButton, divButton;
	JButton dotButton, equButton, delButton, clrButton;
	JButton sqrtButton, negButton;
	JPanel panel;
	
	double num1 = 0,num2= 0, result = 0;
	String sign;
	
	public Calculator() {
		
	}
	
	public Calculator(JFrame frame, Font font, JButton[] numberButtons, JButton[] operatorButtons, JPanel panel,JTextArea resultArea) {
		this.frame = frame;
		this.font = font;
		this.numberButtons = numberButtons;
		this.operatorButtons = operatorButtons;
		this.panel = panel;
		this.resultArea = resultArea;
	}
	
	public JTextArea getResultArea() {
        return resultArea;
    }
	
 
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton[] getOperatorButtons() {
		return operatorButtons;
	}


	public void setOperatorButtons(JButton[] operatorButtons) {
		this.operatorButtons = operatorButtons;
	}


	public JButton getNegButton() {
		return negButton;
	}


	public void setNegButton(JButton negButton) {
		this.negButton = negButton;
	}


	public JPanel getPanel() {
		return panel;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}


	public Font getFont() {
		return font;
	}


	public void setFont(Font font) {
		this.font = font;
	}


	public String getSign() {
		return sign;
	}


	public void setSign(String sign) {
		this.sign = sign;
	}


	public JButton getAddButton() {
		return addButton;
	}


	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}


	public JButton getSubButton() {
		return subButton;
	}


	public void setSubButton(JButton subButton) {
		this.subButton = subButton;
	}


	public JButton getMulButton() {
		return mulButton;
	}


	public void setMulButton(JButton mulButton) {
		this.mulButton = mulButton;
	}


	public JButton getDivButton() {
		return divButton;
	}


	public void setDivButton(JButton divButton) {
		this.divButton = divButton;
	}


	public JButton getDotButton() {
		return dotButton;
	}


	public void setDotButton(JButton dotButton) {
		this.dotButton = dotButton;
	}


	public JButton getEquButton() {
		return equButton;
	}


	public void setEquButton(JButton equButton) {
		this.equButton = equButton;
	}


	public JButton getDelButton() {
		return delButton;
	}


	public void setDelButton(JButton delButton) {
		this.delButton = delButton;
	}


	public JButton getClrButton() {
		return clrButton;
	}


	public void setClrButton(JButton clrButton) {
		this.clrButton = clrButton;
	}


	public JButton getSqrtButton() {
		return sqrtButton;
	}


	public void setSqrtButton(JButton sqrtButton) {
		this.sqrtButton = sqrtButton;
	}


	public double getResult() {
		return result;
	}


	public void setResult(double result) {
		this.result = result;
	}


	public void setResultArea(JTextArea resultArea) {
		this.resultArea = resultArea;
	}
	


	

	public static void main(String [] args) {
		Calculator calc = new Calculator();
	}

	@Override
	// đây là phương thức 
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
