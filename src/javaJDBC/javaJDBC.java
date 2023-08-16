package javaJDBC;

import java.sql.*;

public class javaJDBC {

    public static void main(String[] args) throws Exception {

        String jdbcUrl = "jdbc:mysql://localhost:3307/student";
        String name = "root";
        String password = "s.sshetty2003";
        int studentID =3;
        String studentname ="hello";
        

        String query = "INSERT INTO information VALUES (?, ?)";
        Class.forName("com.mysql.jdbc.Driver");
        //abt forname

        Connection con = DriverManager.getConnection(jdbcUrl, name, password);
        Statement st  = con.createStatement();
        PreparedStatement pst = con.prepareStatement(query);//instead of prepare its easy to write query

        pst.setInt(1, studentID);
        pst.setString(2, studentname);

        int count = pst.executeUpdate();
        System.out.println(count + " rows affected");
        //ResultSet rs = st.executeQuery(query); //dl, dql
        
        //fetching value
        /*
        while(rs.next()) {
       
        String userdata = rs.getString(1)+ ':'+ rs.getString(2);
        
        
        System.out.println(userdata);
        }
        */
        st.close();
        con.close();
        
          
    }
}
