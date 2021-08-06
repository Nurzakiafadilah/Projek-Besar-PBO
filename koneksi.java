/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class koneksi {
    Connection con;
    Statement stat;
    
    public void config(){
    try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/database_perpustakaan","root","");
            stat=con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"koneksi gagal"+e.getMessage());
        }
    }
}
