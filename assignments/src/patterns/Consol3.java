package patterns;

public class Consol3 {

	
	public static void main(String[] args) {
		
		int lines=6;
		int i,j;
		
		for(i=1;i<=lines;i++)
		{
			for(j=1;j<=lines;j++)
			{
				if(i>=j)
					System.out.print(" * ");
				else
					System.out.print(" ");
			
			}
			j--;
			System.out.println("");
		}

	}

}
