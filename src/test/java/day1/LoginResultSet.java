package day1;

import java.sql.*;

public class LoginResultSet {
    public static void main(String[] args) throws SQLException {
        // REPLACE THIS IP ADDRESS WITH YOUR OWN THAT WORKING IN SQL DEVELOPER
        String connectionStr = "jdbc:oracle:thin:@3.83.129.121:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * FROM REGIONS");
        //rs.next(); method will return boolean value
        // if there is a row-->> return true and move the pointer to next row
        // if there is no next row-->> will return false;

        while(rs.next()){
            System.out.println("Region_ID "+rs.getString("REGION_ID"));
            System.out.println("Region_Name "+rs.getString("REGION_NAME"));
        }

        // ITERATE OVER ALL COUNTRIES
        rs=stmnt.executeQuery("SELECT * FROM COUNTRIES");
        //rs.next();
        //System.out.println(rs.getString(1));

        while(rs.next()){
            System.out.println(rs.getString(1) + "\t");
            System.out.println(rs.getString(2) + "\t");
            System.out.println(rs.getString(3) + "\t");
        }

    }
}