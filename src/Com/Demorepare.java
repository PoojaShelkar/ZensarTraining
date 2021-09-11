package Com;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class Demorepare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_ecommerce","root","Pooja@123");
				Scanner sc = new Scanner(System.in);
				Statement st=con.createStatement())
				{
			System.out.println("enter custid,name,address and mobile");
			
		
		PreparedStatement pst=(con.prepareStatement("insert into Customer values (?,?,?,?)"));
		
		/*Record Deleted*/
		
		String sql = "delete from Customer where Custid=3";
			 st.executeUpdate(sql);
	      System.out.println("Record deleted successfully");
		 
		
		/* update the record*/
	      
		String sql1 = "update Customer set name='Raj' where Custid=4";
             st.executeUpdate(sql1);
	      System.out.println("Database updated successfully ");
		
		
		
		        int cid=sc.nextInt();
				String nm=sc.next();
				String addr=sc.next();
				long mb=sc.nextLong();
				
				pst.setInt(1,cid);
				pst.setString(2,nm);
				pst.setString(3,addr);
				pst.setLong(4,mb);
				int c=pst.executeUpdate();
				System.out.println("Record Entered");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	

}

