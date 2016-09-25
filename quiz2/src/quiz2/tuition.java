//Jason Joo
//CISC181

package quiz2;

import java.util.Scanner;

public class tuition {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double initial, rate, total;
		
		System.out.print("Enter your initial tuition cost: ");
		initial = input.nextDouble();
		
		System.out.print("Enter your yearly percentage increase in tuition: ");
		rate = input.nextDouble()/100;
		
		input.close();
		
		total = initial;
		double inc = initial;
		
		for (int i = 0; i < 3; i++) {
			inc += rate * inc;
			total += inc;
			//System.out.println(total);
		}
		System.out.printf("Your total tuition is: $%.2f", total);
		
	}
}