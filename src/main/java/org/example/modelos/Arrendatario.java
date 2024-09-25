package org.example.modelos;

public class Arrendatario {

    private Long id;

    private String nombre;

    private String apellido;

    private Integer personasCargo;

    private String tipoTrabajo;

    private String capacidadMonetaria;

    private String referencias;

    public Arrendatario() {
    }

    public Arrendatario(Long id, String nombre, String apellido, Integer personasCargo, String tipoTrabajo, String capacidadMonetaria, String referencias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.personasCargo = personasCargo;
        this.tipoTrabajo = tipoTrabajo;
        this.capacidadMonetaria = capacidadMonetaria;
        this.referencias = referencias;
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

    public Integer getPersonasCargo() {
        return personasCargo;
    }

    public void setPersonasCargo(Integer personasCargo) {
        this.personasCargo = personasCargo;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public String getCapacidadMonetaria() {
        return capacidadMonetaria;
    }

    public void setCapacidadMonetaria(String capacidadMonetaria) {
        this.capacidadMonetaria = capacidadMonetaria;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    @Override
    public String toString() {
        return "arrendatario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", personasCargo=" + personasCargo +
                ", tipoTrabajo='" + tipoTrabajo + '\'' +
                ", capacidadMonetaria='" + capacidadMonetaria + '\'' +
                ", referencias='" + referencias + '\'' +
                '}';
    }
}
