//Name:Evan White
	import java.util.Scanner;

public class IfLab1EW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a integer :");
		int num1 = input.nextInt();
		
		System.out.println("Input another integer : ");
		int num2 = input.nextInt();
		
		if(num1 > num2)
		{
			System.out.println("Greater");
		}
		if(num1 < num2)
		{
			System.out.println("Smaller");
		}
		
		if(num1 == num2)
		{
			System.out.println("The Same");
		}
		
	}
	
}
/*
Input a integer :
4
Input another integer : 
7
Smaller
*/