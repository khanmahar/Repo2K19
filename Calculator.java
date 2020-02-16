
public interface Operations {
	
	static double sum (double firstValue, double secondValue){
		
		return firstValue+secondValue;
	}
	
	static double sub (double firstValue, double secondValue){
		
		return firstValue-secondValue;
	}
	static double multiply (double firstValue, double secondValue){
		
		return firstValue*secondValue;
	}
	static double division (double firstValue, double secondValue){
		
		return firstValue/secondValue;
	}

}
public class CalculatorClass implements Operations{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double firstValue,secondValue,total=0;
		
		int operation;
		
		
		System.out.println("Enter First Value");
		firstValue = getInput(scan);
		
		System.out.println("Enter Second Value");
		secondValue = getInput(scan);
		
		System.out.println("1)Sum \t2 2)Sub \n 3)Multiply \t 2)divide");
		operation = (int)getInput(scan);
		
		scan.close(); //Close Input Stream
		
		switch(operation){
		
		case 1:
			total = Operations.sum(firstValue, secondValue);
			break;
			
		case 2:
			total = Operations.sub(firstValue, secondValue);
		break;
		case 3:
			total = Operations.multiply(firstValue, secondValue);
		break;
		case 4:
			total = Operations.division(firstValue, secondValue);
		break;

		}
		
		System.out.println("Result: "+ total);
	}

	private static double getInput(Scanner scan) {
		
		return scan.nextDouble();
	}

}
