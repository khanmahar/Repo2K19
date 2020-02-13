
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number");
		num1=scanner.nextInt();
		System.out.println("Enter an other number");
		num2=scanner.nextInt();
		System.out.println("Addition is "+add(num1,num2);
		System.out.println("Subtraction is "+subtract(num1,num2);
		System.out.println("Multiplication is "+multiply(num1,num2);
		System.out.println("Division is "+divide(num1,num2));

	}
	
	
	int subtract(int a,int b){
		return a-b
	}
	int multiply(int a,int b){
		return a*b
	}
	int divide(int a,int b){
		return a/b
	}

}
