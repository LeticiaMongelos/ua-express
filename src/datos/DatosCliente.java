
package datos;

public class DatosCliente {
        private int idCliente;
        private String nombre;
        private String apellido;
        private String tipoDocumento;
        private String numDocumento;
        private String direccion;
        private String departamento;
        private String ciudad;
        private String telefono;
        private String telefonoAdicional;
        private String email;

    public DatosCliente() {
    }

    public DatosCliente(int idCliente, String nombre, String apellido, String tipoDocumento, String numDocumento, String direccion, String departamento, String ciudad, String telefono, String telefonoAdicional, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.direccion = direccion;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.telefonoAdicional = telefonoAdicional;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoAdicional() {
        return telefonoAdicional;
    }

    public void setTelefonoAdicional(String telefonoAdicional) {
        this.telefonoAdicional = telefonoAdicional;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
        
}
