package learnconstructor;


//Java Program to demonstrate the use of the parameterized constructor.  

class Employee{    
  int id;    
  String name; 
  
  //creating a parameterized constructor   
  
  Employee(int i,String n){    
  id = i;    
  name = n;    
  }    
  //method to display the values 
  
  void display(){
	  System.out.println(id+" "+name);
	  }    
}  
//Main class to create objects and class methods 

public class LearnParameterizedConstructorEx1 {

	public static void main(String[] args) {
		

		//creating objects and passing values 
		
		Employee s1 = new Employee(111,"Joseph");    
		Employee s2 = new Employee(222,"Sonoo");   
		
	    //calling method to display the values of object    
	    s1.display();    
	    s2.display(); 
	    
	    
	}

}
