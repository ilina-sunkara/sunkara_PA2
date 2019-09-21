package sunkara_p1;
import java.util.Scanner;

public class ProblemOne {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//prompt for number
		System.out.println("Enter a 4 digit number");
		//get number from user
		int input = scnr.nextInt();
				
		//ask user for input to either encrypt or decrypt
		System.out.println("Press 1 to encrypt and 2 to decrypt");
		int choice = scnr.nextInt();
		
		int d1, d2, d3, d4;
		int temp;
		
		//save each digit separately for easier use (and to print if there is leading zero)
		d1 = input/1000;
		d2 = input%1000/100;
		d3 = input%100/10;
		d4 = input%10;

		//encrypt or decrypt if statement
		if(choice==1) {
			//encrypt
			
			/* Original approach for first part of encryption:
			for(int i=1; i<=4; i++) {
				//isolate each digit: mod first to get rid of left side, then divide for right side
				int digit = (input%((int)Math.pow(10.0, (double)i)))/((int)Math.pow(10.0, (double)(i-1)));
				//encrypt each digit and add to re-multiplied power of each digit
				int convert = convert+((digit+7)%10)*((int)Math.pow(10.0, (double)(i-1)));
			}
			*/
			
			//first part of encryption using separate digits
			d1 = (d1+7)%10;
			d2 = (d2+7)%10;
			d3 = (d3+7)%10;
			d4 = (d4+7)%10;
			
			/* Swap the first digit with the third, and swap the 
			 * second digit with the fourth.*/
			//first and third
			temp = d1;
			d1 = d3;
			d3 = temp;
			//second and fourth
			temp = d2;
			d2 = d4;
			d4 = temp;
			
			//print the encrypted integer
			System.out.println("Encrypted number is: "+d1+d2+d3+d4);
		}
		else if(choice==2) {
			//decrypt
			
			//Undo swap first
			//first and third
			temp = d1;
			d1 = d3;
			d3 = temp;
			//second and fourth
			temp = d2;
			d2 = d4;
			d4 = temp;
			
			//Undo sum and mod part by adding 3 (difference of 10 and 7) and taking the modulus by 10
			d1 = (d1+3)%10;
			d2 = (d2+3)%10;
			d3 = (d3+3)%10;
			d4 = (d4+3)%10;
			
			//print the decrypted integer
			System.out.println("Decrypted number is: "+d1+d2+d3+d4);
		}
		else
			System.out.println("Invalid choice");
		
	}

}
