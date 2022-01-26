import java.sql.*;
public class MySqlConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/anildb","root","Anil@123");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from STUDENTS where RN=10 ");
		
		rs.next();
		int roll=rs.getInt("RN");
		String name=rs.getString("Name");
		String city =rs.getString("City");
		
		System.out.println(roll+" "+name+" "+city);
		
		st.close();
		con.close();
	}

}
