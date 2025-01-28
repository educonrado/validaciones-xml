/*
 * Clase ReglaNoVacioImpl.java 28 de enero de 2025
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
import java.util.Objects;

public class ReglaNoVacioImpl implements IReglaNombre {
    @Override
    public void validarNombre(String nombre, List<String> errores) {
        if (Objects.isNull(nombre) || nombre.trim().isEmpty()) {
            errores.add("El nombre no debe estar vacío.");
        }
    }
}
