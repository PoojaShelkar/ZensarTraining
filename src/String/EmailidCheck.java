package String;

public class EmailidCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="poojashelkar@gmail.com";
		
		if(email.contains("@") && email.contains("."))
		{
			int i1=email.indexOf('@');
			int i2=email.indexOf('.');
				if(i1<i2)
				{
					System.out.println("Valid email");
				}
				else
				{
					System.out.println("Not email");
				}
			
		}
		else
		{
			System.out.println("Not valid");
		}
	}
	


	}


