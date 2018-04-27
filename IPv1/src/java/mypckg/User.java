package mypckg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

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
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr the addr to set
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the tele
     */
    public int getTele() {
        return tele;
    }

    /**
     * @param tele the tele to set
     */
    public void setTele(int tele) {
        this.tele = tele;
    }

    /**
     * @return the regDate
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * @param regDate the regDate to set
     */
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the lastLogin
     */
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     * @param lastLogin the lastLogin to set
     */
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * @return the password
     */
//    public String getPassword() {
//        return password;
//    }

    /**
     * @param password the password to set
     */
    private String password;private String username;
    private String firstname;private String lastname;private String addr;private String dob;private int tele;private String regDate;
    private String gender;private String NIC;private String email;private String lastLogin;
    
    
    
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
    //String url = "jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull";//path of db for users    
    
    public String addUser() throws SQLException, ClassNotFoundException{
    DbConnection con = new DbConnection();    
    String sql = "INSERT INTO customer(username,password,firstname,lastname,addr,dob,tele,regDate,gender,NIC,email,lastLogin) VALUES('" +username+ "','" +password+ "','"+firstname+"','"+lastname+"','"+addr+"','"+dob+"',"+tele+",'"+regDate+"','"+gender+"','"+NIC+"','"+email+"','"+lastLogin+"');";
    String r = con.execInsert(sql);
    return r;
    }
            
    public String validateUser() throws SQLException, ClassNotFoundException{
    DbConnection con = new DbConnection();    
    String sql = "SELECT COUNT(cusid) FROM customer WHERE username='"+username+"' AND password='"+password+"'";
    try{
     rs = con.executeSelect(sql);
    }
    catch(Exception e){return e.getMessage();}
    rs.next();
    String r= rs.getString(1);

    return r;
    }     
    
    public String updateUser(String username) throws SQLException, ClassNotFoundException{
    DbConnection con = new DbConnection();
    String uname = username;
    String sql = "UPDATE customer set lastLogin='"+LocalDateTime.now().toString() +"' WHERE username='"+uname+"'";
    String r = con.execUpdate(sql);
        System.out.println(r);
    return r;
    }
            
}
