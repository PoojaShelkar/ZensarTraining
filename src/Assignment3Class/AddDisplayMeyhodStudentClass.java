package Assignment3Class;

public class AddDisplayMeyhodStudentClass {

	
		
		private long id;  
		private String name;  
		 
		 
		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public void display()  
		{  
		System.out.println("Roll no.: "+id);  
		System.out.println("Student name: "+name);  
		}  
		

	}


