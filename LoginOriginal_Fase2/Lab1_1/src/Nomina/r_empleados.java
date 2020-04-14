package Nomina;


import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Formatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana
 */
public class r_empleados extends javax.swing.JFrame {
    String barra= File.separator;
    String CrearUbicacion=System.getProperty("user.dir")+barra+"DatosTXT"+barra;
    //Se esta creando una carpeta llamada datosTXT dentro de nuestro proyecto
    //Lugar donde se almacenaran los datos 


    /**
     * Creates new form r_empleados
     */
    public r_empleados() {
        initComponents();
        this.tablaempleado.setModel(model);
        this.model.addColumn("Codigo");
        this.model.addColumn("Empleado");
        this.model.addColumn("Cargo");
        this.model.addColumn("Fecha de Contrato");
        this.model.addColumn("Sueldo");
        
    }
    private void crearempleado(){ //throws FileNotFoundException{
    String archivo=txtcodigo.getText()+".txt";
    File CrearUbi=new File(CrearUbicacion);
    File CrearArchi = new File(CrearUbicacion+archivo);
    if(txtcodigo.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane,"No Existe Codigo");
    }else{
        try {
            if(CrearArchi.exists()){
                JOptionPane.showMessageDialog(rootPane,"El Codigo ya se encuentra registrado");
  
            }else{
                CrearUbi.mkdirs();
                Formatter CrearForma=new Formatter(CrearUbicacion+archivo);
                //s\r\n por cada campo de texto que vamos a registrar
                //codigo, empleado, etc
                CrearForma.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n","Codigo="+txtcodigo.getText(),
                        "Empleado="+txtempleado.getText(),
                        "Cargo="+comcargo.getSelectedItem(),
                        "Fecha de Contratacion="+txtfecha.getText(),
                        "Sueldo="+txtsueldo.getText());
                CrearForma.close();
                JOptionPane.showMessageDialog(rootPane, "Registro Exitoso");
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Registro Incorrecto");
        }
    }
}
    
    @SuppressWarnings("unchecked")
        DefaultTableModel model=new DefaultTableModel();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleado = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtempleado = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        comcargo = new javax.swing.JComboBox<>();
        txtsueldo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CrearArchivo = new javax.swing.JButton();
        BITACORA = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        label_estatus = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRO EMPLEADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 26, -1, -1));

        tablaempleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaempleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaempleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaempleado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 723, 202));

        jLabel3.setText("EMPLEADO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setText("CARGO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setText("FECHA DE CONTRATO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, -1, -1));

        jLabel6.setText("SUELDO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 170, -1));
        getContentPane().add(txtempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 170, -1));
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, -1));

        comcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contador", "Auxiliar", "Secretaria", "Vendedora", "Chofer", "Mensajero" }));
        comcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comcargoActionPerformed(evt);
            }
        });
        getContentPane().add(comcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 170, -1));
        getContentPane().add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, -1));

        jButton2.setText("NUEVO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 120, 150, -1));

        jButton3.setText("EDITAR (ACTUALIZAR)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 160, 150, -1));

        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 150, -1));

        jButton1.setText("GRABAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 80, 150, -1));

        CrearArchivo.setText("GENERAR ARCHIVO");
        CrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(CrearArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 200, 150, -1));

        BITACORA.setText("BITACORA");
        BITACORA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BITACORAMouseClicked(evt);
            }
        });
        BITACORA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BITACORAActionPerformed(evt);
            }
        });
        getContentPane().add(BITACORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 111, -1));

        label_status.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 237, -1, -1));

        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 110, -1));
        getContentPane().add(label_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 170, -1));

        jButton6.setText("BUSCAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 150, -1));

        jLabel7.setText("BUSCAR");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel2.setText("CODIGO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // CONEXION MYSQL
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/nomina","root","");
           
           Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/nomina","root","");
            java.sql.PreparedStatement pst = conectar.prepareStatement("insert into employee_record values(?,?,?,?,?)");
                      
           // pst.setString(1, "0");
            pst.setString(1, txtcodigo.getText().trim());
            pst.setString(2, txtempleado.getText().trim());
            pst.setString(3, comcargo.getSelectedItem().toString());
            pst.setString(4, txtfecha.getText().trim());
            pst.setString(5, txtsueldo.getText().trim());
         
            pst.executeUpdate();
            
            txtcodigo.setText("");
            txtempleado.setText("");
            comcargo.setSelectedItem("");
            txtfecha.setText("");
            txtsueldo.setText("");
        
            label_estatus.setText("Regiatro exitoso");
            
        } catch (Exception e) {
            
        }

        
        //-----------------------------------------------------------------------------------------------------------------------------------------------------//
       // CODIGO R_EMPLEADOS
       
        this.model.addRow(new Object [] {
        this.txtcodigo.getText(),this.txtempleado.getText(), this.comcargo.getSelectedItem(),this.txtfecha.getText(),this.txtsueldo.getText()
        });
        this.txtcodigo.setText("");
        this.txtempleado.setText("");
        this.comcargo.setSelectedIndex(0);
        this.txtfecha.setText("");
        this.txtsueldo.setText("");
        txtcodigo.grabFocus();
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // CONEXION MYSQL
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/nomina","root","");
           
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nomina", "root", "");//conecta a MYSQL  
           java.sql.PreparedStatement pst = conectar.prepareStatement("insert into employee_record values(?,?,?,?,?)");
           
            pst.setString(1, txtcodigo.getText().trim()); 
            pst.setString(2, txtempleado.getText().trim()); 
            pst.setString(3, comcargo.getSelectedItem().toString());
            pst.setString(4, txtfecha.getText().trim()); 
            pst.setString(5, txtsueldo.getText().trim()); 
       
            pst.executeUpdate();
            
            txtcodigo.setText("");
            txtempleado.setText("");
            comcargo.getSelectedItem().toString();
            txtfecha.setText("");
            txtsueldo.setText("");
   
            label_status.setText("Registro exitoso.");
    
             }catch (Exception e){
         e.printStackTrace();
        }
    //---------------------------------------------------------------------------------------------------//
            //CODIGO R_EMPLEADOS
        this.txtcodigo.setText("");
        this.txtempleado.setText("");
        this.comcargo.setSelectedIndex(0);
        this.txtfecha.setText("");
        this.txtsueldo.setText("");
        txtcodigo.grabFocus();
        
          
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
int filas;

    @SuppressWarnings("empty-statement")
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // CONEXION MYSQL MODIFICAR
        
       
            try {
            String ID = txt_buscar.getText().trim();

           Class.forName("com.mysql.jdbc.Driver");
           Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/nomina","root","");
           
           
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nomina", "root", "");
            java.sql.PreparedStatement pst = conectar.prepareStatement("update employee_record set CodigoEmpleado = ?, CodigoCargo = ?, CodigoFecha = ?, CodigoSueldo = ?, where ID = " + ID);

            pst.setString(2, txtcodigo.getText().trim());
            pst.setString(1, txtempleado.getText().trim());
            pst.setString(1, comcargo.getSelectedItem().toString());
            pst.setString(1, txtfecha.getText().trim()); 
            pst.setString(1, txtsueldo.getText().trim()); 
          
            pst.executeUpdate();

            label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
        
    
   //-----------------------------------------------------------------------------------------------------//
   // CODIGO R_EMPLEADOS 
   
   
        String [] datos=new String [5];
        datos[0]=txtcodigo.getText();
        datos[1]=txtempleado.getText();
        datos[2]=this.comcargo.getSelectedItem().toString();
        datos[3]=txtfecha.getText();
        datos[4]=txtsueldo.getText();
        int i = 0;
        
        for (int a  = 0; a < tablaempleado.getColumnCount(); a++) {
        modelo.setValueAt(datos[a],filas, a );
    }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       // int fila_seleccionada=tablaempleado.getSelectedRow();
       // if(fila_seleccionada>=0){
       //     modelo.removeRow(fila_seleccionada);
       // }else{
       //     JOptionPane.showMessageDialog(null, "seleccione una fila por favor");
       // }
                //CODIGO CONEXION
         try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/nomina","root","");
           
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nomina", "root", "");
           java.sql.PreparedStatement pst = conectar.prepareStatement("delete from employee_record values(?,?,?,?,?)");


            pst.setString(1, txt_buscar.getText().trim());

            pst.executeUpdate();

            txtcodigo.setText("");
            txtempleado.setText("");
            comcargo.setSelectedItem("");
            txtfecha.setText("");
            txtsueldo.setText("");
           

            label_estatus.setText("Registro Eliminado con exito");

        } catch (Exception e) {
        }
        
       
  //---------------------------------------------------------------------------------------------------------------//
      //CODIGO R_EMPLEADOS
   //    DefaultTableModel modelo = (DefaultTableModel) tablaempleado.getModel();
   //    int a=tablaempleado.getSelectedRow();
 //      if (a<0){
           //JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
  //     }else{
   //        int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el registro?");
   //        if (JOptionPane.OK_OPTION == confirmar){
   //            modelo.removeRow(a);
   //           JOptionPane.showMessageDialog(null, "Registro Eliminado");
   //        }
   //    }
     
    }//GEN-LAST:event_jButton4ActionPerformed

    
 
    private void CrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearArchivoActionPerformed
