package Assignment4;

public class ParameterzedConstructor {

		
	
		   
	ParameterzedConstructor (){
	      System.out.println("Default constructor");
	   }
	   /* Parameterized constructor with 
	    * two integer arguments
	    */
	ParameterzedConstructor (int i, int j){
	      System.out.println("i am in parameterized constructor");
	   }
	   
	   public static void main(String args[]){
		      //This will invoke default constructor
		   ParameterzedConstructor obj = new ParameterzedConstructor();

		      /* This will invoke the constructor 
		       * with two int parameters
		       */
		   ParameterzedConstructor obj2 = new ParameterzedConstructor(12, 12);

}
}
