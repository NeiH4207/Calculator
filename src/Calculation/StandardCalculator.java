package Calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StandardCalculator extends Calculator implements ActionListener {
	
	protected CalculatingPanel CalPanel;
	protected StandardSymbolTable SymTable;
	protected Processor Processor;

	public StandardCalculator() {	
		super();
		CalPanel = getCalculatingPanel();
		SymTable = getStdSymbolTable();
		Processor = getProcessor();
		
		frame = new JFrame("Standard Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(430,550);
		frame.setLayout(null);
		
		CalPanel.setBounds(5,15,400,140);
		CalPanel.setFont(new Font("NewellsHand", Font.PLAIN, 30));
		frame.add(CalPanel.getPanel());
		
		SymTable.setBounds(7,160,400,340);
		SymTable.setLayout(new GridLayout(5,4,1,1));
		
		for (JButton button : SymTable.numButton.Buttons){
            		button.addActionListener(this);
        	}
		
		for (JButton button : SymTable.operButton.Buttons){
            		button.addActionListener(this);
        	}
        
		frame.add(SymTable.getPanel());
		frame.setVisible(true);
	}

  	public void actionPerformed(ActionEvent e) {
		Processor.Implement(e);
		
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
		if(e.getSource() == SymTable.operButton.dot) {
			CalPanel.setText(CalPanel.getText().concat("."));
			CalPanel.sign[CalPanel.nValues] = '.';
			CalPanel.nValues += 1;
			
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
		}
		if(e.getSource() == SymTable.operButton.mul) {
			CalPanel.sign[CalPanel.nValues] = '*';
			CalPanel.nValues += 1;
			CalPanel.setText(CalPanel.getText() + " * ");
		}
		if(e.getSource() == SymTable.operButton.div) {
			CalPanel.sign[CalPanel.nValues] = '/';
			CalPanel.nValues += 1;
			CalPanel.setText(CalPanel.getText() + " / ");
		}
		if(e.getSource() == SymTable.operButton.equ) {
			CalPanel.setText("= " + String.valueOf(CalPanel.getGlobalValue()));
			CalPanel.resetValue();
			CalPanel.EndExpression = true;
		}

		if(e.getSource() == SymTable.operButton.sqrt) {
			double result = Math.sqrt(CalPanel.getGlobalValue());
			CalPanel.setText(" = " + String.valueOf(result));
			CalPanel.resetValue();
			CalPanel.EndExpression = true;
		}
		
		if(e.getSource() == SymTable.operButton.del) {
			CalPanel.setText(CalPanel.getText().substring(0, CalPanel.getText().length() - 1));
			CalPanel.setValue((int) CalPanel.getValue() / 10);
		}
		
		if(e.getSource() == SymTable.operButton.clr) {
			CalPanel.setText("");
			CalPanel.resetValue();
			ResultArea.Panel.setText("");
		}
	}
	public static void main (String [] args) {
		new StandardCalculator ();
	}
}
