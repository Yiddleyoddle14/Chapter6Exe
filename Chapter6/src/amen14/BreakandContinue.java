package amen14;
/*
 * Ailsa Mensinger
 * 12-3-18
 */

public class BreakandContinue {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		while (num < 20) {
			num++;
			
			if (num == 10 || num ==11) {
				continue;
			}
			sum += num;
			System.out.println(num);
		}

	}

}
