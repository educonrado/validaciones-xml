/*
 * Clase ReglaNombreCompuestoImpl.java 28 de enero de 2025
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

import java.util.ArrayList;
import java.util.List;

public class ReglaNombreCompuestoImpl implements IReglaNombre {

    private List<IReglaNombre> reglas = new ArrayList<>();

    public void agregarRegla(IReglaNombre regla) {
        reglas.add(regla);
    }
    @Override
    public void validarNombre(String nombre, List<String> errores) {
        for (IReglaNombre regla: reglas) {
            regla.validarNombre(nombre, errores);
        }
    }
}
