package patterns;

public class Console7 {

	public static void main(String[] args) {

		int size=6;
		int i,j,k;
		
		for(i=size;i!=0;i--)
		{
			for(j=0;j<(size-i);j++)
			{
				System.out.print(" ");
				
			}
				
			for(k=1;k<(2*(i-1));k++)
			{
				System.out.print("*");
			}
					
	
			System.out.println();
			
		}
	}

}
