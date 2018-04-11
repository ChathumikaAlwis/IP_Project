/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypckg;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

/**
 *
 * @author Chath
 */
public class EncryptPw {
    private String pw;
    
    public void setPw(String pw){
    this.pw=pw;
    }
    

    
    public String enc() throws NoSuchAlgorithmException{
    if(pw!=null&&!" ".equals(pw)){
        MessageDigest digester;
    
    try{
    digester = MessageDigest.getInstance("SHA-512");
    byte[] passwordInBytes = pw.getBytes();
    digester.reset();
    byte[] digested = digester.digest(passwordInBytes);
    
    StringBuffer buffer = new StringBuffer();
    for(byte d:digested){buffer.append(Integer.toHexString(0xFF & d));}
    pw = buffer.toString();
    
    
    }
    catch(NoSuchAlgorithmException ex){
    pw="error";
    }
    
    finally{
    return pw;
    }
    }
    else{
    pw="-1";
    return pw;
    }
    }
}
