package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberButton {
	int X, Y;
	int WIDTH, HEIGHT;
	Font NumberFont;
	Color BG_COLOR = new Color(0,0,0);
	Font numberFont = new Font("NewellsHand",Font.PLAIN, 60) ;
	JButton One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero;
	JButton numberButtons[] = {Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine};

	NumberButton(){
		super();
		creatNumberButton();
	}
	
	public void creatNumberButton() {
		for(int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(Integer.toString(i));
			numberButtons[i].setBackground(BG_COLOR);
			numberButtons[i].setFont(numberFont);
		}
	}
	
	public void setNumberButton(int x, int y, int width, int height) {
		X = x;
		Y = y;
		WIDTH = width;
		HEIGHT = height;
		for(JButton button : numberButtons) {
			button.setBounds(X,Y, WIDTH, HEIGHT);
		}
	}
	

}
