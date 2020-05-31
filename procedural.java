package paradigms;
public class procedural {
	public static void main(String args[]) { 
		
		int marks[] = { 50, 98, 67, 87, 58 } ;
		int sum = 0; 
		float average = 0; 
		for (int i = 0; i < 5; i++) { 
		    sum = sum + marks[i]; 
		} 
		average = sum / 5; 
		System.out.println("Avg is " + average);
	}}

