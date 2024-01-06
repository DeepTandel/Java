package Exception_Handling;

public class TryCtach {
    public static void main(String[] args) {
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			double number3;
			
			number3 = number1 / number2;
			System.out.println("Division = "+number3);
			
		}catch(ArithmeticException e) {
			System.out.println("Please do not divide number by zero.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass 2 parameter from command line");
		}
		catch(NumberFormatException e) {
			System.out.println("Pass number as arguments only.");
		}
		
		System.out.println("End of program...");
	}
}
