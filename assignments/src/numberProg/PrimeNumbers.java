package numberProg;

import java.util.Scanner;

public class PrimeNumbers {
	

	public static void main(String[] args) {
		int temp;
		boolean isPrime=true;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number= ");
		int num=sc.nextInt();
		sc.close();
		
		//to calculate prime number
		
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
		System.out.println(num+ " is prime number");
		
		else
			System.out.println(num+" is not prime number");
	}

}
