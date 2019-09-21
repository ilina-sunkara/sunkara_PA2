package sunkara_p3;
import java.util.Scanner;

public class ProblemThree {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//initialize so that loop runs at least once
		int response = 0;
		
		//declare arrays
		String[] topics = {"English", "History", "Mathematics", "Music", "Science"};
		int[][] responses = new int[5][10];
		
		int i, j, count=0;
		
		//fill all values in array with zero
		for(i=0; i<5; i++) {
			for(j=0; j<10; j++) {
				responses[i][j]=0;
			}
		}
		
		//make it so that loop runs until user chooses to exit
		System.out.println("Enter -1 to exit the program");
		while(response!=-1) {
			System.out.println("\nPlease rate the following topics on a scale of 1 to 10 as they relate to their importance in education");
			
			//outer for loop to iterate through topics
			for(i=0; i<5; i++) {
				System.out.print("How would you rate "+topics[i]+"? ");
				response = scnr.nextInt();
				if(response==-1)
					break;
				
				//inner for loop to iterate through each possible rating
				for(j=0; j<10; j++) {
					if((response-1)==j) {
						//iterate value on rating if someone chooses it
						responses[i][j]++;
					}
				}
			}
			count++;
		}
		//calculate averages
		//english
		int engavg = 0;
		int engtot=0;
		for(i=0; i<10; i++) {
			engtot+=(i+1)*responses[0][i];
		}
		engavg = engtot/count;
		
		//history
		int histot = 0;
		int histavg=0;
		for(i=0; i<10; i++) {
			histot+=(i+1)*responses[1][i];
		}
		histavg = histot/count;
		
		//math
		int mathtot = 0;
		int mathavg=0;
		for(i=0; i<10; i++) {
			mathtot+=(i+1)*responses[2][i];
		}
		mathavg = mathtot/count;
		
		//music
		int mustot = 0;
		int musavg=0;
		for(i=0; i<10; i++) {
			mustot+=(i+1)*responses[3][i];
		}
		musavg = mustot/count;
		
		//science
		int scitot = 0;
		int sciavg=0;
		for(i=0; i<10; i++) {
			scitot+=(i+1)*responses[4][i];
		}
		sciavg = scitot/count;
		
		//calculate max and min
		int[] totals = {engtot, histot, mathtot, mustot, scitot};
		String maximum="";
		String minimum="";
		int max = totals[0];
		int min = totals[0];
		for(i=0; i<5; i++) {
			if(totals[i]>=max) {
				max=totals[i];
				maximum = topics[i];
			}
			if(totals[i]<=min) {
				min=totals[i];
				minimum = topics[i];
			}
		}
		
		//print out top of table (ratings
		System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAverages");
		
		//print out row for english
		System.out.println(""+ topics[0]+"\t\t"+responses[0][0]+"\t"+responses[0][1]
				+"\t"+responses[0][2]+"\t"+responses[0][3]+"\t"+responses[0][4]
						+"\t"+responses[0][5]+"\t"+responses[0][6]
								+"\t"+responses[0][7]+"\t"+responses[0][8]
										+"\t"+responses[0][9]+"\t"+engavg);
		
		//print out row for history
		System.out.println(""+ topics[1]+"\t\t"+responses[1][0]+"\t"+responses[1][1]
				+"\t"+responses[1][2]+"\t"+responses[1][3]+"\t"+responses[1][4]
						+"\t"+responses[1][5]+"\t"+responses[1][6]
								+"\t"+responses[1][7]+"\t"+responses[1][8]
										+"\t"+responses[1][9]+"\t"+histavg);
		//print out row for math
		System.out.println(""+ topics[2]+"\t\t"+responses[2][0]+"\t"+responses[2][1]
				+"\t"+responses[2][2]+"\t"+responses[2][3]+"\t"+responses[2][4]
						+"\t"+responses[2][5]+"\t"+responses[2][6]
								+"\t"+responses[2][7]+"\t"+responses[2][8]
										+"\t"+responses[2][9]+"\t"+mathavg);
		//print out row for music
		System.out.println(""+ topics[3]+"\t\t"+responses[3][0]+"\t"+responses[3][1]
				+"\t"+responses[3][2]+"\t"+responses[3][3]+"\t"+responses[3][4]
						+"\t"+responses[3][5]+"\t"+responses[3][6]
								+"\t"+responses[3][7]+"\t"+responses[3][8]
										+"\t"+responses[3][9]+"\t"+musavg);
		//print out row for science
		System.out.println(""+ topics[4]+"\t\t"+responses[4][0]+"\t"+responses[4][1]
				+"\t"+responses[4][2]+"\t"+responses[4][3]+"\t"+responses[4][4]
						+"\t"+responses[4][5]+"\t"+responses[4][6]
								+"\t"+responses[4][7]+"\t"+responses[4][8]
										+"\t"+responses[4][9]+"\t"+sciavg);
		
		//display point totals
		System.out.println(maximum+" recieved the highest point total of: "+max);
		System.out.println(minimum+" recieved the lowest point total of: "+min);
	}

}
