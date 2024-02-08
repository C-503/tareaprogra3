/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anaca
 */
public class logica {
    
     public DefaultTableModel mostrarpacientes(){
        
        String[] NombreColumna = {"No paciente", "Nombres", "Observacion", "Hora ingreso"};
        String[] registros = new String[4];
        
        DefaultTableModel modelo = new DefaultTableModel(null, NombreColumna);
        
     String SQL = "SELECT no_paciente, nombres, observacion, hora_ingreso\n" +
                        "FROM public.pacien";
     
                        Connection cn = null;
                        PreparedStatement pst = null;
                        ResultSet rs = null;
                        
                        try {
                     
        } catch (Exception e) {
        }
                        
                        
        return null;
        
    }
    
}
