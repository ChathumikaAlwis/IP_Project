package mypckg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chath
 */
public class User {

    /**
     * @return the password
     */
//    public String getPassword() {
//        return password;
//    }

    /**
     * @param password the password to set
     */
        private String password;
    private String username;
    
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    Connection connection;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull";//path of db for users    
    
    public String addUser() throws SQLException, ClassNotFoundException{
    DbConnection con = new DbConnection();    
    String sql = "INSERT INTO usertbl(username,password) VALUES('" +username+ "','" +password+ "');";
    String r = con.execInsert(url,sql);
    return r;
    }
            
    public String validateUser() throws SQLException, ClassNotFoundException{
    DbConnection con = new DbConnection();
    String status;
    String sql = "SELECT COUNT(userid) FROM usertbl WHERE username='"+username+"' AND password='"+password+"'";
    try{
     rs = con.executeSelect(url,sql);
    }
    catch(Exception e){return e.getMessage();}
    rs.next();
    String r= rs.getString(1);

    return r;
    }     
    
    
            
}
