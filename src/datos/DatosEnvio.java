
package datos;

import java.time.LocalTime;
import java.util.Date;

public class DatosEnvio {
    private int idEnvio;
    private Date fecha;
    private LocalTime hora;
    private String ciudad_origen;
    private String ciudad_destino;
    private double peso;
    private String dimensiones;
    private String estado_envio;
    private String precio;
    private String tipo_envio;
    private int cliente_idCliente;
    private int transportista_idTransportista;

    public DatosEnvio() {
    }

    public DatosEnvio(int idEnvio, Date fecha, LocalTime hora, String ciudad_origen, String ciudad_destino, double peso, String dimensiones, String estado_envio, String precio, String tipo_envio, int cliente_idCliente, int transportista_idTransportista) {
        this.idEnvio = idEnvio;
        this.fecha = fecha;
        this.hora = hora;
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.estado_envio = estado_envio;
        this.precio = precio;
        this.tipo_envio = tipo_envio;
        this.cliente_idCliente = cliente_idCliente;
        this.transportista_idTransportista = transportista_idTransportista;
    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getEstado_envio() {
        return estado_envio;
    }

    public void setEstado_envio(String estado_envio) {
        this.estado_envio = estado_envio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTipo_envio() {
        return tipo_envio;
    }

    public void setTipo_envio(String tipo_envio) {
        this.tipo_envio = tipo_envio;
    }

    public int getCliente_idCliente() {
        return cliente_idCliente;
    }

    public void setCliente_idCliente(int cliente_idCliente) {
        this.cliente_idCliente = cliente_idCliente;
    }

    public int getTransportista_idTransportista() {
        return transportista_idTransportista;
    }

    public void setTransportista_idTransportista(int transportista_idTransportista) {
        this.transportista_idTransportista = transportista_idTransportista;
    }
    
    
    
    
}
