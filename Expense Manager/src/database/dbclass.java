<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;
import javax.swing.*;

public class dbclass {
    public static Connection con;
    public static Statement st;
    
    static{
       
    
    try{
    
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expensemanager","root","1234");
    st = con.createStatement();
    }catch (Exception ex){
        JOptionPane.showMessageDialog(null ,ex);
            }
}
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;
import javax.swing.*;

public class dbclass {
    public static Connection con;
    public static Statement st;
    
    static{
       
    
    try{
    
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expensemanager","root","1234");
    st = con.createStatement();
    }catch (Exception ex){
        JOptionPane.showMessageDialog(null ,ex);
            }
}
}
>>>>>>> 9b81d57b84a5f4dfbf873d2f5f25f297c27b3ca7
