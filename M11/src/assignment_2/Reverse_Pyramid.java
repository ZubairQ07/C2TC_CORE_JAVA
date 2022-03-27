package assignment_2;

public class Reverse_Pyramid {

	public static void main(String[] args) {
		 int row = 10;
		  
		    for(int i = 0; i <= row - 1; i++)
		       {
			  for(int j = 0; j <= i; j++)
			     {
			       System.out.print(" ");
			     }
			  for(int k = 0;k <= row - 1 - i; k++)
			     {
			       System.out.print("*"+" "); 
			     }
			  System.out.println();
		      }

	}

}
