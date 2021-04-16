package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OperatorButton {
	JButton[] operatorButtons = new JButton[25];
	JButton addButton, subButton, mulButton, divButton;
	JButton dotButton, equButton, delButton, clrButton;
	JButton sqrtButton, negButton;
	JButton sinButton, cosButton, tanButton, cotButton;
	JButton sqrButton, absButton, powButton, facButton;
	JButton eButton, piButton;
	JButton lnButton, logButton, pow10Button, roundButton, modButton;
	
	int X, Y;
	int WIDTH, HEIGHT;
	Font NumberFont;
	Color BG_COLOR = new Color(0,0,0);
	Font numberFont = new Font("NewellsHand",Font.PLAIN, 50) ;
	public void createOperatorButton() {
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton= new JButton(new ImageIcon("/images/div.png"));
		dotButton = new JButton(".");
		equButton = new JButton("=");
		sinButton = new JButton(new ImageIcon("/images/sin.png"));
		cosButton = new JButton(new ImageIcon("/images/cos.png"));
		tanButton = new JButton(new ImageIcon("/images/tan.png"));
		powButton = new JButton(new ImageIcon("/images/pow.png"));
		cotButton = new JButton(new ImageIcon("/images/cot.png"));
		eButton = new JButton("e");
		piButton = new JButton(new ImageIcon("/images/So_pi.png"));
		sqrButton = new JButton(new ImageIcon("/images/sqr.png"));
		sqrtButton = new JButton(new ImageIcon("/images/sqrt.png"));
		absButton = new JButton(new ImageIcon("/images/abs.png"));
		facButton = new JButton("n!");
		delButton = new JButton(new ImageIcon("/images/delete.png"));
		clrButton = new JButton(new ImageIcon("/images/abs.png"));
		negButton = new JButton("+/_");
		lnButton = new JButton("ln");
		logButton = new JButton("log");
		pow10Button = new JButton("x^10");
		roundButton = new JButton("x");
		modButton = new JButton("mod"); 
		
		
		operatorButtons[0] = addButton;
		operatorButtons[1] = subButton;
		operatorButtons[2] = mulButton;
		operatorButtons[3] = divButton;
		operatorButtons[4] = dotButton;
		operatorButtons[5] = equButton;
		operatorButtons[6] = sinButton;
		operatorButtons[7] = cosButton;
		operatorButtons[8] = tanButton;
		operatorButtons[9] = cotButton;
		operatorButtons[10] = absButton;
		operatorButtons[11] = facButton;
		operatorButtons[12] = eButton;
		operatorButtons[13] = piButton;
		operatorButtons[14] = powButton;
		operatorButtons[15] = sqrtButton;
		operatorButtons[16] = sqrButton;
		operatorButtons[17] = delButton;
		operatorButtons[18] = clrButton;
		operatorButtons[19] = negButton;
		operatorButtons[20] = lnButton;
		operatorButtons[21] = logButton;
		operatorButtons[22] = pow10Button;
		operatorButtons[23] = roundButton;
		operatorButtons[24] = modButton;
		
		
		
	}
	public void setNumberButton(int x, int y, int width, int height) {
		X = x;
		Y = y;
		WIDTH = width;
		HEIGHT = height;
		for(int i = 0; i < 10; i++) {
			operatorButtons[i].setBounds(X,Y, WIDTH, HEIGHT);
			operatorButtons[i].setBackground(BG_COLOR);
			operatorButtons[i].setFont(numberFont);
		}
	}
}
