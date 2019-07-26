package patterns;

public class Pattern5 {

	public static void main(String[] args) {

		int lines=4;
		int i,j;
		/*int space=0;*/
		
		for(i=1;i<=lines;i++)
		{
			for(j=1;j<=lines;j++)
			{
				System.out.print(j);
			}
			
			
			/*for(j=1;j<=lines;j++)
			{
				if(j<=(lines-i))
					System.out.print(j);
				else
					System.out.print("*");
			}
			
			j--;*/
			
			
			while(j>0)
			{
				//to print nos in a line
				if(j>=(lines+1))
					System.out.print(j-1);
				else if (j>(lines-i))
					System.out.print("*");
				else
					System.out.print(j);
				j--;
			}
		
			
			/*if((lines-i)>9)
			space=space+1;*/
			System.out.println("");
		}
		
	}

}
