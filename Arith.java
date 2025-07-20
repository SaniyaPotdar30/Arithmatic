import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number= ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number= ");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		
		System.out.println("Sum is= "+sum);
		System.out.println("Subraction is= "+sub);
		System.out.println("Multiplication is= "+mul);

	}

}
