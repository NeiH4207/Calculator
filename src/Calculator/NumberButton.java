package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NumberButton {
	JButton [] numberButtons = new JButton[10];
	
	JButton One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero;
	
	int X, Y;
	int WIDTH, HEIGHT;
	Font NumberFont;
	Color BG_COLOR = new Color(0,0,0);
	Font numberFont = new Font("NewellsHand",Font.PLAIN, 60) ;
	
	public void creatNumberButton() {
		Zero = new JButton("0");
		One = new JButton("1");
		Two = new JButton("2");
		Three = new JButton("3");
		Four = new JButton("4");
		Five = new JButton("5");
		Six = new JButton("6");
		Seven = new JButton("7");
		Eight = new JButton("8");
		Nine = new JButton("9");
		
		
		numberButtons[0] = Zero;
		numberButtons[1] = One;
		numberButtons[2] = Two;
		numberButtons[3] = Three;
		numberButtons[4] = Four;
		numberButtons[5] = Five;
		numberButtons[6] = Six;
		numberButtons[7] = Seven;
		numberButtons[8] = Eight;
		numberButtons[9] = Nine;
		
	}
	
	public void setNumberButton(int x, int y, int width, int height) {
		X = x;
		Y = y;
		WIDTH = width;
		HEIGHT = height;
		for(int i = 0; i < 10; i++) {
			numberButtons[i].setBounds(X,Y, WIDTH, HEIGHT);
			numberButtons[i].setBackground(BG_COLOR);
			numberButtons[i].setFont(numberFont);
		}
	}
	

}
