package learnconstructor;

//Java program to overload constructors 

class Worker{    
  int id;    
  String name;    
  int age;    
  //creating two arg constructor    
  Worker(int i,String n){    
  id = i;    
  name = n;    
  }    
  //creating three arg constructor    
  Worker(int i,String n,int a){    
  id = i;    
  name = n;    
  age=a;    
  }    
  //creating method to display values  
  void display(){
	  System.out.println(id+" "+name+" "+age);
	  }    
}  
//creating a Main class to create instance and call methods

public class LearnParameterizedConstructorOverload {

	public static void main(String[] args) {
		
		//creating objects and passing values
		
		Worker s1 = new Worker(111,"Karan");    
		Worker s2 = new Worker(222,"Aryan",25);    
	    s1.display();    
	    s2.display();

	}

}
