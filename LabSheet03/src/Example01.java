import java.text.DecimalFormat;
import javax.swing.*;//import library for input data from Dialog box
public class Example01 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299 ;
        //input and convert data from dialog box
        int numberofCustomer = Integer.parseInt(
        JOptionPane.showInputDialog("How many customer per bill"));
        
        double priceafterdiscount , totalPrice = 0;
        //calculate total price of buffet
        totalPrice = BUFFET * numberofCustomer;
        //using show message dialog box for display total price
        /*JOptionPane.showMessageDialog(null, "Amount to be paid is "
        		+ totalPrice + " baht."); */
        //using confirm dialog box
        int memberCard ;
        do 
        {
        	memberCard = JOptionPane.showConfirmDialog(null,
            		"Total price is " + frm.format(totalPrice) + " baht."
            		+ "\nDoyou have a member card");
        }
        while(memberCard==JOptionPane.CANCEL_OPTION);
        
        if(memberCard==JOptionPane.YES_OPTION) {
        	priceafterdiscount = totalPrice * 90/100; //discount 10%
        	JOptionPane.showMessageDialog(null, "Amount to be paid is "
        			+frm.format(priceafterdiscount) + " baht." );
        	
        }//end of if
        else if(memberCard==JOptionPane.NO_OPTION) {
        	JOptionPane.showMessageDialog(null, "Amount to be paid is "
        			+frm.format(totalPrice) + " baht." );
        }
	}

}
