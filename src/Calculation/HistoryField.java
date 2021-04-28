package Calculation;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class HistoryField {

	private JTextArea Panel = new JTextArea();
	private List<String> list = new ArrayList<String>();  

	public JTextArea getPanel() {
		return Panel;
	}

	public void setBounds(int x, int y, int width, int height){
		this.Panel.setBounds(x, y, width, height);
	}

	public void setFont(Font f){
		this.Panel.setFont(f);
	}

	public void setText(String text){
		this.Panel.setText(text);
	}

	public String getText(){
		return this.Panel.getText();
	}

	public void setPanel(JTextArea panel) {
		Panel = panel;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	HistoryField (){
		Panel.setBounds(1460,10,450,980);
	};

	public void clear(){
		this.list = new ArrayList<String>();  
	}

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
