package basicLogicalPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num;
		System.out.println("enter an integer number= ");
		
		//TO PROVIDE AN INPUT NUMBER, WE USED THE SCANNER 
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		/*
		 * if the number is divisible by 2 then it is even and if not then it is odd
		 */
		if(num%2==0)
		{ 
			System.out.println("the number is even");
		}
		else
			System.out.println("the number is odd");
		
	}

}
