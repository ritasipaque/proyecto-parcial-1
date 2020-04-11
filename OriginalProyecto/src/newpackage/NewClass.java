/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author lsosa
 */
public class NewClass {
  
    
    Connection conectar=null;
 //   Connection pruebaconexion;
    
    public Connection conexion (){
        try {
           Class.forName("com.mysql.jdbc.Driver");
            
            conectar=(Connection) DriverManager.getConnection ("jdbc:mysql://localhost/Bitacora_BD9", "root","lfsr1999");
            
           JOptionPane.showMessageDialog (null,"Conexion Exitosa");
            
        } catch (Exception e){
            
              JOptionPane.showMessageDialog (null,"Error de Conexion" + e.getMessage ());
        }
        return conectar;
        
        }       

   
    


}