try{
     Class.forName("com.mysql.jdbc.Driver");
     Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/nomina","root","");
           
           
    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nomina", "root", "");//conecta a MYSQL  
    PreparedStatement pst = (PreparedStatement) conectar.prepareStatement("insert into employee_record values(?,?,?,?,?)");
          
            
            pst.setString(1, txtcodigo.getText().trim()); 
            pst.setString(2, txtempleado.getText().trim()); 
             pst.setString(3, this.comcargo.getSelectedItem().toString());
            pst.setString(4, txtfecha.getText().trim());
            pst.setString(5, txtsueldo.getText().trim());
             
            pst.executeUpdate();
            
            txtcodigo.setText("");
            txtempleado.setText("");
            this.comcargo.getSelectedItem().toString();
            txtfecha.setText("");
            txtsueldo.setText("");
   
            label_status.setText("Registro exitoso.");
            
           
            }catch (Exception e){
        e.printStackTrace();
        }
   //-------------------------------------------------------------------------------//         
// CODIGO R_EMPLEADOS
   crearempleado();
    txtcodigo.setText("");
    txtempleado.setText("");
    txtfecha.setText("");
    txtsueldo.setText("");
    }//GEN-LAST:event_CrearArchivoActionPerformed

    
    
    private void tablaempleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaempleadoMouseClicked
        // CONEXION MYSQL
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/nomina","root","");
           
           
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nomina", "root", "");//conecta a MYSQL  
           java.sql.PreparedStatement pst = conectar.prepareStatement("delete from employee_record where Nombre = ?");

             
            pst.setString(1, txtcodigo.getText().trim());
            pst.setString(2, txtempleado.getText().trim());
            pst.setString(3, comcargo.getSelectedItem().toString());
            pst.setString(4, txtfecha.getText().trim());
            pst.setString(5, txtsueldo.getText().trim());
            
            txtcodigo.setText("");
            txtempleado.setText("");
            this.comcargo.getSelectedItem().toString();
            txtfecha.setText("");
            txtsueldo.setText("");
            
            label_status.setText("Registro eliminado.");
    
            
         }catch (Exception e){
        e.printStackTrace();
        }
        
        
        
    //-----------------------------------------------------------------------------------------------------//
            //CODIGO R_EMPLEADOS
        int fila_seleccionada=tablaempleado.getSelectedRow();
        txtcodigo.setText(tablaempleado.getValueAt(fila_seleccionada,0).toString());
        txtempleado.setText(tablaempleado.getValueAt(fila_seleccionada,1).toString());
        comcargo.setSelectedItem(tablaempleado.getValueAt(fila_seleccionada,2).toString());
        txtfecha.setText(tablaempleado.getValueAt(fila_seleccionada,3).toString());
        txtsueldo.setText(tablaempleado.getValueAt(fila_seleccionada,4).toString());
        int filas_selaeccionada = 0;
        filas=filas_selaeccionada;
        
        
  
        
    }//GEN-LAST:event_tablaempleadoMouseClicked

    private void BITACORAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BITACORAMouseClicked
        // TODO add your handling code here:
        bitacora bita=new bitacora();
        bita.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BITACORAMouseClicked

    private void BITACORAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BITACORAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BITACORAActionPerformed

    private void comcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comcargoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
 
           Connection cn;
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/nomina","root","");
           
           cn = DriverManager.getConnection("jdbc:mysql://localhost/nomina", "root", "");
           PreparedStatement pst = (PreparedStatement) conectar.prepareStatement("select * from employee_record where Nombre = ?");
            
            pst.setString(1, txt_buscar.getText().trim());
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
            txtcodigo.setText(rs.getString("Codigo"));
            txtempleado.setText(rs.getString("Empleado"));
            comcargo.setSelectedItem(rs.getString("Cargo"));
            txtfecha.setText(rs.getString("Fecha"));
            txtsueldo.setText(rs.getString("Sueldo"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no registrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton6ActionPerformed
     DefaultTableModel modelo=new DefaultTableModel();
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(r_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(r_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(r_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(r_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new r_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BITACORA;
    private javax.swing.JButton CrearArchivo;
    private javax.swing.JComboBox<String> comcargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_estatus;
    private javax.swing.JLabel label_status;
    private javax.swing.JTable tablaempleado;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtempleado;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtsueldo;
    // End of variables declaration//GEN-END:variables

    private void Crear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
