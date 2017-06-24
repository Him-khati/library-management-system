package sourceFiles;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.*;

public class Utility {
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;
    public static Cipher cipher;
    private KeyGenerator keyGenerator;
    private static Key key ;
    private static String query;
    public static final float  PER_DAY_CHARGE = 2.5f;
    public static String USER_PASSWORD,USER_ID,USER_NAME;
    private static byte[] keyValue=new byte[] 
{ 'A', 'S', 'e', 'c', 'u', 'r', 'e', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y' };

    public Utility() throws NoSuchAlgorithmException, NoSuchPaddingException {
         
	key = new SecretKeySpec(keyValue, "AES");

    }
    
    public boolean validatePassword(String userID)
    {
        try{
            new Dailog(null, true,"Password","Enter password for "+userID);
        String query = "SELECT user_ID FROM user WHERE user_ID = '"+userID+"' AND user_pwd = '"+USER_PASSWORD+"';";
            System.out.println(query);
        rs = stmt.executeQuery(query);
        rs.first();
        String tem =rs.getString("User_ID");
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    public static String encrypt(String plainText) throws Exception 
        {
              
                Cipher chiper = Cipher.getInstance("AES");
                chiper.init(Cipher.ENCRYPT_MODE, key);
                byte[] encVal = chiper.doFinal(plainText.getBytes());
                String encryptedValue = new BASE64Encoder().encode(encVal);
                return encryptedValue;
        }

public static String decrypt(String encryptedText) throws Exception 
        {
                // generate key 
               
                Cipher chiper = Cipher.getInstance("AES");
                chiper.init(Cipher.DECRYPT_MODE, key);
                byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedText);
                byte[] decValue = chiper.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                return decryptedValue;
        }

	
    
    public static String getCurrentDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date dat = new java.util.Date();
            String date=dateFormat.format(dat);
            return date;
    }
    public static void centreWindow(Window frame) {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
    frame.setLocation(x, y);
}
    
     public static String getCurrentTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
            java.util.Date date = new java.util.Date();
            String time=dateFormat.format(date);
            return time;
    }
     
     public static String getUserID() throws SQLException
     {
         int temp=0;
         query = "SELECT user_ID FROM User;";
         Utility.rs = Utility.stmt.executeQuery(query);
              rs.afterLast();
            rs.previous();
                String id = Utility.rs.getString("user_ID");
                 temp = Integer.parseInt(id.substring(2));
                temp++;
              return ("ID".concat(String.valueOf(temp)));
     }
     
     public static String getReturnDate(int issueDays)
     {
         DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar returnDate = Calendar.getInstance();
returnDate.add(Calendar.DAY_OF_MONTH,issueDays);
java.util.Date f = returnDate.getTime();
return (dateformat.format(f));

     }
     
    public static String[] generatePublisherID(String publisher)
    {
        String [] arr = new String[4];String query;
        try {
         query = "SELECT * FROM publisher where pub_Name='"+publisher+"';";
       Utility.rs = Utility.stmt.executeQuery(query);
      if(rs.next()) {
                arr[0] = rs.getString("pub_ID");
                arr[1] = rs.getString("pub_city");
                arr[2] = rs.getString("pub_country");
                arr[3] = rs.getString("pub_contact_no");
           
       }
       else {
            query = "SELECT pub_ID FROM publisher;";
            rs = stmt.executeQuery(query);
            rs.afterLast();
            rs.previous();
                String id = rs.getString("pub_ID");
                int temp = Integer.parseInt(id.substring(3));
                temp++;
                arr[0] = "PUB".concat(String.valueOf(temp));
            }
            
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage());
        }
        return arr;
    }
   
    public static void initialize()
    {
        try
            {
                Class.forName("java.sql.Driver");
                con = (Connection)DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/library_manag","root","");
                stmt = (Statement) con.createStatement();
            System.out.print("System Intialised");
    }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"You won't be able to use features of the program as mySQL is not installed or not configured ");
        }
                
    catch(Exception e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}
    }
}
