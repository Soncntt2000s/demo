/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class MD5Encryptor {
    
    public static String encrypt(String pass)throws NoSuchAlgorithmException,UnsupportedEncodingException
    {   
        String enrpass;
        MessageDigest msd = MessageDigest.getInstance("MD5");
        byte[] passByte = pass.getBytes("UTF-8");
        byte[] enrpassMD5 = msd.digest(passByte);
        
        BigInteger bigInt = new BigInteger(1,enrpassMD5);
        enrpass = bigInt.toString(16);
        return enrpass;                                
               
    }
    
}
