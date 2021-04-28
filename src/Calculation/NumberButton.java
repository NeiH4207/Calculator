package Calculation;
import javax.swing.*;
import java.awt.*;

public class NumberButton {
	int X, Y;
	int WIDTH, HEIGHT;
	Font NumberFont;
	Color BG_COLOR = Color.WHITE;
	Font numberFont = new Font("NewellsHand",Font.PLAIN, 30) ;
	JButton One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero;
	JButton Buttons[] = {Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine};

	NumberButton(){
		creatNumberButton();
	}
	
	public void creatNumberButton() {
		for(int i = 0; i < 10; i++) {
			Buttons[i] = new JButton(Integer.toString(i));
			Buttons[i].setBackground(BG_COLOR);
			Buttons[i].setFont(numberFont);
		}
	}
	
	public void setNumberButton(int x, int y, int width, int height) {
		X = x;
		Y = y;
		WIDTH = width;
		HEIGHT = height;
		for(JButton button : Buttons) {
			button.setBounds(X,Y, WIDTH, HEIGHT);
		}
	}
}
