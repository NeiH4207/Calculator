package Calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StandardCalculator extends Calculator implements ActionListener {
	

	public StandardCalculator() {	
		super();
		CalculatingPanel CalPanel = getCalculatingPanel();
		StandardSymbolTable SymTable2 = getStandardSymbolTable();
		
		frame = new JFrame("Standard Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(430,550);
		frame.setLayout(null);
		
		CalPanel.Panel.setBounds(5,15,400,140);
		CalPanel.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 30));
		frame.add(CalPanel.Panel);
		
		
		SymTable2.Panel.setBounds(7,160,400,340);
		SymTable2.Panel.setLayout(new GridLayout(5,4,1,1));
		
		for (JButton button : SymTable2.numButton.Buttons){
            		button.addActionListener(this);
        	}
		
		for (JButton button : SymTable2.operButton.Buttons){
            		button.addActionListener(this);
        	}
        
		frame.add(SymTable2.Panel);
		frame.setVisible(true);
		}

  	public void actionPerformed(ActionEvent e) {
		
		if (CalPanel.EndExpression == true){
			CalPanel.EndExpression = false;
			CalPanel.setText("");
		}

		for(int i = 0; i < 10; i++) {
			if(e.getSource() == SymTable2.numButton.Buttons[i]) {
				CalPanel.setText(CalPanel.getText().concat(Integer.toString(i)));
				CalPanel.setValue(CalPanel.getValue() * 10 + i);
			}
		}
		if(e.getSource() == SymTable2.operButton.dot) {
			CalPanel.setText(CalPanel.getText().concat("."));
			CalPanel.sign[CalPanel.nValues] = '.';
			CalPanel.nValues += 1;
			
		}
		if(e.getSource() == SymTable2.operButton.add) {
			CalPanel.sign[CalPanel.nValues] = '+';
			CalPanel.nValues += 1;
			CalPanel.setText(CalPanel.getText() + " + ");
		}
		if(e.getSource() == SymTable2.operButton.sub) {
			CalPanel.sign[CalPanel.nValues] = '-';
			CalPanel.nValues += 1;
			CalPanel.setText(CalPanel.getText() + " - ");
		}
		if(e.getSource() == SymTable2.operButton.mul) {
			CalPanel.sign[CalPanel.nValues] = '*';
			CalPanel.nValues += 1;
			CalPanel.setText(CalPanel.getText() + " * ");
		}
		if(e.getSource() == SymTable2.operButton.div) {
			CalPanel.sign[CalPanel.nValues] = '/';
			CalPanel.nValues += 1;
			CalPanel.setText(CalPanel.getText() + " / ");
		}
		if(e.getSource() == SymTable2.operButton.equ) {
			CalPanel.setText("= " + String.valueOf(CalPanel.getGlobalValue()));
			CalPanel.resetValue();
			CalPanel.EndExpression = true;
		}

		if(e.getSource() == SymTable2.operButton.sqrt) {
			double result = Math.sqrt(CalPanel.getGlobalValue());
			CalPanel.setText(" = " + String.valueOf(result));
			CalPanel.resetValue();
			CalPanel.EndExpression = true;
		}
		
		if(e.getSource() == SymTable2.operButton.del) {
			CalPanel.setText(CalPanel.getText().substring(0, CalPanel.getText().length() - 1));
			CalPanel.setValue((int) CalPanel.getValue() / 10);
		}
		
		if(e.getSource() == SymTable2.operButton.clr) {
			CalPanel.setText("");
			CalPanel.resetValue();
			ResultArea.Panel.setText("");
		}
		
	}
	public static void main (String [] args) {
		new StandardCalculator ();
	}
}
