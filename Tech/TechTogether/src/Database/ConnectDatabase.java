package Database;

import java.sql.*;

public class ConnectDatabase {

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techTogetherItemizeSample","root","hack2019");

        System.out.println("connected to database successfuly!");

        String query = ("SELECT * from store where brand = 'Walmart'");

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            int colCount = rs.getMetaData().getColumnCount();

//            System.out.println("This is my colCount: " + colCount);
//            int count = 0;
//            while(rs.next())
            }

//
//                while (rs.next()) {
//                 //   int upc = rs.getInt("upc");
//                    String iname = rs.getString("iname");
//                    String cateogry = rs.getString("icategory");
//                    String sname = rs.getString("sname");
//                    String produce = rs.getString("product");
//                    double price = rs.getDouble("price");
//                    String stock = rs.getString("stock");
//                    String brand = rs.getString("brand");
//                    String location = rs.getString("location");
//
//
//                    System.out.println("Store: " + brand);
//                }



        } catch (Exception e) {
            System.out.println(e);
        }
    }}