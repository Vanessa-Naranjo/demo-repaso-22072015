package com.lvnr.demo.repaso22072025.dto;

public class PersonaDto {
    private int cedula;
    private String nombre;
    private String apellidos;

    public PersonaDto(){
    }

    public PersonaDto(int cedula, String nombre, String apellidos){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellidos=apellidos;

    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
