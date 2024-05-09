package logica;

import datos.DatosCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cliente {
    private ConexionBaseDeDatos mysql = new ConexionBaseDeDatos();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer total_registros;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        
        String [] titulos = {"ID","Nombre","Apellido","Tipo de documento","Número de documento","Dirección","Departamento","Ciudad","Teléfono","Teléfono adicional","Email"};
        
        String [] registro = new String [11];
        
        total_registros = 0;
        modelo = new DefaultTableModel(null,titulos);
        
        sSQL = "select * from cliente where numDocumento like '%" + buscar + "%' order by idCliente";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()) {
                registro [0] = rs.getString("idCliente");
                registro [1] = rs.getString("nombre");
                registro [2] = rs.getString("apellido");
                registro [3] = rs.getString("tipoDocumento");
                registro [4] = rs.getString("numDocumento");
                registro [5] = rs.getString("direccion");
                registro [6] = rs.getString("departamento");
                registro [7] = rs.getString("ciudad");
                registro [8] = rs.getString("telefono");
                registro [9] = rs.getString("telefonoAdicional");
                registro [10] = rs.getString("email");
                
                total_registros = total_registros + 1;
                modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
            return null;
        }
    }
    
    public boolean insertar(DatosCliente dts) {
        sSQL = "insert into cliente (nombre,apellido,tipoDocumento,numDocumento,direccion,departamento,ciudad,telefono,telefonoAdicional,email)" +
                "values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellido());
            pst.setString(3, dts.getTipoDocumento());
            pst.setString(4, dts.getNumDocumento());
            pst.setString(5, dts.getDireccion());
            pst.setString(6, dts.getDepartamento());
            pst.setString(7, dts.getCiudad());
            pst.setString(8, dts.getTelefono());
            pst.setString(9, dts.getTelefonoAdicional());
            pst.setString(10, dts.getEmail());
            
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
    
    public boolean editar(DatosCliente dts) {
        sSQL = "update cliente set nombre=?, apellido=?, tipoDocumento=?, numDocumento=?, direccion=?, departamento=?, ciudad=?, telefono=?, telefonoAdicional=?, email=? " +
                " where idCliente=?";
        
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellido());
            pst.setString(3, dts.getTipoDocumento());
            pst.setString(4, dts.getNumDocumento());
            pst.setString(5, dts.getDireccion());
            pst.setString(6, dts.getDepartamento());
            pst.setString(7, dts.getCiudad());
            pst.setString(8, dts.getTelefono());
            pst.setString(9, dts.getTelefonoAdicional());
            pst.setString(10, dts.getEmail());
            pst.setInt(11, dts.getIdCliente());
            
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
    
    public boolean eliminar(DatosCliente dts) {
        sSQL = "delete from cliente where idCliente=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdCliente());
            
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
