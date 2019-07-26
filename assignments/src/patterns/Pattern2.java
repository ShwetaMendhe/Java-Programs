package patterns;

public class Pattern2 {

	public static void main(String[] args) {

		int lines=4;
		int i,j;
		
		
		//to print lines
		for(i=1;i<=lines;i++)
		{  
			
		//to print values in a line * and 0
			for(j=1;j<=lines;j++)
			{
				if(i==j)
					
					System.out.print(" * ");
				else
					
					System.out.print(" 0 ");
			}
			
			System.out.print(" * ");
			j--;
			while(j>=1)
			{
				if(i==j)
					System.out.print(" * ");
				else
					System.out.print(" 0 ");
				j--;

			}
			
			System.out.println(" ");
			
		}
	}

}
