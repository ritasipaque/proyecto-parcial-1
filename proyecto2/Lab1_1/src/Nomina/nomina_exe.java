package Nomina;
import CONTENEDOR.Contenedor;
import Nomina.r_empleados;
import Recibo.recibo;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PERSONAL
 */
public class nomina_exe extends javax.swing.JFrame {
  double sueldoExtra, comisiones, otrosIngresos,bonficacion =250 ;
     float igss=(float) 0.83;  float isr;   float anticipos, dj, otrosDescuentos;
       float igss1;  
      float totDesc;
         String nombree;
        String puestoo;
          float sueldoLiquido;
           float sueldo;
            float totIngresos,horas ;
        
    /**
     * Creates new form nomina_exe
     */
    public nomina_exe() {
        initComponents();
  
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtpues = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtsueldoextra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcomis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtotross = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtanticipos = new javax.swing.JTextField();
        txtjudicial = new javax.swing.JTextField();
        txtotrosss = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CmdCalc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        CmdSalir = new javax.swing.JButton();
        CmdTotales = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TSal = new javax.swing.JTextField();
        cheque = new javax.swing.JButton();
        CmdCalc1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        CmdCalc2 = new javax.swing.JButton();
        ya = new javax.swing.JLabel();
        txtsueldoextra1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 12))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 60, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtnombres.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel2.setText("Puesto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel11.setText("ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 180, -1));
        jPanel1.add(txtpues, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("DATOS PERSONALES");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("INGRESOS");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("Sueldo Extraordinario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtsueldoextra.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtsueldoextra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 120, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("Comisiones:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtcomis.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtcomis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 120, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("Otros:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        txtotross.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtotross, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 120, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("Anticipos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("Descuento Judicial:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setText("Otros:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        txtanticipos.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtanticipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 138, -1));

        txtjudicial.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtjudicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 138, -1));

        txtotrosss.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel1.add(txtotrosss, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 138, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("DESCUENTOS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel15.setText("Sueldo Ordinario:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel1.add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Desarrollo Empresarial S.A.");

        CmdCalc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CmdCalc.setText("Registrar/Calcular");
        CmdCalc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCalcActionPerformed(evt);
            }
        });

        tablita.setBackground(new java.awt.Color(102, 102, 102));
        tablita.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        tablita.setForeground(new java.awt.Color(255, 255, 255));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puesto", "Sueldo Ordinario", "Sueldo Extra", "Bonificación", "Comisiones", "Otros", "Total Ingreso", "IGSS", "ISR", "Anticipos", "Descuento Judicial", "Otros", "Total Descuentosl", "Sueldo Líquido"
            }
        ));
        jScrollPane1.setViewportView(tablita);

        CmdSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CmdSalir.setText("Salir");
        CmdSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSalirActionPerformed(evt);
            }
        });

        CmdTotales.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CmdTotales.setText("Totales");
        CmdTotales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdTotalesActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setText("Total Salarios:");

        TSal.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        cheque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cheque.setForeground(new java.awt.Color(204, 0, 0));
        cheque.setText("Generar Cheque");
        cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeActionPerformed(evt);
            }
        });

        CmdCalc1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CmdCalc1.setText("Modificar");
        CmdCalc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdCalc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCalc1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Registros Empleados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Regresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        CmdCalc2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CmdCalc2.setText("Buscar");
        CmdCalc2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdCalc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCalc2ActionPerformed(evt);
            }
        });

        ya.setText("jLabel15");

        txtsueldoextra1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(ya)
                .addContainerGap(578, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(525, 525, 525)
                        .addComponent(txtsueldoextra1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addComponent(jLabel3)
                            .addGap(207, 207, 207)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(CmdCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(CmdCalc1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(CmdTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(CmdCalc2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(650, 650, 650)
                            .addComponent(Regresar)
                            .addGap(15, 15, 15)
                            .addComponent(CmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(450, 450, 450)
                            .addComponent(cheque)
                            .addGap(25, 25, 25)
                            .addComponent(jLabel10)
                            .addGap(20, 20, 20)
                            .addComponent(TSal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtsueldoextra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(ya)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(CmdCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(CmdCalc1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(CmdTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(CmdCalc2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cheque)
                        .addComponent(jLabel10)
                        .addComponent(TSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void CmdCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCalcActionPerformed
         nombree=txtnombres.getText();
         puestoo=txtpues.getText();
           sueldoExtra=Float.parseFloat(txtsueldoextra.getText());
              sueldo= Float.parseFloat(txtsueldo.getText());
        comisiones= Float.parseFloat(txtcomis.getText());
        otrosIngresos=Float.parseFloat(txtotross.getText());
         puestoo=txtpues.getText();
          anticipos=Float.parseFloat(txtanticipos.getText());
        dj=Float.parseFloat(txtjudicial.getText());
        otrosDescuentos=Float.parseFloat(txtotrosss.getText());
         
       totIngresos = (float) (sueldo+sueldoExtra+comisiones+otrosIngresos);
      //-------------------------------------------------------//
        horas=(float) (sueldoExtra*1.5);
        igss1=sueldo*igss;
        
        if(sueldo>=5000){
            isr=(float) 71.98;
        }
       
       
        //---------
        totDesc=igss+isr+anticipos+dj+otrosDescuentos;
        //---------------------//
       
        sueldoLiquido = totIngresos-totDesc;
        //---------------------------------------//
    
        //--------------------------//
        
         Object[] data = new Object[15];
        data[0]=nombree;
        data[1]=puestoo;
        data[2]=String.valueOf(sueldo);
        data[3]=String.valueOf(horas);
        data[4]=String.valueOf(bonficacion);
        data[5]=String.valueOf(comisiones);
        data[6]=String.valueOf(otrosIngresos);
        data[7]=String.valueOf(totIngresos);
        data[8]=String.valueOf(igss1);
        data[9]=String.valueOf(isr);
        data[10]=String.valueOf(anticipos);
        data[11]=String.valueOf(dj);
        data[12]=String.valueOf(  otrosDescuentos);
        data[13]=String.valueOf(totDesc);
        data[14]=String.valueOf( sueldoLiquido);
        DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
        modelo.addRow(data);
        tablita.setModel(modelo); 
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/nominaphase3o","root","");

            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/nominaphase3o","root","");
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into planilla values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtnombres.getText().trim());
            pst.setString(3, txtpues.getText().trim());
            pst.setString(4, txtsueldoextra.getText().trim());
            pst.setDouble(5, horas);
              pst.setDouble(6, comisiones);
            pst.setString(7, txtcomis.getText().trim());
           pst.setDouble(8, otrosIngresos);
             pst.setDouble(9, totDesc);
               pst.setDouble(10, igss);
            pst.setDouble(11, isr);
            pst.setString(12, txtanticipos.getText().trim());
            pst.setString(13, txtjudicial.getText().trim());
            pst.setString(14, txtotrosss.getText().trim());
            pst.setDouble(15, otrosDescuentos);
            pst.setDouble(16,totDesc);
             pst.executeUpdate();
            txtnombres.setText("");
            txtpues.setText("");
            txtsueldoextra.setText("");
            txtcomis.setText("");
            txtotross.setText("");
            txtanticipos.setText("");
            txtjudicial.setText("");
            txtotrosss.setText("");
         
        tablita.setModel(modelo);
           txtsueldoextra.setText("");
        txtcomis.setText("");
        txtotross.setText("");
        txtanticipos.setText("");
        txtotrosss.setText("");
        txtjudicial.setText("");
        txtnombres.requestFocus();   
            ya.setText("Registro exitoso");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_CmdCalcActionPerformed

    private void CmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CmdSalirActionPerformed

    private void CmdTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdTotalesActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
        float t2=0; String t0="";
        for(int i=0; i<modelo.getRowCount(); i++)
        {
            t0=(String)modelo.getValueAt(i,14);
            t2=t2+Float.parseFloat(t0);
        }
        TSal.setText(String.valueOf(t2));
    }//GEN-LAST:event_CmdTotalesActionPerformed

    private void chequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequeActionPerformed
        this.setVisible(true);
        recibo c= new recibo();
        c.setVisible(true);
        try {
            recibo M = new recibo();
            int fila =tablita.getSelectedRow();

            recibo.TxtNombre1.setText(tablita.getValueAt(fila,0).toString());
            recibo.Puesto.setText(tablita.getValueAt(fila,1).toString());
            recibo.Sueldo1.setText(tablita.getValueAt(fila,3).toString());
            recibo.IGSS.setText(tablita.getValueAt(fila,8).toString());
            recibo.ISR.setText(tablita.getValueAt(fila,9).toString());
            recibo.Totales.setText(tablita.getValueAt(fila,14).toString());

            M.show();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_chequeActionPerformed

    private void CmdCalc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCalc1ActionPerformed
        Object[] data = new Object[15];
        data[0]=nombree;
        data[1]=puestoo;
        data[2]=String.valueOf(sueldo);
        data[3]=String.valueOf(horas);
        data[4]=String.valueOf(bonficacion);
        data[5]=String.valueOf(comisiones);
        data[6]=String.valueOf(otrosIngresos);
        data[7]=String.valueOf(totIngresos);
        data[8]=String.valueOf(igss1);
        data[9]=String.valueOf(isr);
        data[10]=String.valueOf(anticipos);
        data[11]=String.valueOf(dj);
        data[12]=String.valueOf(  otrosDescuentos);
        data[13]=String.valueOf(totDesc);
        data[14]=String.valueOf( sueldoLiquido);
        DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
        modelo.addRow(data);
        tablita.setModel(modelo); 

        
        try {
            String ID = txtid.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nominaphase3o", "root", "");
PreparedStatement pst = cn.prepareStatement("update planilla set CodigoNombre=?, CodigoPuesto=?, CodigoSueldo=?, CodigoComisiones= ?, CodigoOtros= ?, CodigoAnticipos= ?, CodigoDescuento= ?, CodigoOtros2 = ? ,extra=?, bonificaciones=?, igss=? , isr=?  total=? ,total2=?,liquido=?  "       + "   where ID = " + ID);

       pst.setString(1, "0");
            pst.setString(2, txtnombres.getText().trim());
            pst.setString(3, txtpues.getText().trim());
            pst.setString(4, txtsueldoextra.getText().trim());
            pst.setDouble(5, sueldoExtra);
              pst.setDouble(6, comisiones);
            pst.setString(7, txtcomis.getText().trim());
           pst.setDouble(8, otrosIngresos);
             pst.setDouble(9, totDesc);
               pst.setDouble(10, igss);
            pst.setDouble(11, isr);
            pst.setString(12, txtanticipos.getText().trim());
            pst.setString(13, txtjudicial.getText().trim());
            pst.setString(14, txtotrosss.getText().trim());
            pst.setDouble(15, otrosDescuentos);
            pst.setDouble(16,totDesc);
             pst.executeUpdate();
            txtnombres.setText("");
            txtpues.setText("");
            txtsueldoextra.setText("");
            txtcomis.setText("");
            txtotross.setText("");
            txtanticipos.setText("");
            txtjudicial.setText("");
            txtotrosss.setText("");
         
        tablita.setModel(modelo);
           txtsueldoextra.setText("");
        txtcomis.setText("");
        txtotross.setText("");
        txtanticipos.setText("");
        txtotrosss.setText("");
        txtjudicial.setText("");
        txtnombres.requestFocus();   
            ya.setText("Registro exitoso");
         
            
           ya.setText("Modificación exitosa.");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_CmdCalc1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        r_empleados GN= new r_empleados();
        GN.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nominaphase3o", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from planilla where ID = ?");

            pst.setString(1, txtid.getText().trim());
            pst.executeUpdate();
            txtnombres.setText("");
            txtpues.setText("");
            txtsueldoextra.setText("");
            txtcomis.setText("");
            txtotross.setText("");
            txtanticipos.setText("");
            txtjudicial.setText("");
            txtotrosss.setText("");
           
            pst.setString(1, "0");
            pst.setString(2, txtnombres.getText().trim());
            pst.setString(3, txtpues.getText().trim());
            pst.setString(4, txtsueldoextra.getText().trim());
            pst.setDouble(5, sueldoExtra);
              pst.setDouble(6, comisiones);
            pst.setString(7, txtcomis.getText().trim());
           pst.setDouble(8, otrosIngresos);
             pst.setDouble(9, totDesc);
               pst.setDouble(10, igss);
            pst.setDouble(11, isr);
            pst.setString(12, txtanticipos.getText().trim());
            pst.setString(13, txtjudicial.getText().trim());
            pst.setString(14, txtotrosss.getText().trim());
            pst.setDouble(15, otrosDescuentos);
            pst.setDouble(16,totDesc);
             pst.executeUpdate();
            
            Object[] data = new Object[15];
        data[0]="";
        data[1]="";
        data[2]=String.valueOf("");
        data[3]=String.valueOf("");
        data[4]=String.valueOf("");
        data[5]=String.valueOf("");
        data[6]=String.valueOf("");
        data[7]=String.valueOf("");
        data[8]=String.valueOf("");
        data[9]=String.valueOf("");
        data[10]=String.valueOf("");
        data[11]=String.valueOf("");
        data[12]=String.valueOf("");
        data[13]=String.valueOf("");
        data[14]=String.valueOf("");
        DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
        modelo.addRow(data);
        tablita.setModel(modelo);

               ya.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // REGRESAR
        Contenedor GN= new Contenedor();
        GN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void CmdCalc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCalc2ActionPerformed
      
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nominaphase3o", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from planilla where ID = ?");
            pst.setString(1, txtid.getText().trim());

            ResultSet rs = pst.executeQuery();

           
            if(rs.next()){
                txtnombres.setText(rs.getString("CodigoNombre"));
                txtpues.setText(rs.getString("CodigoPuesto"));
                txtsueldoextra.setText(rs.getString("CodigoSueldo"));
                txtcomis.setText(rs.getString("CodigoComisiones"));
                txtotross.setText(rs.getString("CodigoOtros"));
                txtanticipos.setText(rs.getString("CodigoAnticipos"));
                txtjudicial.setText(rs.getString("CodigoDescuento"));
                txtotrosss.setText(rs.getString("CodigoOtros2"));
   
        
                
         Object[] data = new Object[15];
        data[0]=(nombree (rs.getString("CodigoNombre")));
        data[1]=pues(rs.getString("CodigoPuesto"));
        data[2]=sueldo(rs.getString("CodigoSueldo"));
          data[3]=sueldoExtra(rs.getString("extra"));
            data[4]=bonficacion(rs.getString(" bonificaciones"));
        data[5]=comisiones(rs.getString(" CodigoComisiones"));
        data[6]=totIngresos(rs.getString("  CodigoOtros"));
          data[7]=totIngresos(rs.getString(" total"));
        data[8]=igss1(rs.getString("igss"));
        data[9]=isr(rs.getString("isr"));
        data[10]=anticipos(rs.getString(" CodigoAnticipos "));
        data[11]=dj(rs.getString("CodigoDescuento "));
        data[12]=otrosDescuentos(rs.getString("CodigoOtros2"));
        data[13]=nombree(rs.getString("total"));
        data[14]=sueldoLiquido (rs.getString("liquido"));
      
        DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
        modelo.addRow(data);
        tablita.setModel(modelo); 
               
                
                
                
                
                
                
                
                
                
                
          

            } else {
                JOptionPane.showMessageDialog(null, "Persona no registrada.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_CmdCalc2ActionPerformed

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
            java.util.logging.Logger.getLogger(nomina_exe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nomina_exe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nomina_exe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nomina_exe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nomina_exe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdCalc;
    private javax.swing.JButton CmdCalc1;
    private javax.swing.JButton CmdCalc2;
    private javax.swing.JButton CmdSalir;
    private javax.swing.JButton CmdTotales;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TSal;
    private javax.swing.JButton cheque;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablita;
    private javax.swing.JTextField txtanticipos;
    private javax.swing.JTextField txtcomis;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjudicial;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtotross;
    private javax.swing.JTextField txtotrosss;
    private javax.swing.JTextField txtpues;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JTextField txtsueldoextra;
    private javax.swing.JTextField txtsueldoextra1;
    private javax.swing.JLabel ya;
    // End of variables declaration//GEN-END:variables

    private void Float(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object nombree(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object sueldo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object pues(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object comisiones(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object bonficacion(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object totIngresos(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object igss1(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object isr(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object anticipos(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object dj(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object otrosDescuentos(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object sueldoExtra(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object sueldoLiquido(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
