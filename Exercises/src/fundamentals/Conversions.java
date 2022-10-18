package fundamentals;

import javax.swing.JOptionPane;

public class Conversions {
	public static void main(String[] args) {
		
		//Numbers to String
		
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		System.out.println("________________________");
		
		//String to Numbers
		
		String value1 = JOptionPane.showInputDialog("Type the first number: ");
		String value2 = JOptionPane.showInputDialog("Type the second number: ");
		
		System.out.println(value1 + value2);
		
		double number1 = Double.parseDouble(value1);
		double number2 = Double.parseDouble(value2);
		
		double sum = number1 + number2;
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + sum / 2);
	}
}
