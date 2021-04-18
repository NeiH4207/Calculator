package Calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StandardCalculator extends Calculator implements ActionListener {
	

	public StandardCalculator() {	
		super();
		CalculatingPanel CalPanel = getCalculatingPanel();
		ShowResultField ResultArea = getShowResultField();
		//HistoryField HistoryArea = getHistoryField();
		SymbolTable SymTable = getSymbolTable();
		Processor Processor = getProcessor();
		
		
		frame = new JFrame("Standard Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(430,550);
		frame.setLayout(null);
		
		CalPanel.Panel.setBounds(5,15,400,140);
		CalPanel.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 50));
		frame.add(CalPanel.Panel);
		
		
		SymTable.Panel.setBounds(7,160,355,340);
		SymTable.Panel.setLayout(new GridLayout(5,4,1,1));
		
		for (JButton button : SymTable.numButton.Buttons){
            button.addActionListener(this);
        }
		
		for (JButton button : SymTable.operButton.Buttons){
            button.addActionListener(this);
        }
        
    frame.add(SymTable.Panel);
		frame.setVisible(true);
	}
  public void actionPerformed(ActionEvent e) {
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
		
	}
	public static void main (String [] args) {
		new StandardCalculator ();
	}
}
