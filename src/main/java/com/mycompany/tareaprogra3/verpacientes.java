/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tareaprogra3;

import clases.pacientes;
import clases.pacientes2;
import clases.postgreeconexion;
import com.mycompany.proyectprogra2.Buscarpaciente;
import com.mycompany.proyectprogra2.paciente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anaca
 */
public class verpacientes extends javax.swing.JFrame {

    /**
     * Creates new form verpacientes
     */
    DefaultTableModel model;
    
     List<pacientes> listapacientes;
    pacientes paciente = new pacientes();
    List<pacientes2> listapacientes1;
    pacientes2 paciente1 = new pacientes2();
    
    public verpacientes() {
        initComponents();  
        
        listapacientes = new ArrayList<>();
        
        listapacientes1 = new ArrayList<>();
        
         postgreeconexion conexion = new postgreeconexion();
            Connection CONEXION = conexion.connectarPostgree();
            
            model = new DefaultTableModel();
            model.addColumn("No. paciente");
            model.addColumn("nombre");
            model.addColumn("apellido");
            model.addColumn("Hora ingreso");
            this.tabla.setModel(model);
            
            // CONEXION.close();//SIEMPRE SE CIERRA LA CONEXION
            CONEXION = null; // SE COLOCA A NULL LA CONEXION PARA QUE EL GC TOME ESTE OBJETO Y LO ELIMINE DE MEMORIA
            conexion = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        agregarpaciente = new javax.swing.JButton();
        buscador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        verpaciente = new javax.swing.JButton();
        buscarpaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Pacientes");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No paciente", "Nombre", "Apellido", "hora ingreso"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        agregarpaciente.setText("Agregar paciente");
        agregarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarpacienteActionPerformed(evt);
            }
        });

        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });
        buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorKeyReleased(evt);
            }
        });

        jLabel2.setText("Buscar paciente");

        verpaciente.setText("Ver paciente");
        verpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verpacienteActionPerformed(evt);
            }
        });

        buscarpaciente.setText("Buscar paciente");
        buscarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscarpaciente)
                        .addGap(18, 18, 18)
                        .addComponent(verpaciente)
                        .addGap(18, 18, 18)
                        .addComponent(agregarpaciente)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscador)
                        .addContainerGap())))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarpaciente)
                    .addComponent(verpaciente)
                    .addComponent(buscarpaciente))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarpacienteActionPerformed
        // TODO add your handling code here:
        
         agregarpacientes pacint = new agregarpacientes();
        pacint.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarpacienteActionPerformed

  
    private void verpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verpacienteActionPerformed
        // TODO add your handling code here:
         listapacientes.clear();
          postgreeconexion conexion = new postgreeconexion();
            Connection CONEXION = conexion.connectarPostgree();
            
            try {
              String SQL = "SELECT nopaciente, nombre, apellido, hora_ingreso\n" +
                        "FROM public.pacientez";
                
                Statement statement;

            statement = CONEXION.createStatement(); // creamos sentencia
            ResultSet rs = statement.executeQuery(SQL);
            
            while(rs.next()){
                pacientes dato = new pacientes();
                dato.setNopaciente(rs.getString("nopaciente"));
                dato.setNombre(rs.getString("nombre"));
                dato.setApellido(rs.getString("apellido"));
                dato.setHoraingreso(rs.getString("hora_ingreso"));
                listapacientes.add(dato);
                
            }
            
             CONEXION.close();//SIEMPRE SE CIERRA LA CONEXION
            CONEXION = null; // SE COLOCA A NULL LA CONEXION PARA QUE EL GC TOME ESTE OBJETO Y LO ELIMINE DE MEMORIA
            conexion = null;
                
                
        } catch (SQLException ex) {
              Logger.getLogger(verpacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
            int numeroFila = 4;
            if(listapacientes.size() > 4){
                numeroFila = listapacientes.size();
            }
            String[][] matriz = new String[numeroFila][4];
            
            for (int i = 0; i < listapacientes.size(); i++ ){
                matriz[i][0] = listapacientes.get(i).getNopaciente();
                matriz[i][1] = listapacientes.get(i).getNombre();
                matriz[i][2] = listapacientes.get(i).getApellido();
                matriz[i][3] = listapacientes.get(i).getHoraingreso();
                
            }
              tabla.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "No. paciente", "Nombre", "Apellido", "Hora ingreso"
                }
        ));
              
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int x = 0; x < 6; x++) {
            tabla.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
        }
    }//GEN-LAST:event_verpacienteActionPerformed

    private void buscarpaciente(String Buscar){
        
          listapacientes.clear();
           postgreeconexion conexion = new postgreeconexion();
            Connection CONEXION = conexion.connectarPostgree();
            
            try {
             String SQL = "SELECT nopaciente, nombre, apellido, hora_ingreso\n" +
                        "FROM public.pacientez WHERE nopaciente LIKE '%"+Buscar+"%' OR nombre ILIKE '%"+Buscar+"%' OR dpi ILIKE '%"+Buscar+"%'";
                
                Statement statement;

            statement = CONEXION.createStatement(); // creamos sentencia
            ResultSet rs = statement.executeQuery(SQL); // ejecuta consulta
            
             while(rs.next()){
                pacientes dato = new pacientes();
                dato.setNopaciente(rs.getString("nopaciente"));
                dato.setNombre(rs.getString("nombre"));
                dato.setApellido(rs.getString("apellido"));
                dato.setHoraingreso(rs.getString("hora_ingreso"));
                listapacientes.add(dato);
                
            }
            
             CONEXION.close();//SIEMPRE SE CIERRA LA CONEXION
            CONEXION = null; // SE COLOCA A NULL LA CONEXION PARA QUE EL GC TOME ESTE OBJETO Y LO ELIMINE DE MEMORIA
            conexion = null;
            
            
        } catch (SQLException ex) {
              Logger.getLogger(verpacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
            int numeroFila = 4;
            if(listapacientes.size() > 4){
                numeroFila = listapacientes.size();
            }
            String[][] matriz = new String[numeroFila][4];
            
            for (int i = 0; i < listapacientes.size(); i++ ){
                matriz[i][0] = listapacientes.get(i).getNopaciente();
                matriz[i][1] = listapacientes.get(i).getNombre();
                matriz[i][2] = listapacientes.get(i).getApellido();
                matriz[i][3] = listapacientes.get(i).getHoraingreso();
                
            }
              tabla.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "No. paciente", "Nombre", "Apellido", "Hora ingreso"
                }
        ));
              
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int x = 0; x < 6; x++) {
            tabla.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
        }
    }
    
    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorActionPerformed

    private void buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyReleased
        // TODO add your handling code here:
        buscarpaciente(buscador.getText());
    }//GEN-LAST:event_buscadorKeyReleased

    private void mostrarpacientes(String Buscar2){
        
        try {
            paciente1 = new pacientes2();
             postgreeconexion conexion = new postgreeconexion();
            Connection CONEXION = conexion.connectarPostgree();
            
             Statement statement;

            statement = CONEXION.createStatement(); 
            
            String SQL = "SELECT * FROM public.pacientez WHERE nopaciente LIKE '%"+Buscar2+"%' OR nombre ILIKE '%"+Buscar2+"%' OR dpi ILIKE '%"+Buscar2+"%'; ";
            
           ResultSet rs = statement.executeQuery(SQL);
           
           if(rs.next()){
               
               paciente1.setNopaciente1(rs.getString("nopaciente"));
               paciente1.setNombre1(rs.getString("nombre"));
               paciente1.setApellido1(rs.getString("apellido"));
               paciente1.setSexo1(rs.getString("sexo"));
               paciente1.setFecha1(rs.getString("fecha"));
               paciente1.setDpi1(rs.getString("dpi"));
               paciente1.setLugar1(rs.getString("lugar"));
               paciente1.setAlergias1(rs.getString("alergias"));
               paciente1.setTelefono1(rs.getString("telefono"));
               paciente1.setHoraingreso1(rs.getString("hora_ingreso"));
               
               
           }else{
               
                paciente1.setNopaciente1(rs.getString(" "));
               paciente1.setNombre1(rs.getString(" "));
               paciente1.setApellido1(rs.getString(" "));
               paciente1.setSexo1(rs.getString(" "));
               paciente1.setFecha1(rs.getString(" "));
               paciente1.setDpi1(rs.getString(" "));
               paciente1.setLugar1(rs.getString(" "));
               paciente1.setAlergias1(rs.getString(" "));
               paciente1.setTelefono1(rs.getString(" "));
               paciente1.setHoraingreso1(rs.getString(" "));
               
                JOptionPane.showMessageDialog(null,"no se encontro registro", "Sin registro", JOptionPane.INFORMATION_MESSAGE);

           }
           CONEXION.close();//SIEMPRE SE CIERRA LA CONEXION
            CONEXION = null; // SE COLOCA A NULL LA CONEXION PARA QUE EL GC TOME ESTE OBJETO Y LO ELIMINE DE MEMORIA
            conexion = null;
           
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"error al buscar el paciente", "Sin Busqueda", JOptionPane.ERROR_MESSAGE);
         }
    }
    
    private void buscarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpacienteActionPerformed
        // TODO add your handling code here:
        mostrarpacientes(buscador.getText());
        
        editpacientes Buscar ;
        
         try {
            
            Buscar = new editpacientes();
            Buscar.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(verpacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
    }//GEN-LAST:event_buscarpacienteActionPerformed

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
            java.util.logging.Logger.getLogger(verpacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verpacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verpacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verpacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verpacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarpaciente;
    private javax.swing.JTextField buscador;
    private javax.swing.JButton buscarpaciente;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JButton verpaciente;
    // End of variables declaration//GEN-END:variables
}
