package programs;


import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter number ");
		int num=s1.nextInt();
		int fact=1;
		
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of given number "+num+"! = "+fact);

	}


}
