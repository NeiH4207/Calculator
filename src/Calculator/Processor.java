package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Processor {
  public enum Standard {
		add, sub, mul, div, sqrt, neg 
	}
	public enum Science {
		sin, cos, tan, cot, abs, fac, sqr, ln, log, pow, pow10, round, mod, e, pi
	}
	double num1, num2 , result;
	public Standard Operator = Standard.add;
	public Science  newOperator = Science.sin;
	public double calcStandard() {
		if(Operator == Standard.add) {
			result = num1 + num2;
		}
		if(Operator == Standard.sub) {
			result = num1 - num2;
		}
		if(Operator == Standard.mul) {
			result = num1 * num2;
		}
		if(Operator == Standard.div) {
			result =  num1 / num2;
		}
		return result;
		
	}
	public double calcScience() {
		if(newOperator == Science.e) {
			result = Math.E;
		}
		if(newOperator == Science.pi) {
			result = Math.PI;
		}
		if(newOperator == Science.sin) {
			result = Math.sin(num1);
		}
		if(newOperator == Science.cos) {
			result = Math.cos(num1);
		}
		if(newOperator == Science.tan) {
			result = Math.tan(num1);
		}
		if(newOperator == Science.cot) {
			result = 1 / Math.tan(num1);
		}
		if(newOperator == Science.abs) {
			result = Math.abs(num1);
		}
		if(newOperator == Science.fac) {
			result = factorial((int) num1);
		}
		if(newOperator == Science.sqr) {
			result = num1 * num1;
		}
		if(newOperator == Science.ln) {
			result = Math.log(num1);
		}
		if(newOperator == Science.log) {
			result = Math.log10(num1);
		}
		if(newOperator == Science.pow) {
			result = Math.pow(num1, num2);
		}
		if(newOperator == Science.pow10) {
			result = Math.pow(10, num1);
		}
		return result;
		
		
	}
	public double factorial(int number) {
		double result = 1;
		if ((number == 0) || (number ==1)) {
		return 1;
		}
		for(int i = 1; i <= number; i++) {
		result *= i;
		}
		return result;
	}

}
