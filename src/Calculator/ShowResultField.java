package Calculator;
import javax.swing.*;
import java.awt.*;

public class ShowResultField {
	JLabel ShowResultLabel = new JLabel();
	double value;
	int X, Y;
	int WIDTH, HEIGHT;
	Color BG_COLOR = new Color(0,0,0);
	//resultArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	public void setLabel(int x, int y, int width, int height) {
		X = x;
		Y = y;
		WIDTH = width;
		HEIGHT = height;
		ShowResultLabel.setBounds(X, Y, WIDTH, HEIGHT);
		ShowResultLabel.setBackground(BG_COLOR);
	}
	  

}
