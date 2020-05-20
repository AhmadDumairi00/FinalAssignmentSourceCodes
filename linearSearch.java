package LinearSearch;
import java.util.Scanner; 

public class linearSearch {
	public static void main(String args[]) { 

	    int j, n, Val, arr[]; 
       // j is a counter, n is number of elements in the array , Val is the value we're searching for 
	  

	    Scanner in = new Scanner(System.in); 

	    System.out.println("Enter number of elements:"); 

	    n = in.nextInt();  

	    arr = new int[n]; 
//We took the size of the array from the user, and changed it from arr[] to arr[n]
	  

	    System.out.println("Enter " + n + " elements:"); 
// User-friendly message to enter the elements of the array
	  

	    for (j = 0; j < n; j++) 

	      arr[j] = in.nextInt(); 
// Saves the values that the user entered inside the array
	  

	    System.out.println("Enter value to find:"); 

	    Val = in.nextInt(); 

	  // Saving the value that the user wants to look for inside a variable named Val 

	    for (j = 0; j < n; j++) 

	    { 

	      if (arr[j] == Val)    

	      { 

	         System.out.println(Val + " Founded at location number: " + (j + 1));  // We used j + 1 because the array index starts from 0

	          break; 

	      } 

	   } 
// the loop will keep going , and it'll stop if Val = one of the values saved in the array (which means a match) 
	   if (j == n) 

	      System.out.println(Val + " isn't found in this array"); 

	  } 
}
