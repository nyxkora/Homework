package hwW5;
import java.util.Scanner;

//Can only calculate with whole numbers
public class HW5 {
	public static void main(String[] args) {
		// Declare
		Scanner input = new Scanner(System.in);
		int a, b, c=0;
		float c2 = 0;
		boolean div = false;
		char oper;
		// Start
		System.out.printf("Simple Calculator \n Enter first number: ");
		a = input.nextInt();
		System.out.printf(" Possible operators: +, -, *, / ");
		oper = input.next().charAt(0);
		System.out.printf(" Second number: ");
		b = input.nextInt();
		// Calculate
		switch (oper) {
		case '+':
			c = a + b;
			break;
		case '-':
			c = a - b;
			break;
		case '*':
			c = a * b;
			break;
		case '/':
			float a2 = a, b2 = b;
			c2 = a2 / b2;
			div = true;
			break;
		default:
			System.out.printf("Invalid Operation. Try Again.");
			System.exit(0);
		}
		// List
		if (div && c2 != 0)
			System.out.printf(" %d %s %d = %f", a, oper, b, c2);
		else
			System.out.printf(" %d %s %d = %d", a, oper, b, c);
		input.close();
	}

	/*
	 * if(oper == '+'){ c=a+b; System.out.printf(" %d+%d= %d", a,b,c); } else
	 * if(oper == '-'){ c=a-b; System.out.printf(" %d-%d= %d", a,b,c); } else
	 * if(oper == '*'){ c=a*b; System.out.printf(" %d*%d= %d", a,b,c); } else
	 * if(oper == '/'){ c=a/b;
	 * 
	 * System.out.printf(" %d/%d= %d ", a,b,c); } else{ System.out.println(
	 * "You entered an invalid operation. Try Again."); }
	 */

}
