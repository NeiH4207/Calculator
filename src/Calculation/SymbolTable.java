package Calculation;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

class NumberButton {
	int X, Y;
	int WIDTH, HEIGHT;
	Font NumberFont;
	Color BG_COLOR = Color.WHITE;
	Font numberFont = new Font("NewellsHand",Font.PLAIN, 30) ;
	JButton One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero;
	JButton Buttons[] = {Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine};

	NumberButton(){
		super();
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

class OperatorButton {

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
		sin.setIcon(new ImageIcon(path + "/images/sin.png"));
		cos.setIcon(new ImageIcon(path + "/images/cos.png"));
		tan.setIcon(new ImageIcon(path + "/images/tan.png"));
		pow.setIcon(new ImageIcon(path + "/images/pow.png"));
		cot.setIcon(new ImageIcon(path + "/images/cot.png"));
		e.setText("e");
		pi.setText("\u03C0");
		sqr.setIcon(new ImageIcon(path + "/images/sqr.png"));
		sqrt.setIcon(new ImageIcon(path + "/images/sqrt.png"));
		abs.setIcon(new ImageIcon(path + "/images/abs.png"));
		fac.setText("n!");
		round.setText("x");
		abs.setIcon(new ImageIcon(path + "/images/abs.png"));
		clr.setText("+/_");
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


public class SymbolTable{
    NumberButton numButton = new NumberButton();
    OperatorButton operButton = new OperatorButton();
    JPanel Panel = new JPanel();

    SymbolTable(){
		Panel.setBounds(10,400,1440,600);
		Panel.setLayout(new GridLayout(7,5,1,1));
	    
	    
		Panel.add(operButton.ln);
		Panel.add(operButton.log);
		Panel.add(operButton.pow10);
		Panel.add(operButton.del);
		Panel.add(operButton.clr);
		
		Panel.add(operButton.fac);
		Panel.add(operButton.pi);
		Panel.add(operButton.e);
		Panel.add(operButton.round);
		Panel.add(operButton.mod);
		
		Panel.add(operButton.sin);
		Panel.add(operButton.cos);
		Panel.add(operButton.tan);
		Panel.add(operButton.cot);
		Panel.add(operButton.div);
		
		Panel.add(operButton.pow);
		Panel.add(numButton.Buttons[7]);
		Panel.add(numButton.Buttons[8]);
		Panel.add(numButton.Buttons[9]);
		Panel.add(operButton.mul);
		
		Panel.add(operButton.sqr);
		Panel.add(numButton.Buttons[4]);
		Panel.add(numButton.Buttons[5]);
		Panel.add(numButton.Buttons[6]);
		Panel.add(operButton.sub);
		
		Panel.add(operButton.sqrt);
		Panel.add(numButton.Buttons[1]);
		Panel.add(numButton.Buttons[2]);
		Panel.add(numButton.Buttons[3]);
		Panel.add(operButton.add);
		
		Panel.add(operButton.abs);
		Panel.add(operButton.neg);
		Panel.add(numButton.Buttons[0]);
		Panel.add(operButton.dot);
		Panel.add(operButton.equ);
    }

}
