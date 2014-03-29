import java.awt.event.*;
import javax.swing.*;

public class MyCalculator extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton[][] buttons;
	JButton computeButton, clearButton;
	JTextField valueField;
	String prev = "";
	Boolean pos = true;
	Boolean sign = false;
	
	public MyCalculator(String title) {
		super(title);
		getContentPane().setLayout(null);
	
		valueField = new JTextField("0");
		valueField.setLocation(10,10);
		valueField.setSize(215, 40);
		valueField.setEditable(false);
		getContentPane().add(valueField);
		
		clearButton = new JButton("C");
		clearButton.setLocation(10, 280); 
		clearButton.setSize(50, 50);
		clearButton.addActionListener(this);
		getContentPane().add(clearButton);
		
		computeButton = new JButton("Calculate!");
		computeButton.setLocation(65, 280); 
		computeButton.setSize(160, 50);
		computeButton.addActionListener(this);
		getContentPane().add(computeButton);
		
		buttons = new JButton[4][4];
		String[] buttonLabels = {"1","2","3","+","4","5","6","-","7","8","9","*","+/-","0",".","/"};
	
		for(int row = 0; row<4; row++){
			for(int col = 0; col<4; col++){
				buttons[row][col] = new JButton(buttonLabels[row*4+col]);
				buttons[row][col].setLocation(10+col*55, 55+row*55);
				buttons[row][col].setSize(50, 50);
				buttons[row][col].addActionListener(this);
				getContentPane().add(buttons[row][col]);
			}
		}
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(235,360);
	
	}
	
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		switch (s){
			case "0": 
				valueField.setText(prev + "0");
				prev += "0";
				sign = false;
				break;
			case "1": 
				valueField.setText(prev + "1");
				prev += "1";
				sign = false;
				break;
			case "2": 
				valueField.setText(prev + "2");
				prev += "2";
				sign = false;
				break;
			case "3": 
				valueField.setText(prev + "3");
				prev += "3";
				sign = false;
				break;
			case "4": 
				valueField.setText(prev + "4");
				prev += "4";
				sign = false;
				break;
			case "5": 
				valueField.setText(prev + "5");
				prev += "5";
				sign = false;
				break;
			case "6": 
				valueField.setText(prev + "6");
				prev += "6";
				sign = false;
				break;
			case "7": 
				valueField.setText(prev + "7");
				prev += "7";
				sign = false;
				break;
			case "8": 
				valueField.setText(prev + "8");
				prev += "8";
				sign = false;
				break;
			case "9": 
				valueField.setText(prev + "9");
				prev += "9";
				sign = false;
				break;
			case "+": 
				if(sign){
					break;
				}else{
					valueField.setText(prev + "+");
					prev += "+";
					sign = true;
					break;
				}
			case "-": 
				if(sign){
					break;
				}else{
					valueField.setText(prev + "-");
					prev += "-";
					sign = true;
					break;
				}
			case "*":
				if(sign){
					break;
				}else{
					valueField.setText(prev + "*");
					prev += "*";
					sign = true;
					break;
				}
			case "/":
				if(sign){
					break;
				}else{
					valueField.setText(prev + "/");
					prev += "/";
					sign = true;
					break;
				}
			case ".":
				if(sign){
					break;
				}else{
					valueField.setText(prev + ".");
					prev += ".";
					sign = true;
					break;
				}
			case "+/-": 
				if(pos){
					valueField.setText("-" + prev);
					pos = false;
				}else{
					valueField.setText(prev.substring(0));
					pos = true;
				}
				break;
			case "C":
				prev = "";
				valueField.setText("0");
				break;
			case "Calculating": 
				break;
		}
	}
}

