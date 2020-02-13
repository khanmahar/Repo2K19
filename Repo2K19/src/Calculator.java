
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number");
		num1=scanner.nextInt();
		System.out.println("Enter an other number");
		num2=scanner.nextInt();
		System.out.println("Addition is "+(num1+num2));
		System.out.println("Subtraction is "+(num1-num2));
		System.out.println("Multiplication is "+(num1*num2));
		System.out.println("Division is "+(num1/num2));

	}

}
