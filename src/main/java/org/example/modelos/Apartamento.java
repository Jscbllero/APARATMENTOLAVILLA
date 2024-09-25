package org.example.modelos;

public class Apartamento {

    private Long id;

    private String ciudad;

    private String alto;

    private String ancho;

    private String largo;

    private String detalles;

    private String numeroReferencia;

    public Apartamento() {
    }

    public Apartamento(Long id, String ciudad, String alto, String ancho, String largo, String detalles, String numeroReferencia) {
        this.id = id;
        this.ciudad = ciudad;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.detalles = detalles;
        this.numeroReferencia = numeroReferencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    @Override
    public String toString() {
        return "apartamento{" +
                "id=" + id +
                ", ciudad='" + ciudad + '\'' +
                ", alto='" + alto + '\'' +
                ", ancho='" + ancho + '\'' +
                ", largo='" + largo + '\'' +
                ", detalles='" + detalles + '\'' +
                ", numeroReferencia='" + numeroReferencia + '\'' +
                '}';
    }
}
