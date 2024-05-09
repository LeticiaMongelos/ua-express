package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBaseDeDatos {
    public String db = "transportadora";
    public String url = "jdbc:mysql://127.0.0.1/" + db;
    public String user = "root";
    public String password = "";

    public ConexionBaseDeDatos() {
    }

    public Connection conectar() {
        Connection link = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
        
    }
}