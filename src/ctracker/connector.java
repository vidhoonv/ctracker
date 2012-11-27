/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ctracker;
import java.sql.*;
/**
 *
 * @author Vidhoon
 */
public class connector {
 public connector(){}
   public Connection connect()
{
       
    try
    {

        
   Class.forName("org.apache.derby.jdbc.ClientDriver");
    System.out.println("TRYING connect");
    Connection myconnection=DriverManager.getConnection("jdbc:derby://localhost:1527/ctracker","vidhoon", "vidhoon");
    System.out.println("connection established");
     return myconnection;
 
        
    }
    catch(Exception e)
    {
        System.out.println("Connection error"+e);
    }
   return null;
    }
    
    public void close_connect(Connection my_copy)
    {
        try
        {
         my_copy.close();
         System.out.println("Connection closed");
    
        }
        catch(Exception e)
        {
            System.out.println("Exception"+e);
        }
        }
}
