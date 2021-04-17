package Calculation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatingPanel {

	JTextArea Panel = new JTextArea();
	String Expression = "";
	double Value = 0;
	int WIDTH, HEIGHT;
	Color BG_COLOR = Color.WHITE;

	CalculatingPanel(){
		Panel.setBackground(BG_COLOR);
		Panel.setBounds(10, 50, 1440, 90);
		Panel.setFont(new Font("NewellsHand", Font.PLAIN, 10));
	}

	boolean ValidateExpression(String expression){
		return true;
	}

	public void show(){
		
	}

}
