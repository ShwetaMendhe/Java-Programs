package patterns;

public class Console10 {

	public static void main(String[] args) {

		int i,j,n=1;
		
		for(i=1;i<6;i++)
		{
			for(j=1;j<(i-n);j++)
			{
					for(n=1;n<=10;n++)
			       {
						System.out.print(n);
	
			
			       }
					System.out.println();
			}
			
			
		}
	}

}
