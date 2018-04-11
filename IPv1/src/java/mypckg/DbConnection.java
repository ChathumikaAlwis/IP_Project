package mypckg;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chath
 */
public class DbConnection {
    Connection con=null;
    Statement st;
    
    public Connection connect(String url) throws SQLException, ClassNotFoundException{
        //pass url of any db to connect
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
        con = DriverManager.getConnection(url,"root","1234");
        return con;
    }
    
    public String execInsert(String url,String sql) throws SQLException, ClassNotFoundException,SQLIntegrityConstraintViolationException{
        String status="-1";
       
        try{
        con = connect(url);
        st =con.createStatement();
        status = Integer.toString(st.executeUpdate(sql));
        con.close();
        }
        catch(SQLIntegrityConstraintViolationException myex){
            status= "-153";
            return status;
        }
        
        finally{
        return status;}
    }
    
//    public ResultSet execSelect(){
//    ResultSet rs;
//    
//    con = connect("jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull");
//    return rs;
//    }

  public  ResultSet executeSelect(String url, String sql) throws SQLException, ClassNotFoundException {
        ResultSet rs;      
        con = connect(url);
        st = con.createStatement();
        rs = st.executeQuery(sql);
 //       con.close();
        return rs;       
    }
    
  public void close() throws SQLException{
  con.close();
  }
}
