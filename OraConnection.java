import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class OraConnection {

	public static void main(String[] args) {
		
		try {
			OracleDataSource ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@//localhost:1521/XEPDB1");
			ods.setUser("system");
			ods.setPassword("Sm0k3stack3r");
			Connection conn = ods.getConnection();
			
			PreparedStatement prep = conn.prepareStatement("SELECT 'Hello World' FROM DUAL");
			ResultSet rslt = prep.executeQuery();
			while (rslt.next()){
				System.out.println(rslt.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello World");

	}

}
