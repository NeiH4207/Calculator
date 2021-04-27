package Calculation;

import javax.swing.JPanel;
import java.awt.*;

public class StandardSymbolTable{
	NumberButton numButton = new NumberButton();
	OperatorButton operButton = new OperatorButton();
	private JPanel Panel = new JPanel();

	StandardSymbolTable(){
		Panel.setBounds(10,400,1440,600);
		Panel.setLayout(new GridLayout(7,5,1,1));
		
		Panel.add(operButton.sqrt);
		Panel.add(operButton.del);
		Panel.add(operButton.clr);
		Panel.add(operButton.div);

		Panel.add(numButton.Buttons[7]);
		Panel.add(numButton.Buttons[8]);
		Panel.add(numButton.Buttons[9]);
		Panel.add(operButton.mul);

		Panel.add(numButton.Buttons[4]);
		Panel.add(numButton.Buttons[5]);
		Panel.add(numButton.Buttons[6]);
		Panel.add(operButton.sub);
		
		Panel.add(numButton.Buttons[1]);
		Panel.add(numButton.Buttons[2]);
		Panel.add(numButton.Buttons[3]);
		Panel.add(operButton.add);

		Panel.add(operButton.neg);
		Panel.add(numButton.Buttons[0]);
		Panel.add(operButton.dot);
		Panel.add(operButton.equ);

	}
	
	public NumberButton getNumButton() {
		return numButton;
	}
	public void setNumButton(NumberButton numButton) {
		this.numButton = numButton;
	}

	public OperatorButton getOperButton() {
		return operButton;
	}
	public void setOperButton(OperatorButton operButton) {
		this.operButton = operButton;
	}
	
	public void setLayout(GridLayout GridLayout){
		this.Panel.setLayout(GridLayout);
	}

	public void setBackgroundColor(Color c){
		this.Panel.setBackground(c);
	}

	public void setBounds(int x, int y, int width, int height){
		this.Panel.setBounds(x, y, width, height);
	}

	public void setFont(Font f){
		this.Panel.setFont(f);
	}

	public JPanel getPanel() {
		return Panel;
	}

	public void setPanel(JPanel panel) {
		Panel = panel;
	}


}
