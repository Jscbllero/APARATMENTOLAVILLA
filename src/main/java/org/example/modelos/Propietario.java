package org.example.modelos;

public class Propietario {

    private Long id;

    private String nombre;

    private String apellido;

    private String ciudad;

    private Integer valorApartamento;

    private String tipoApartamento;

    private String ubicacionApartamento;

    public Propietario() {
    }

    public Propietario(Long id, String nombre, String apellido, String ciudad, Integer valorApartamento, String tipoApartamento, String ubicacionApartamento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.valorApartamento = valorApartamento;
        this.tipoApartamento = tipoApartamento;
        this.ubicacionApartamento = ubicacionApartamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getValorApartamento() {
        return valorApartamento;
    }

    public void setValorApartamento(Integer valorApartamento) {
        this.valorApartamento = valorApartamento;
    }

    public String getTipoApartamento() {
        return tipoApartamento;
    }

    public void setTipoApartamento(String tipoApartamento) {
        this.tipoApartamento = tipoApartamento;
    }

    public String getUbicacionApartamento() {
        return ubicacionApartamento;
    }

    public void setUbicacionApartamento(String ubicacionApartamento) {
        this.ubicacionApartamento = ubicacionApartamento;
    }

    @Override
    public String toString() {
        return "propietario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", valorApartamento=" + valorApartamento +
                ", tipoApartamento='" + tipoApartamento + '\'' +
                ", ubicacionApartamento='" + ubicacionApartamento + '\'' +
                '}';
    }
}
