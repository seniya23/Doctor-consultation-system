package Phase3;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author seni
 */
public class Noteencrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Noteencrypt p=new Noteencrypt();
        
    }
    
    public String edisplay(String s){
    
        String ps="";
        
        try{
             
            // Generate object of KeyGenerator & SecretKey
            KeyGenerator keygenerator =KeyGenerator.getInstance("DES");
            SecretKey myDesKey=keygenerator.generateKey();
            
            //Creating object of Cipher
            
            Cipher desCipher;
            desCipher= Cipher.getInstance("DES");
            
            //Creating Byte Array to store string byte[ ] text = " No body can see me,".getBytes("UTFS");
            
            byte[] text = s.getBytes("UTF8");
            
            
            //Encrypting text
            desCipher.init(Cipher.ENCRYPT_MODE,myDesKey);
            byte[] Noteencrypt= desCipher.doFinal(text);
            
            //Converting encrypted byte array to string 
            ps= new String( Noteencrypt);
            
            
        }
        
        catch (Exception  e){
        System.out.println("Exception");
        }
        
        return ps;
    }
    
}
