package retailpayment;

import java.sql.*;

/**
 * DBObject communicates with the database
 * 
 * @author z.shirdel
 *
 */
public class DbObject {
	Connection conn = null;
	String URL = "jdbc:mysql://192.168.12.121:3306/retailpayment?" + "user=root&password=1234";

	// Class.forName("com.mysql.jdbc.Driver").newInstance();
	/**
	 * update, delete, insert
	 * 
	 * @return
	 * @throws SQLException
	 */
	public boolean ExecuteNonQuery() throws SQLException {
		conn = DriverManager.getConnection(URL);
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement("");
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("");

		
		
		pstmt.close();
		stmt.close();
		return false;
	}

	/**
	 * select
	 * 
	 * @return
	 * @throws SQLException
	 */
	public boolean ExecuteReader() throws SQLException {
		conn = DriverManager.getConnection(URL);
		Statement stmt = conn.createStatement();
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement("");
		
		
		ResultSet rs = stmt.executeQuery("");
		rs.close();
		return false;
	}

	public boolean PM() throws SQLException {
		conn = DriverManager.getConnection(URL);
		Statement stmt = conn.createStatement();

		return false;
	}
}
