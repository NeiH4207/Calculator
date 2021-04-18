package Calculation;
import javax.swing.*;
	
public class Calculator{
	
	JFrame frame;
	CalculatingPanel CalPanel = new CalculatingPanel();
	ShowResultField ResultArea = new ShowResultField();
	HistoryField HistoryArea = new HistoryField();
	SymbolTable SymTable = new SymbolTable();
	StandardSymbolTable SymTable2 = new StandardSymbolTable();
	Processor Processor = new Processor(CalPanel, SymTable, ResultArea, HistoryArea);

	public Calculator() {}
	
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
	public StandardSymbolTable getStandardSymbolTable() {
        return SymTable2;
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