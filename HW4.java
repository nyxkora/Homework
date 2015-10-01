package hwW4;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a,b;
		float sum;
		float diff;
		float prod;
		float quo;
		
		System.out.print("Enter a number: ");
		a = input.nextInt();
		System.out.print("Enter another number: ");
		b = input.nextInt();
		sum= a+b;
		diff= a-b;
		prod= a*b;
		quo= a/b;
		System.out.println("The numbers added are " + sum);
		System.out.println("The numbers subtracted are " +diff);
		System.out.println("The numbers multiplied are " + prod);
		System.out.println("The numbers divided are " + quo);
		input.close();

	}

}
