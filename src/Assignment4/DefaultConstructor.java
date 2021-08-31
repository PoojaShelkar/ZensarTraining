package Assignment4;

public class DefaultConstructor {



	DefaultConstructor(){
		      System.out.println("Default constructor");
		   }
		   public void mymethod()
		   {
		      System.out.println("Void method of the class");
		   }
		   public static void main(String args[]){
			/* new keyword creates the object of the class
		         * and invokes constructor to initialize object
		         */
			   DefaultConstructor obj = new DefaultConstructor();
			obj.mymethod();
		   }
		
	}


