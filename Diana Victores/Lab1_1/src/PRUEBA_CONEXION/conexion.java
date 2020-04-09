package PRUEBA_CONEXION;


import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class conexion {
    
    private static conexion cn;
    private static final String drive="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password=""; 
    private static final String url="\"jdbc:mysql://localhost/inicio_sesion";
 //   private String driver;

    public conexion() //throws ClassNotFoundException, SQLException
    
    {
        cn=null;
        try{
          Class.forName (drive);
          cn=Drivermanager.getConnection (url,user,password);
          if (cn !=null);
          System.out.println("conexion establecida ..");
          
            
        }catch (Exception e){
          //  System.out.println("error al conectar" +e);
    }

     }
    public Connection getconnection (){
        return (Connection) cn;
        
    }
    
    public void desconectar (){
         cn = null;
         if (cn==null ){
             System.out.println("conexion terminada..");
             
         }
    }
    
    
    
    
    
    
    
    
    
    
    
    

    private static class Drivermanager {

        private static conexion getConection(String url, String user, String password) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static conexion getConnection(String url, String user, String password) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Drivermanager() {
        }
    }
     
    
    
    
    
    
  

    

   
    
           
    
}
