package com.example.Sistema.de.inventario.modelo;

import jakarta.persistence.*;

//Clave primaria
@Entity
@Table(name="Empresa")
public class Empresa {
    //Clave primaria
    @Id
    //funcione como tabla tenga un incremento ordinal segun las sedes
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String nit;
    private String direccion;
    private String telefono;

    public Empresa() {
    }

    public Empresa( String nombre, String nit, String direccion, String telefono) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

