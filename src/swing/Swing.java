/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;
import java.sql.*;
/**
 *
 * @author rangarajan
 */
public class Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
                    
            }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
