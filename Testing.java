import javax.swing.JOptionPane;   
public class Multiply{
	public static void main(String[] args){
		String firstNum, secondNum, answer;
		int num1, num2, sum;

		//read user numbers
		firstNum = JOptionPane.showInputDialog("Enter First Integer:");
		secondNum = JOptionPane.showInputDialog("Enter Second Integer:");

		//convert numbers
		num1 = Integer.parseInt( firstNum );
		num2 = Integer.parseInt( secondNum );

		//calculate adder
		sum = num1 * num2;

		answer = num1 + " x " + num2 + " = " + sum;

		//Display results
		JOptionPane.showMessageDialog(null, answer, "Answer Adder ", JOptionPane.INFORMATION_MESSAGE);
	}
}
