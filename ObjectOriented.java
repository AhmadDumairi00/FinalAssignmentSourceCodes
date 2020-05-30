package paradigms;

public class ObjectOriented {
	String Name; 
    String SecondName; 
    int Age; 
    String Balance;
	private String LastName;
    public ObjectOriented(String Name, String LastName,  int Age, String string) { 
 this.Name = Name; 
 this.LastName = LastName; 
 this.Age = Age; 
 this.Balance = string; 
} 
    public String getName() 
    { 
        return Name; 
    } 
    public String getLastName() 
    { 
        return LastName; 
    } 
    public int getAge() 
    { 
        return Age; 
    } 
    public String getBalance() 
    { 
        return Balance; 
    } 
    public String toString() 
    { 
        return("Hi my name is  " + this.getName()+ 
               " & My last name,age and balance are: " + 
               this.getLastName()+", " + this.getAge()+ 
               " , "+ this.getBalance()); 
    } 
  
    public static void main(String[] args) 
    { 
        ObjectOriented Ahmad = new ObjectOriented("Ahmad","Dumairi", 20, "$350"); 
        System.out.println(Ahmad.toString()); 
    } 
} 
    

