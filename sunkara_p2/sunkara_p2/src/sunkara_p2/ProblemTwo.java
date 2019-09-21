package sunkara_p2;
import java.util.Scanner;

public class ProblemTwo {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//prompt for calculation mode
		System.out.println("Press 1 for US Customary units and 2 for Metric units");
		//get calculation mode from user
		int mode = scnr.nextInt();
		
		double weight=0;
		double height=0;
		double bmi=0;
		
		//if statement for calculation mode
		if(mode==1) {
			//prompt for weight input
			System.out.println("Please enter your weight in pounds");
			//get weight input from user
			weight = scnr.nextDouble();
			
			//prompt for height input
			System.out.println("Please enter your height in inches");
			//get height input from user
			height = scnr.nextDouble();
			
			//calculation
			if((height>0)&&(weight>0))
				bmi = (703.0*weight)/(height*height);
			else
				System.out.print("Invalid input");
		}
		else if(mode==2) {
			//prompt for weight input
			System.out.println("Please enter your weight in kilograms");
			//get weight input from user
			weight = scnr.nextDouble();
			
			//prompt for height input
			System.out.println("Please enter your height in meters");
			//get height input from user
			height = scnr.nextDouble();
			
			//calculation
			if((height>0)&&(weight>0))
				bmi = (weight)/(height*height);
			else
				System.out.print("Invalid input");
			
		}
		else
			System.out.println("Invalid choice");
		if(bmi>0) {
			//print value
			System.out.printf("\nYour BMI is: %.2f\n\n",bmi);
		
			//display all categories
			System.out.println("The following is a display of BMI categories:\n"
				+ "Underweight = <18.5\r\n" + 
				"Normal weight = 18.5–24.9\r\n" + 
				"Overweight = 25–29.9\r\n" + 
				"Obesity = BMI of 30 or greater\n");
		
			//if statement for category
			if(bmi<18.5)
				System.out.println("You are underweight");
			else if(bmi<=24.9)
				System.out.println("You are a normal weight");
			else if(bmi<=29.9)
				System.out.println("You are a overweight");
			else if(bmi>=30.0)
				System.out.println("You are obese");
		}
	}

}
