/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import ManagementSystem.Home;
import javax.swing.JOptionPane;

/**
 *
 * @author gulsh
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem","root", "golu@22944");
           return con;
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e.toString());
            return null;
            }
        }
//       public static void main(String args[]) {
//       
//           ConnectionProvider obj=new ConnectionProvider();
//           Connection c=obj.getCon();
//       
//       }
    }
    

