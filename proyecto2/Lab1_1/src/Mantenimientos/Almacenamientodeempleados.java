/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;
import CONTENEDOR.Contenedor;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author familia Sipaque
 */
public class Almacenamientodeempleados extends javax.swing.JFrame {
    String nombre;
String DepartamentoEmp;
String PuestoEmp;
String TelefonoEmp;
String CuentaEmp;
String DireccionEmp;
String SexoEmp;
String edadEmp;
String correoEmp;
String estatus;

    /**
     * Creates new form Almacenamientodeempleados
     */
    public Almacenamientodeempleados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_NombreEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_DepartamentoEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_TelefonoEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_CuentaEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_DireccionEmpleado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_EdadEmpleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_CorreoEmpleado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txt_SexoEmpleado = new javax.swing.JComboBox<>();
        txt_PuestoEmpleado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento de Empleados ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 200, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de Empleados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 40, 200, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del Empleado : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 78, 160, -1));
        getContentPane().add(txt_NombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 76, 205, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Departamento del Empleado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 107, -1, -1));
        getContentPane().add(txt_DepartamentoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 107, 205, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Puesto del Empleado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 140, 160, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono del Empleado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 171, 135, -1));
        getContentPane().add(txt_TelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 169, 205, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Datos del Empleado");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 204, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No.de Cuenta del Empleado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 240, -1, -1));
        getContentPane().add(txt_CuentaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 235, 205, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Direccion del Empleado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 275, 157, -1));
        getContentPane().add(txt_DireccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 273, 205, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sexo del Empleado: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 306, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Edad del Empleado:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 344, -1, -1));
        getContentPane().add(txt_EdadEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 342, 205, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Correo del Empleado: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 375, -1, -1));
        getContentPane().add(txt_CorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 373, 205, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 423, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ingrese el codigo del empleado :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 464, -1, -1));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 464, 70, -1));

        jButton4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 502, 80, -1));

        label_status.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 502, 245, 31));

        jButton5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 423, -1, -1));

        jButton6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 423, -1, -1));

        txt_SexoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        txt_SexoEmpleado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txt_SexoEmpleadoItemStateChanged(evt);
            }
        });
        txt_SexoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SexoEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_SexoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 304, 151, -1));

        txt_PuestoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contador/a ", "Contador Auxiliar/a", " Secretario/a ", "Vendedor/a ", "Chofer ", "Mensajero/a", "Jefe/a", "Gerente/a" }));
        txt_PuestoEmpleado.setActionCommand("");
        getContentPane().add(txt_PuestoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 138, 116, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre ", "Departamento", "Puesto ", "Telefono ", "No.Cuenta", "Direccion", "Sexo", "Edad", "Correo"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 608, 113));

        jButton2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mantenimientos/blue3.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 500));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mantenimientos/blue3.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 640, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // se registran todo los empleados
         DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        
        nombre=txt_NombreEmpleado.getText();
      DepartamentoEmp=txt_DepartamentoEmpleado.getText();
      PuestoEmp=txt_PuestoEmpleado.getSelectedItem().toString();
        TelefonoEmp=txt_TelefonoEmpleado.getText();
        CuentaEmp=txt_CuentaEmpleado.getText();
        DireccionEmp=txt_DireccionEmpleado.getText();
        SexoEmp=txt_SexoEmpleado.getSelectedItem().toString();
        edadEmp=txt_EdadEmpleado.getText();
        correoEmp=txt_CorreoEmpleado.getText();
        estatus=label_status.getText();
        
        Object  [] fila=new Object [10];
        fila[0]=nombre;
        fila[1]=txt_DepartamentoEmpleado.getText();
        fila[2]=txt_PuestoEmpleado.getSelectedItem().toString();
        fila[3]=txt_TelefonoEmpleado.getText();
        fila[4]=txt_CuentaEmpleado.getText();
        fila[5]=txt_DireccionEmpleado.getText();
        fila[6]=txt_SexoEmpleado.getSelectedItem().toString();
        fila[7]=txt_EdadEmpleado.getText();
        fila[8]=txt_CorreoEmpleado.getText();
        fila[9]=label_status.getText();
        modelo.addRow(fila);
        tblDatos.setModel(modelo); 
        //-----------------------------------------------------------------------------------------------------
        try {

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins800", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into Mantenimiento values(?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txt_NombreEmpleado.getText().trim());
            pst.setString(3, txt_DepartamentoEmpleado.getText().trim());
            pst.setString(4, txt_PuestoEmpleado.getSelectedItem().toString());
            pst.setString(5, txt_TelefonoEmpleado.getText().trim());
            pst.setString(6, txt_CuentaEmpleado.getText().trim());
            pst.setString(7, txt_DireccionEmpleado.getText().trim());
            pst.setString(8, txt_SexoEmpleado.getSelectedItem().toString());
            pst.setString(9, txt_EdadEmpleado.getText().trim());
            pst.setString(10,  txt_CorreoEmpleado.getText().trim());
            pst.executeUpdate();

            txt_NombreEmpleado.setText("");
            txt_DepartamentoEmpleado.setText("");
            txt_PuestoEmpleado.setSelectedItem("");
            txt_TelefonoEmpleado.setText("");
            txt_CuentaEmpleado.setText("");
            txt_DireccionEmpleado.setText("");
            txt_SexoEmpleado.setSelectedItem("");
            txt_EdadEmpleado.setText("");
            txt_CorreoEmpleado.setText("");
            label_status.setText("Registro exitoso.");
        } catch (Exception e) {

        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // se buscan todos los empleados que se han registrado y ver si existe detro de la base de datos

        try {
            Connection cn;
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins800", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from Mantenimiento where ID = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_NombreEmpleado.setText(rs.getString("NombreEmpleado"));
                txt_DepartamentoEmpleado.setText(rs.getString("DepartamentoEmpleado"));
                txt_TelefonoEmpleado.setText(rs.getString("telefonoEmpleado"));
                txt_PuestoEmpleado.setSelectedItem(rs.getString("PuestoEmpleado"));
                txt_CuentaEmpleado.setText(rs.getString("CuentaEmpleado"));
                txt_DireccionEmpleado.setText(rs.getString("DireccionEmpleado"));
                txt_SexoEmpleado.setSelectedItem(rs.getString("SexoEmpleado"));
                txt_EdadEmpleado.setText(rs.getString("EdadEmpleado"));
                txt_CorreoEmpleado.setText(rs.getString("CorreoEmpleado"));

            } else {
                JOptionPane.showMessageDialog(null, "Empleado no registrado.");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins800", "root", "");
            PreparedStatement pst = cn.prepareStatement("update Mantenimiento set NombreEmpleado = ?, DepartamentoEmpleado = ?, PuestoEmpleado = ?, telefonoEmpleado = ?, CuentaEmpleado = ?, DireccionEmpleado = ?, SexoEmpleado = ?, EdadEmpleado = ?, CorreoEmpleado = ?    where ID = " + ID);

            pst.setString(1, txt_NombreEmpleado.getText().trim());
            pst.setString(2, txt_DepartamentoEmpleado.getText().trim());
            pst.setString(3, txt_PuestoEmpleado.getSelectedItem().toString());
            pst.setString(4, txt_TelefonoEmpleado.getText().trim());
            pst.setString(5, txt_CuentaEmpleado.getText().trim());
            pst.setString(6, txt_DireccionEmpleado.getText().trim());
            pst.setString(7, txt_SexoEmpleado.getSelectedItem().toString());
            pst.setString(8, txt_EdadEmpleado.getText().trim());
            pst.setString(9, txt_CorreoEmpleado.getText().trim());
            pst.executeUpdate();

            label_status.setText("Modificacion exitosa.");

        } catch (Exception e) {
        }
        //--------------------------------------------------------------------------------------------
        String [] datos=new String [5];
        datos[0]=txt_NombreEmpleado.getText();
        datos[1]=txt_DepartamentoEmpleado.getText();
        datos[2]=txt_PuestoEmpleado.getSelectedItem().toString();
        datos[3]=txt_TelefonoEmpleado.getText();
        datos[4]=txt_CuentaEmpleado.getText();
        datos[5]=txt_DireccionEmpleado.getText();
        datos[6]=txt_SexoEmpleado.getSelectedItem().toString();
        datos[7]=txt_EdadEmpleado.getText();
        datos[8]=txt_CorreoEmpleado.getText();
        datos[9]=label_status.getText();
        int i = 0;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins800", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from Mantenimiento where ID = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_NombreEmpleado.setText("");
            txt_DepartamentoEmpleado.setText("");
            txt_PuestoEmpleado.setSelectedItem("");
            txt_TelefonoEmpleado.setText("");
            txt_CuentaEmpleado.setText("");
            txt_DireccionEmpleado.setText("");
            txt_SexoEmpleado.setSelectedItem("");
            txt_EdadEmpleado.setText("");
            txt_CorreoEmpleado.setText("");

            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }
        //-----------------------------------------------------------------------------------
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        int a=tblDatos.getSelectedRow();
        if (a<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }else{
            int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el registro?");
            if (JOptionPane.OK_OPTION == confirmar){
                modelo.removeRow(a);
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt_SexoEmpleadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txt_SexoEmpleadoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SexoEmpleadoItemStateChanged

    private void txt_SexoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SexoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SexoEmpleadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Contenedor GN= new Contenedor(); 
         GN.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Almacenamientodeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacenamientodeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacenamientodeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacenamientodeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacenamientodeempleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txt_CorreoEmpleado;
    private javax.swing.JTextField txt_CuentaEmpleado;
    private javax.swing.JTextField txt_DepartamentoEmpleado;
    private javax.swing.JTextField txt_DireccionEmpleado;
    private javax.swing.JTextField txt_EdadEmpleado;
    private javax.swing.JTextField txt_NombreEmpleado;
    private javax.swing.JComboBox<String> txt_PuestoEmpleado;
    private javax.swing.JComboBox<String> txt_SexoEmpleado;
    private javax.swing.JTextField txt_TelefonoEmpleado;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
