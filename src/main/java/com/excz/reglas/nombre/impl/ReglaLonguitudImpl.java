/*
 * Clase ReglaLonguitudImpl.java 28 de enero de 2025
 * Copyright (c) 2025 EK.
 * Todos los derechos reservados.
 *
 * Versión: 0.0.1
 *
 * Corporation EK
 *
 */

package com.excz.reglas.nombre.impl;

import com.excz.reglas.nombre.IReglaNombre;

import java.util.List;

public class ReglaLonguitudImpl implements IReglaNombre {
    @Override
    public void validarNombre(String nombre, List<String> errores) {
        if (nombre.length() < 2 || nombre.length() > 50) {
            errores.add("El nombre debe contener de 2 a 50 caracteres.");
        }
    }
}
