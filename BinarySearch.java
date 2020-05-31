package part1;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String args[]) 

	  { 

	    int c, NumOfElements ,ValueToSearch, arr[]; 
	    @SuppressWarnings("resource") 
		Scanner in = new Scanner(System.in); 
	    System.out.println("Enter number of elements:"); 
	    NumOfElements = in.nextInt();  
	    arr = new int[NumOfElements]; 
	    System.out.println("Enter " + NumOfElements + " elements:"); 
	    for (c = 0; c < NumOfElements ; c++);
	      arr[c] = in.nextInt(); 
	    System.out.println("Enter value to find:"); 
	    ValueToSearch = in.nextInt(); 
	    for (c = 0; c < NumOfElements ; c++)  { 
	      if (arr[c] == ValueToSearch)    
	      { 
	    	  System.out.println(ValueToSearch + " is present at location " + (c + 1)); 
	          break; 
	      } 
	   } 

	   if (c == NumOfElements) 
	      System.out.println(ValueToSearch + " is not in the given array"); 
	  } 
	} 
