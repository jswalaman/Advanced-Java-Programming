/* Code snippet : */

import java.sql.*;

class Main{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String dburl = "jdbc:mysql://localhost/dd";
            String username = "root";
            String password = "root";
            
            Connection conn = DriverManager.getConnection(dbur1, username, password);
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO DB VALUES()");
            System.out.println("Statement executed succesfully");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
