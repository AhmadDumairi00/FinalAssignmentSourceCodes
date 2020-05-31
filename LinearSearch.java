package part1;
import java.util.Scanner; 

public class LinearSearch {
	 public static void main(String args[]) { 

		    int counter, NumberOfElements, ValueToSearch, arr[]; 		  
		    @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in); 
			  
		    System.out.println("Enter number of elements:"); 

		    NumberOfElements = in.nextInt();  

		    arr = new int[NumberOfElements]; 
		  

		    System.out.println("Enter " + NumberOfElements + " elements:"); 
		  

		    for (counter = 0; counter < NumberOfElements; counter++) 

		      arr[counter] = in.nextInt(); 		  

		    System.out.println("Enter value to find:"); 

		    ValueToSearch = in.nextInt(); 

		    for (counter = 0; counter < NumberOfElements; counter++) 
		    { 
		     if (arr[counter] == ValueToSearch)    
		      { 
		        System.out.println(ValueToSearch + " Founded at location number: " + (counter + 1));  // We used j + 1 because the array index starts from 0
		         break; 
		      } 
		   } 
		   if (counter == NumberOfElements) 
		      System.out.println(ValueToSearch + " isn't found in this array"); 
		  }   
}
