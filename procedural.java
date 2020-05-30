package paradigms;
import java.util.Scanner;
public class procedural {
	public static void main(String args[]) { 
		Scanner scr=new Scanner(System.in);
		int i,number,EnteredNumber;
		number =5; 
		  System.out.println("Enter any Number: ");
	      EnteredNumber=scr.nextInt();
		for (i=1;i<=number;i++) { 
			int result; 
			result= i*number*EnteredNumber;
			System.out.println("the result is" + result);
		}
}}
