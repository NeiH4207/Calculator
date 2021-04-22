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
		
		
		CalPanel.Panel.setBounds(10, 50, 700, 90);
		CalPanel.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 30));
		frame.add(CalPanel.Panel);
		
		ResultArea.Panel.setBounds(10,170,700,100);
		ResultArea.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 30));
		frame.add(ResultArea.Panel);
		
		HistoryArea.Panel.setBounds(720,50, 350, 650);
		HistoryArea.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 30));
		frame.add(HistoryArea.Panel);
		
		SymTable.Panel.setBounds(10,300,700,400);	
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
		Processor.Implement(e);
	}
	
	public static void main(String [] args) {
		new ScienceCalculator ();
	}

}
