package Assignment3Class;

public class MainGetterSetter {
	
	public static void main(String[] args)
	{ 
		EmpUseGetterandSetter em = new EmpUseGetterandSetter("Deep", 23435, "TCS"); 
	 String name = em.getName(); // This method will read the value of the variable. Since the return type of this method is String. That's why we will store the returning value using a variable 'name' with data type String. 

	 int id = em.getId(); // The return type of this method is an integer. 
	 String nCompany = em.getNCompany(); 
	 System.out.println("Employee's name: " +name); 
	 System.out.println("Employee's id: " +id);
	 System.out.println("Company's name: " +nCompany);
	 } 
	}