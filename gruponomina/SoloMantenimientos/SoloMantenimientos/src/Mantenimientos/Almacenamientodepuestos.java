//DIANA VICTORES 9959-19-1471/MODIFICACION DE DISEÑO
//RITA SIPAQUE 9959-19-3293/Creao el mantenimineto
package Mantenimientos;
import CONTENEDOR.Contenedor;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author familia Sipaque
 */
public class Almacenamientodepuestos extends javax.swing.JFrame {
   //Variables locales - Luis Sosa
    String CodigoPuesto;
    String NombreEmp;
    String Estatus;
    String Puesto;

    /**
     * Creates new form Almacenamientodepuestos
     */
    public Almacenamientodepuestos() {
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

        jLabel3 = new javax.swing.JLabel();
        txt_1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txt_2 = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del empleado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 112, 160, -1));
        getContentPane().add(txt_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 69, 205, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ingrese el codigo:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 280, -1, -1));
        getContentPane().add(txt_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 145, 205, -1));

        jButton6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 237, -1, -1));
        getContentPane().add(txt_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 107, 205, -1));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 280, 80, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("codigo del puesto  :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 74, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 237, -1, -1));

        jButton5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 237, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estatus del puesto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 150, 130, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Puesto del empleado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 185, 150, -1));
        getContentPane().add(txt_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 183, 204, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mantenimiento de Puestos");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 11, -1, -1));

        label_status.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_status.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 320, 230, 31));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Puesto", "Nombre Empleado", "Estatus", "Puesto"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 420, 165));

        jButton3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 237, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mantenimientos/blue3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mantenimientos/blue3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 470, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyectofinal", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from puestos where ID = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_1.setText("");
            txt_2.setText("");
            txt_3.setText("");
            txt_4.setText("");

            label_status.setText("Registro  eliminado.");

        } catch (Exception e) {
        }
        //---------------------------------------------------------------------------
        
        //Eliminar datos de la tabla - Luis Sosa
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // se registran todo los empleados
        
        CodigoPuesto=txt_1.getText();
        NombreEmp=txt_2.getText();
        Estatus=txt_3.getText();
        Puesto=txt_4.getText();
        
        
         DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        Object  [] fila=new Object [6];
        fila[0]=txt_1.getText();
        fila[1]=txt_2.getText();
        fila[2]=txt_3.getText();
        fila[3]=txt_4.getText();
        
        modelo.addRow(fila);
        tblDatos.setModel(modelo);
        
        //-------------------------------------------------------------------------------------------------------  
        
        try {

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyectofinal", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into puestos values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txt_1.getText().trim());
            pst.setString(3, txt_2.getText().trim());
            pst.setString(4, txt_3.getText().trim());
            pst.setString(5, txt_4.getText().trim());
            pst.executeUpdate();

            txt_1.setText("");
            txt_2.setText("");
            txt_3.setText("");
            txt_4.setText("");

            label_status.setText("Registro  exitoso.");
        } catch (Exception e) {

        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyectofinal", "root", "");
            PreparedStatement pst = cn.prepareStatement("update puestos set codigo_puestos = ?, nombre_empleado =?, Estatus_puesto = ?, Puesto = ?  where ID = " + ID);

            pst.setString(1, txt_1.getText().trim());
            pst.setString(2, txt_2.getText().trim());
            pst.setString(3, txt_3.getText().trim());
            pst.setString(4, txt_4.getText().trim());
            pst.executeUpdate();

            label_status.setText("Modificacion exitosa.");

        } catch (Exception e) {
        }
        //-------------------------------------------------------------------------------
        
        //Modificar los datos en la tabla - Luis Sosa
        String [] datos=new String [5];
        datos[0]=txt_1.getText();
        datos[1]=txt_2.getText();
        datos[2]=txt_3.getText();
        datos[3]=txt_4.getText();
        int i = 0;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn;
            cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyectofinal", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from puestos where ID = ?");
            pst.setString(1, txt_buscar.getText().trim());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                txt_1.setText(rs.getString("codigo_puestos"));
                txt_2.setText(rs.getString("nombre_empleado"));
                txt_3.setText(rs.getString("Estatus_puesto"));
                txt_4.setText(rs.getString("Puesto"));

            } else {
                JOptionPane.showMessageDialog(null, " no registrado.");
            }

        } catch (Exception e) {

        }
        
         //------------------------------------------------------------------------------------------------
   
   //Buscar y presentar los datos en la tabla - Luis Sosa
   DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        Object  [] fila=new Object [6];
        fila[0]=txt_1.getText();
        fila[1]=txt_2.getText();
        fila[2]=txt_3.getText();
        fila[3]=txt_4.getText();
        
        modelo.addRow(fila);
        tblDatos.setModel(modelo);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Contenedor GN= new Contenedor(); 
         GN.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Almacenamientodepuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacenamientodepuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacenamientodepuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacenamientodepuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacenamientodepuestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}