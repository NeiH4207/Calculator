package Calculation;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HistoryField {

	public JTextArea Panel = new JTextArea();
	private List<String> list = new ArrayList<String>();  

	
	HistoryField (){
		Panel.setBounds(1460,10,450,980);
	};

	public void add(String his){
		this.list.add(his);
	}

	public void show(){ 
		String s = "";
		
		for(String item:list)  {
			s = item + "\n" + s;
		}
		Panel.setText(s);
	}
}
