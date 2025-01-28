/*
 * Clase Persona.java 28 de enero de 2025
 * Copyright (c) 2025 EK.
 * Todos los derechos reservados.
 *
 * Versión: 0.0.1
 *
 * Corporation EK
 *
 */

package com.excz;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

/**
 *
 */
@XmlRootElement
public class Persona implements Serializable {
    private String nombre;
    private int edad;
    private String correo;

    @XmlElement
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @XmlElement
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                '}';
    }
}
