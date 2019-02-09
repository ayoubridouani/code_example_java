package metier;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements MetierInterface {

	Connection con = SConnection.getConnection();
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	@Override
	public Appreciation ajouter(Appreciation ap) {
		try {
			ps = con.prepareStatement("INSERT INTO appreciations (auteur,date,appreiation) VALUES (?,?,?)");
			
			ps.setString(1, ap.getNom());
			ps.setDate(2,ap.getDate());
			ps.setString(3, ap.getAppreciation());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Appreciation> getAppreciation() {
		List<Appreciation> liste = new ArrayList<>();
		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM Appreciation");
			
			while(rs.next()) {
				Appreciation ap = new Appreciation();
				ap.setNom(rs.getString("auteur"));
				ap.setDate(rs.getDate("date"));
				ap.setAppreciation(rs.getString("appreciation"));
				
				liste.add(ap);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return liste;
	}
}
