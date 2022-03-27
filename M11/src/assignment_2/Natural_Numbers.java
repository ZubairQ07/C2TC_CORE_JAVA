package assignment_2;
import java.util.Scanner;
public class Natural_Numbers {

	public static void main(String[] args) {
		int num, sum = 0, i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number upto which you want to calculate sum ");
		num = scan.nextInt();

		while (num >= i) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum of the natural number upto " + num + " is " + sum);
	}

}
