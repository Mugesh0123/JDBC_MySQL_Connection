package SqlProject;
import java.sql.*;  
public class ConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub `studentlist`
		// root@127.0.0.1:3306
		//jdbc:mysql://127.0.0.1:3306/?user=root
		//CREATE DATABASE `mugesh` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection connection = DriverManager.getConnection(  
			"jdbc:mysql://127.0.0.1:3306/mugesh","root","*****");  
			Statement stmt=connection.createStatement();  
			ResultSet executeQuery = stmt.executeQuery("select * from studentlist where itno='6' ");  
			while(executeQuery.next())  
			System.out.println(executeQuery.getInt(1)+"  "+executeQuery.getString(2)+"  "+executeQuery.getString(3)+"  " +executeQuery.getInt(4));  
			connection.close();  
			}catch(Exception e){ 
				System.out.println(e);
				}   
	}
}
