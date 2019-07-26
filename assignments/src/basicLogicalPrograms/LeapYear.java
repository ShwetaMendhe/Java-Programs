package basicLogicalPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the year= ");
		year= sc.nextInt();
		sc.close();
		
		if(year%4==0)
			System.out.println("the year "+year+" is a leap year");
		else
			System.out.println("the year "+year+" is not a leap year");
	}

}
