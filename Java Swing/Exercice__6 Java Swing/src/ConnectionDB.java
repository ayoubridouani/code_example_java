import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ConnectionDB {
	private Connection con;
	private Statement stmt;
	private ResultSet query1;
	private ResultSetMetaData metadata;
	private String[][] data;
	public String[][] getData() {
		return data;
	}
	public ConnectionDB(){
		try {
			Class.forName(new String("com.mysql.jdbc.Driver"));
			con = DriverManager.getConnection(new String("jdbc:mysql://localhost/GestionEmploye"),"root","");
			stmt = con.createStatement();
			query1 = stmt.executeQuery("select * from employe");
			metadata = query1.getMetaData();
			int NumberLines=0;
			while(query1.next()) {
				++NumberLines;
			}
			query1.beforeFirst();
			data =new String[NumberLines][metadata.getColumnCount()];
			int i=0;
			while(query1.next()) {
				for(int j=0;j<metadata.getColumnCount();j++) {
					data[i][j]=query1.getString(j+1);
				}
				++i;
			}
		} 
		catch (Exception e) {
		}
	}
}
