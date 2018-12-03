package amen14;
import java.util.Scanner;

/*
 * Ailsa Mensinger
 * 11-27-18
 */

public class DoWhile {

	public static void main(String[] args) {
		
		int data, sum;
		sum = 0;
		Scanner input = new Scanner(System.in);
		do {
			//Loop body; Statement(s);
			System.out.println("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
			sum += data;
		}while (data !=0);
		System.out.println("The sum is " +sum);
		
		
		

	}

}
