package Assignment3Class;



public class Account8 {
	
	 Long accountno;
	 String customername;

		Account8(){
			System.out.println("Default constructor");
		   }
		  
			  

		   
		   Account8 ( int i,int j){
			      System.out.println("i am in parameterized constructor");
			      
			      
			      
			   }
			   
			   public static void main(String args[]){
				      //This will invoke default constructor
				  

				      /* This will invoke the constructor 
				       * with two int parameters
				       */
				   
				   Account8 obj1 = new Account8();
				   
				   Account8 obj = new  Account8(12, 12);
				   
		}
		}
		   
   