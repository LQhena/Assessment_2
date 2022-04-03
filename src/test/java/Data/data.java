package data;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class data {

    public static ResultSet loadfromDatabase(String db, String user, String password){
        java.sql.Connection conn = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,user,password);
            String strQuery = "SELECT * FROM internapplications;";
            Statement stmt = conn.createStatement();

            rs = stmt.executeQuery(strQuery);

        }catch (SQLException sqlEx){
            sqlEx.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
