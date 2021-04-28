package Calculation;
import java.awt.event.*;

public class Processor{

	CalculatingPanel CalPanel;
	ShowResultField ResultArea;
	HistoryField HistoryArea;
	SymbolTable SymTable;

	Processor(CalculatingPanel _CalPanel, SymbolTable _SymTable,
			  ShowResultField _ResultArea, HistoryField _HisArea){
		this.CalPanel = _CalPanel;
		this.SymTable = _SymTable;
		this.ResultArea = _ResultArea;
		this.HistoryArea = _HisArea;
	}

	public void Implement(ActionEvent e){
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
			CalPanel.setValue(Math.E);
		}
		//concat nối thêm chuỗi cố định vào cuối chuỗi đã cho
		if(e.getSource() == SymTable.operButton.pi) {
			CalPanel.setText(CalPanel.getText().concat(e.getActionCommand()));
			CalPanel.setValue(Math.PI);
		}
		
		if(e.getSource() == SymTable.operButton.dot) {
			CalPanel.setText(CalPanel.getText().concat("."));
			CalPanel.sign[CalPanel.nValues] = '.';
			CalPanel.nValues += 1;
		}

		if(e.getSource() == SymTable.operButton.abs) {
			double result = Math.abs(CalPanel.getGlobalValue());
			CalPanel.setText("|" + CalPanel.getText() + "|");
			CalPanel.resetValue();
			CalPanel.setValue(result);
			// CalPanel.setText(String.valueOf(result));
		}

		if(e.getSource() == SymTable.operButton.sqrt) {
			double result = Math.sqrt(CalPanel.getGlobalValue());
			CalPanel.setValue(result);
			CalPanel.resetValue();
			CalPanel.setText("sqrt(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
		}
		
		if(e.getSource() == SymTable.operButton.sqr) {
			double num = CalPanel.getGlobalValue();
			CalPanel.resetValue();
			double result = num * num;
			CalPanel.setText("sqr(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
			// ResultArea.Panel.setText(String.valueOf(result));
		}
		if(e.getSource() == SymTable.operButton.ln) {
			double result = Math.log(CalPanel.getGlobalValue());
			CalPanel.setText("ln(" + CalPanel.getText() + ")");
			CalPanel.resetValue();
			CalPanel.setValue(result);	
		}
		if(e.getSource() == SymTable.operButton.log) {
			double result = Math.log10(CalPanel.getGlobalValue());
			CalPanel.setText("log(" + CalPanel.getText() + ")");
			CalPanel.resetValue();
			CalPanel.setValue(result);	
		}
		
		if(e.getSource() == SymTable.operButton.sin) {
			double result = Math.sin(CalPanel.getGlobalValue());
			CalPanel.resetValue();
			CalPanel.setText("sin(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
			// ResultArea.Panel.setText("sin("+ String.valueOf(num) + ") " + "=");
		}

		if(e.getSource() == SymTable.operButton.cos) {
			double result = Math.cos(CalPanel.getGlobalValue());
			CalPanel.resetValue();
			CalPanel.setText("cos(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
		}
		if(e.getSource() == SymTable.operButton.tan) {
			double result = Math.tan(CalPanel.getGlobalValue());
			CalPanel.resetValue();
			CalPanel.setText("tan(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
		}
		if(e.getSource() == SymTable.operButton.cot) {
			double result = 1.0 / Math.tan(CalPanel.getGlobalValue());
			CalPanel.resetValue();
			CalPanel.setText("cot(" + CalPanel.getText() + ")");
			CalPanel.setValue(result);
		}
		if(e.getSource() == SymTable.operButton.fac) {
			if ((int) CalPanel.getValue() != (int) CalPanel.getGlobalValue()){
				CalPanel.EndExpression = true;
				CalPanel.setText("Error Double Value Factorial!");
				CalPanel.resetValue();
			} else{
				double result = factorial((int) CalPanel.getGlobalValue());
				CalPanel.resetValue();
				CalPanel.setText(CalPanel.getText() + "!");
				CalPanel.setValue(result);
			}
		}
		
		if(e.getSource() == SymTable.operButton.del) {
			CalPanel.setText(CalPanel.getText().substring(0, CalPanel.getText().length() - 1));
			CalPanel.setValue((int) CalPanel.getValue() / 10);
		}
		

		if(e.getSource() == SymTable.operButton.pow10) {
			CalPanel.setValue(Math.pow(10, CalPanel.getGlobalValue()));
			CalPanel.resetValue();
			CalPanel.setText("10^(" + CalPanel.getText() + ")");
		}

		if(e.getSource() == SymTable.operButton.pow) {
			CalPanel.sign[CalPanel.nValues] = '^';
			CalPanel.nValues += 1;
			CalPanel.setText("(" + CalPanel.getText() + ")^");
		}

		if(e.getSource() == SymTable.operButton.round) {
			double result = Math.round(CalPanel.getGlobalValue());
			CalPanel.resetValue();
			CalPanel.setValue(result);
			CalPanel.setText("round(" + CalPanel.getText() + ") ");
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
			double result = CalPanel.getGlobalValue();
			ResultArea.Panel.setText(String.valueOf(result));
			HistoryArea.add(CalPanel.getText() + " = " + String.valueOf(result));
			CalPanel.setText(CalPanel.getText() + " =");
			CalPanel.resetValue();
			CalPanel.EndExpression = true;
			HistoryArea.show();
		}
		if(e.getSource() == SymTable.operButton.clr) {
			CalPanel.setText("");
			CalPanel.resetValue();
			ResultArea.Panel.setText("");
			HistoryArea.clear();
		}
	}

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

}
