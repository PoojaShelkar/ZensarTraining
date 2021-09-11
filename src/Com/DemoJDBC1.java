package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJDBC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try	
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ restaurant_ecommerce","root","Pooja@123");
        System.out.println("connection established");
        Statement st=con.createStatement();
        int c= st.executeUpdate("insert into Customer values (1,'Pooja','Pune',8888711071)");
        System.out.println("Records Update"+c);
		}
	catch(ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}
	}

}
