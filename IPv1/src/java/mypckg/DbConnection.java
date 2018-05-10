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
    
    public Connection connect() throws SQLException, ClassNotFoundException{
        //pass url of any db to connect
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restdb?zeroDateTimeBehavior=convertToNull","root","1234");
        return con;
    }
    
    public String execInsert(String sql) throws SQLException, ClassNotFoundException,SQLIntegrityConstraintViolationException{
        String status="-1";
       
        try{
        con = connect();
        st =con.createStatement();
        status = Integer.toString(st.executeUpdate(sql));
            System.out.println(status);
        con.close();
        }
        catch(SQLIntegrityConstraintViolationException myex){
            status= "-153";
            return status;
        }
        catch(Exception e){status=e.getMessage();}
        
        finally{
        return status;}
    }
    
//    public ResultSet execSelect(){
//    ResultSet rs;
//    
//    con = connect("jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull");
//    return rs;
//    }

  public  ResultSet executeSelect(String sql) throws SQLException, ClassNotFoundException {
        ResultSet rs;      
        con = connect();
        st = con.createStatement();
        rs = st.executeQuery(sql);
 //       con.close();
        return rs;       
    }
    
    public String execUpdate(String sql) throws SQLException, ClassNotFoundException,SQLIntegrityConstraintViolationException{
        String status="-1";
       
        try{
        con = connect();
        st =con.createStatement();
        status = Integer.toString(st.executeUpdate(sql));
        con.close();
        }
        
        catch(Exception e){status=e.getMessage();}
        
        finally{
        return status;}
    }
    
    
 
  
  
  
  public void close() throws SQLException{
  con.close();
  }

    PreparedStatement prepareStatement(String insert_into_menuitemimg_VALUES) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
