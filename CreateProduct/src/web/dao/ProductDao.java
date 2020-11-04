package web.dao;

import java.sql.*;

public class ProductDao {
	
	public boolean barcode_exist(String barcode_) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/products?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		String username ="root";
		String password ="gchasiotis";
		String query ="select * from product where barcode=";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			query=query + "'" + barcode_ +"'";
			PreparedStatement st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);
		
			while(rs.next()) {
			
				String Barcode_db=rs.getString("barcode");
				if(barcode_.equals(Barcode_db)) {
					return true;
				}
			}	
			st.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();	
		}
	
		return false;
	}
	
	public void add_product(String name_, String barcode_, String color_, String desc_) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/products?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		String username="root";
		String password="gchasiotis";
		String query="insert into product values(?,?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, name_);
			st.setString(2, barcode_);
			st.setString(3, color_);
			st.setString(4, desc_);
			
			int count = st.executeUpdate();
			
			st.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
