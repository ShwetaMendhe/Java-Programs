package basicLogicalPrograms;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		boolean isVowel=false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character: ");
		char c =sc.next().charAt(0);
		sc.close();
		
		switch(c)
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : isVowel =true;
		}
		 if(isVowel==true)
			 System.out.println(c+" is vowel");
		 else
		 {
			 if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
				 System.out.println(c+ " is a consonent");
			 else
				 System.out.println("input is not an alphabet");

		 }
		
		
		
	}

}
