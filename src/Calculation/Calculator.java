package Calculation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
	
public class Calculator{
	
	JFrame frame;
	CalculatingPanel CalPanel = new CalculatingPanel();
	ShowResultField ResultArea = new ShowResultField();
	HistoryField HistoryArea = new HistoryField();
	SymbolTable SymTable = new SymbolTable();
	Processor Processor = new Processor();
	
	double num1 = 0,num2= 0, result = 0;
	String sign;

	double CurrentNumber = 0;

	double Value[] = {0, 0};
	
	public Calculator() {
		
	}
	
	public CalculatingPanel getCalculatingPanel() {
        return CalPanel;
    }
	public ShowResultField getShowResultField() {
        return ResultArea;
    }
	public HistoryField getHistoryField() {
        return HistoryArea;
    }
	public SymbolTable getSymbolTable() {
        return SymTable;
    }
	public Processor getProcessor() {
        return Processor;
    }
	
 
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
}