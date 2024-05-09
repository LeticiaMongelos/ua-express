package logica;

import datos.DatosEnvio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Envio {
    private ConexionBaseDeDatos mysql = new ConexionBaseDeDatos();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer total_registros;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        
        String [] titulos = {"ID","Fecha","Hora","Origen","Destino","Peso","Dimensiones","Estado del envio","Precio","Tipo de envio","idCliente","Cliente","idTransportista","Transportista"};
        
        String [] registro = new String [14];
        
        total_registros = 0;
        modelo = new DefaultTableModel(null,titulos);
        
        sSQL = "select * from envio where ciudad_destino like '%" + buscar + "%' order by idEnvio";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()) {
                registro [0] = rs.getString("idEnvio");
                registro [1] = rs.getString("fecha");
                registro [2] = rs.getString("hora");
                registro [3] = rs.getString("ciudad_origen");
                registro [4] = rs.getString("ciudad_destino");
                registro [5] = rs.getString("peso");
                registro [6] = rs.getString("dimensiones");
                registro [7] = rs.getString("estado_envio");
                registro [8] = rs.getString("precio");
                registro [9] = rs.getString("tipo_envio");
                registro [10] = rs.getString("cliente_idCliente");
                registro [11] = rs.getString("transportista_idTransportista");
                
                total_registros = total_registros + 1;
                modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
            return null;
        }
    }
    
    public boolean insertar(DatosEnvio dts) {
        sSQL = "insert into envio (fecha,hora,ciudad_origen,ciudad_destino,peso,dimensiones,estado_envio,precio,tipo_envio)" +
                "values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getFecha());
            pst.setString(2, dts.getHora());
            pst.setString(3, dts.getCiudad_origen());
            pst.setString(4, dts.getCiudad_destino());
            pst.setString(5, dts.getPeso());
            pst.setString(6, dts.getDimensiones());
            pst.setString(7, dts.getEstado_envio());
            pst.setString(8, dts.getPrecio());
            pst.setString(9, dts.getTipo_envio());
            pst.setString(10, dts.getCliente_idCliente());
            pst.setString(11, dts.getTransportista_idTransportista());
            
            int n = pst.executeUpdate();
            
            if (n != 0){
                return true;
            } else {
                return false;
            }
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean editar(DatosEnvio dts) {
        sSQL = "update envio set fecha=?, hora=?, ciudad_origen=?, ciudad_destino=?, peso=?, dimensiones=?, estado_envio=?, precio=?, tipo_envio=?" +
                " where idEnvio=?";
        
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getFecha());
            pst.setString(2, dts.getHora());
            pst.setString(3, dts.getCiudad_origen());
            pst.setString(4, dts.getCiudad_destino());
            pst.setString(5, dts.getPeso());
            pst.setString(6, dts.getDimensiones());
            pst.setString(7, dts.getEstado_envio());
            pst.setString(8, dts.getPrecio());
            pst.setString(9, dts.getTipo_envio());
            pst.setString(10, dts.getCliente_idCliente());
            pst.setString(11, dts.getTransportista_idTransportista());
            
            int n = pst.executeUpdate();
            
            if (n != 0){
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean eliminar(DatosEnvio dts) {
        sSQL = "delete from envio where idEnvio=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdEnvio());
            
            int n = pst.executeUpdate();
            
            if (n != 0){
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}

