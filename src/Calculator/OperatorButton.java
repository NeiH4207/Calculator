package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OperatorButton {

	JButton addButton, subButton, mulButton, divButton;
	JButton dotButton, equButton, delButton, clrButton;
	JButton sqrtButton, negButton;
	JButton sinButton, cosButton, tanButton, cotButton;
	JButton sqrButton, absButton, powButton, facButton;
	JButton eButton, piButton;
	JButton lnButton, logButton, pow10Button, roundButton, modButton;

	JButton[] operatorButtons = {
		addButton, subButton, mulButton, divButton,
		dotButton, equButton, delButton, clrButton,
		sqrtButton, negButton, sinButton, cosButton, 
		tanButton, cotButton, sqrButton, absButton, 
		powButton, facButton, eButton, piButton, lnButton, 
		logButton, pow10Button, roundButton, modButton
	};
	
	int X, Y;
	int WIDTH, HEIGHT;
	Font NumberFont;
	Color BG_COLOR = new Color(0,0,0);
	Font numberFont = new Font("NewellsHand",Font.PLAIN, 50) ;

	OperatorButton(){
		super();
		createOperatorButton();

	}

	public void createOperatorButton() {
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton(new ImageIcon("/images/div.png"));
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
