package Calculation;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class CalculatingPanel {

	private JTextArea Panel = new JTextArea();
	private Color BG_COLOR = Color.WHITE;
	private double Values[] = new double[100];
	char sign[] = new char[100];
	int nValues = 0;
	boolean EndExpression = false;

	CalculatingPanel(){
		this.Panel.setBackground(BG_COLOR);
		this.Panel.setBounds(10, 50, 1440, 90);
		this.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 10));
	}

	public JTextArea getPanel(){
		return this.Panel;
	}

	public void setBackgroundColor(Color c){
		this.Panel.setBackground(c);
	}

	public void setBounds(int x, int y, int width, int height){
		this.Panel.setBounds(x, y, width, height);
	}

	public void setText(String text){
		this.Panel.setText(text);
	}

	public String getText(){
		return this.Panel.getText();
	}

	public void setFont(Font f){
		this.Panel.setFont(f);
	}

	public void setValue(double value){
		this.Values[nValues] = value;
	}

	public void resetValue(){
		for (int i = 0; i < 6; i++){
			this.Values[i] = 0;
			sign[i] = '+';
		}
		this.nValues = 0;
	}

	public double getGlobalValue(){
		
		for (int i = 0; i < nValues; i++) {
			if (sign[i] == '.'){
				double value = this.Values[i + 1];
				while(value > 1){
					value /= 10.0;
				}
				this.Values[i] += value;
				for (int j = i + 1; j < this.nValues; j++) {
					this.Values[j] = this.Values[j + 1];
					this.sign[j - 1] = this.sign[j];
				}
				this.nValues -= 1;
			}
		}

		for (int i = 0; i < nValues; i++) {
			if (sign[i] == '^'){
				double value = Math.pow(this.Values[i], this.Values[i + 1]);
				this.Values[i] = value;
				this.Values[i + 1] = 1;
				this.sign[i] = '*';
			}
		}

		for (int i = 0; i < nValues; i++) {
			if (sign[i] == '*'){
				this.Values[i] *= this.Values[i + 1];
				for (int j = i + 1; j < this.nValues; j++) {
					this.Values[j] = this.Values[j + 1];
					this.sign[j - 1] = this.sign[j];
				}
				this.nValues -= 1;
				i -= 1;
				continue;
			}
			if (sign[i] == '/'){
				this.Values[i] /= this.Values[i + 1];
				for (int j = i + 1; j < this.nValues; j++) {
					this.Values[j] = this.Values[j + 1];
					this.sign[j - 1] = this.sign[j];
				}
				this.nValues -= 1;
				i -= 1;
				continue;
			}
		}
		
		double result = this.Values[0];

		for (int i = 0; i < nValues; i++){
			if (sign[i] == '+'){
				result += this.Values[i + 1];
			}
			if (sign[i] == '-'){
				result -= this.Values[i + 1];
			}
		}

		DecimalFormat df = new DecimalFormat("#.##");      
		result = Double.valueOf(df.format(result));
		return result;
	}

	public double getValue(){
		double result = this.Values[nValues];
		return result;
	}

	boolean ValidateExpression(String expression){
		return true;
	}

	public void show(){
		
	}

}
