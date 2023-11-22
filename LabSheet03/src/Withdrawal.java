import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.random.*;//use library for RANDOM
public class Withdrawal {
	public static void main(String[] args) {
		//USING class Random for random money 
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9)*100000;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int Withdrawal = Integer.parseInt(JOptionPane.showInputDialog(null, "You balance : "+balance+"\n Input money to Withdrawal:"));
		int num1000 = Withdrawal/1000;
		int num500 = (Withdrawal%1000)/500;
		int num100 = (Withdrawal%1000)/100;
		if(balance<Withdrawal) {
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw morn than balance");
		}
		
			else if(Withdrawal>=20000) {
		JOptionPane.showMessageDialog(null,"Error:Cannot withdraw morn than 20,000");
			
			} else if(Withdrawal % 100!=0) {
		    JOptionPane.showMessageDialog(null,"Error:Cannot withdraw "+frm.format(Withdrawal)+" baht.");
		}
			else if(Withdrawal<= balance && Withdrawal<= 20000 && Withdrawal % 100==0)
			{
				JOptionPane.showMessageDialog(null,"Your withdraw "+frm.format(Withdrawal)+" baht."
						+"\n1000 = "+ frm.format(num1000) + "\n500 = "+ num500 +"\n100 = "+ num100);
			}
		 

	}

}
