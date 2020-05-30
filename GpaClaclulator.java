package Part3;

import java.text.DateFormat;
import java.text.SimpleDateFormat; // java library for showing date and time 
import java.util.*;

public class GpaClaclulator {
	static void WelcomeMessage() { // in order to organize my code, I created a method that contains welcome messages for the user and called it in the main
		//Also contains lines for showing current date & time (extra)
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(  df.format(dateobj));
		System.out.println("Welcome to GPA calculator program.");
		System.out.println("This program calculates your semester's GPA, and your total GPA."); 
		System.out.println("Please note that your marks MUST be between 35 and 100. ");
		
	}

public static void main(String[] args) { 
	int SemestersNumber,SubjectsNumber = 0,TotalSubjects=0;
	double SemesterGPA=0, TotalGPA=0,Sum=0,Total=0;;

	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);	
	WelcomeMessage(); // calling the method that contains the welcome messages

	System.out.println("Please enter number of semesters. (only numbers)");
	SemestersNumber = scanner.nextInt();
	
	 for (int i = 0;i<SemestersNumber; i++) {
		 int c=i+1;
		 System.out.println("Please enter number of subjects for semester : " + c );
		 SubjectsNumber= scanner.nextInt();
		 int grades[] = new int [SubjectsNumber];	 
		TotalSubjects+=SubjectsNumber; 
		
	for (int a=0;a<SubjectsNumber;a++) { 
		
		System.out.println("Please enter grade number " + (a+1) );
		grades[i]=scanner.nextInt(); 
		/*do {//while (grades[a] < 35) {
			System.out.println("Please enter valid number");
			grades[a]=scanner.nextInt();
	}while (grades[a]< 35 || grades[a]>100);*/
		
		Sum += grades[i]; 	
	}
	
	Sum = Sum/25; 
	 double credits= Sum * 3; 
	 double hours= SubjectsNumber*3; 
	
	  SemesterGPA = credits/hours; 
	
	System.out.println("Semester " + c + " GPA is " +   SemesterGPA);
	Total+=Sum; 
	 }
	TotalGPA=Total/TotalSubjects;
	System.out.println("GPA total is" +  TotalGPA);
	
	
	

	
	
	
	}
}

