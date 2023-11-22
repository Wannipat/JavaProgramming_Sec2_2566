import javax.swing.*;
public class Example3 {
	public static void main(String[] args) {
     //input and covert weight from user
	double weight = Double.parseDouble(JOptionPane.showInputDialog("input Weight: "));
	//input and convert hieght(cm.)from user
	double height = Double.parseDouble(JOptionPane.showInputDialog("input Height: "));
    //covert height from cm. to m.
	height = height/100;
	double bmi = weight/(height*height);
	
	//check condition and declare meaning of BMI
	String bmiCataegory ;
	if(bmi<18.5) 
		bmiCataegory="Underweight";
	else if (bmi>18.5 && bmi<25) 
		bmiCataegory="Normal - weight ";
	else if (bmi>25 && bmi<30) 
		bmiCataegory="Overweight";
	else 
		bmiCataegory ="Obesity";
	
	
	//display BMI value to showMessege dialog box
	JOptionPane.showMessageDialog(null, "BMI = " + String.format("%.2f",bmi)
	+ "\nYou're "+ bmiCataegory);
	
		
	}

}
