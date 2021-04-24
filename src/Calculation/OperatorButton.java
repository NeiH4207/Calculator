package Calculation;
import javax.swing.*;
import java.awt.*;

public class OperatorButton {

	JButton add = new JButton(), sub = new JButton(), mul = new JButton(), div = new JButton();
	JButton dot = new JButton(), equ = new JButton(), del = new JButton(), clr = new JButton();
	JButton sqrt = new JButton(), neg = new JButton();
	JButton sin = new JButton(), cos = new JButton(), tan = new JButton(), cot = new JButton();
	JButton sqr = new JButton(), abs = new JButton(), pow = new JButton(), fac = new JButton();
	JButton e = new JButton(), pi = new JButton();
	JButton ln = new JButton(), log = new JButton(), pow10 = new JButton(), round = new JButton(), mod = new JButton();

	JButton Buttons[] = {
		add, sub, mul, div, dot, mod, del, clr,
		sqrt, neg, sin, cos, tan, cot, sqr, abs, 
		pow, fac, e, pi, ln, log, pow10, round, equ
	};
	
	int X, Y;
	int WIDTH, HEIGHT;
	Font NumberFont;
	Color BG_COLOR = Color.WHITE;
	Font operFont = new Font("NewellsHand", Font.PLAIN, 30) ;

	OperatorButton(){
		super();
		createOperatorButton();
	}

	public void createOperatorButton() {
        String path = System.getProperty("user.dir");

		add.setText("+");
		sub.setText("-");
		mul.setText("*");
		div.setIcon(new ImageIcon(path + "/images/div.png"));
		dot.setText(".");
		mod.setText("mod");
		sin.setText("sin");
		cos.setText("cos");
		tan.setText("tan");
		pow.setIcon(new ImageIcon(path + "/images/pow.png"));
		cot.setText("cot");
		e.setText("e");
		pi.setText("\u03C0");
		sqr.setIcon(new ImageIcon(path + "/images/sqr.png"));
		sqrt.setIcon(new ImageIcon(path + "/images/sqrt.png"));
		abs.setIcon(new ImageIcon(path + "/images/abs.png"));
		fac.setText("n!");
		round.setText("x");
		abs.setIcon(new ImageIcon(path + "/images/abs.png"));
		clr.setIcon(new ImageIcon(path + "/images/clear.png"));
		neg.setText("+/_");
		ln.setText("ln");
		log.setText("log");
		pow10.setText("x^10");
		del.setIcon(new ImageIcon(path + "/images/delete.png"));
		equ.setText("="); 

		for(int i = 0; i < Buttons.length; i++) {
			Buttons[i].setBackground(BG_COLOR);
			Buttons[i].setFont(operFont);
		}
	}

	public void setNumberButton() {
		for(int i = 0; i < Buttons.length; i++) {
			Buttons[i].setBackground(BG_COLOR);
			Buttons[i].setFont(operFont);
		}
	}
    
}
