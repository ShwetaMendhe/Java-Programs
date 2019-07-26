package basicLogicalPrograms;

import java.util.Scanner;

public class Multiplication2 {

	public static void main(String[] args) {
		
		double num1 , num2 , mult ;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first integer number :");
		num1 = sc.nextDouble();
		
		System.out.println("enter second integer number :");
		num2 = sc.nextDouble();
		
		sc.close();
		
		mult = num1* num2;
		System.out.println("multiplication of these two numbers is ="+mult);
		
	}

}
