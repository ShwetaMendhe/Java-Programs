package patterns;

public class Pattern3 {

	public static void main(String[] args) {

		int lines=10;
		int i=1;
		int j;
		
		//to print lines
		for(i=1;i<=lines;i++)
		{
			//to print values in line
			for(j=1;j<=i;j++)
			{
				System.out.print(i*j+" ");
			}
			 System.out.println("");
		}
	}

}
