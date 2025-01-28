/*
 * Clase ReglaGeneralCompuestaImpl.java 28 de enero de 2025
 * Copyright (c) 2025 EK.
 * Todos los derechos reservados.
 *
 * Versión: 0.0.1
 *
 * Corporation EK
 *
 */

package com.excz.reglas.generales.impl;

import com.excz.reglas.generales.IReglaGeneral;

import java.util.ArrayList;
import java.util.List;

public class ReglaGeneralCompuestaImpl implements IReglaGeneral {

    private final List<IReglaGeneral> reglas = new ArrayList<>();

    public void agregarRegla(IReglaGeneral regla) {
        reglas.add(regla);
    }
    @Override
    public void validarTextoNuloVacio(String texto, List<String> errores) {
        for (IReglaGeneral regla: reglas) {
            regla.validarTextoNuloVacio(texto, errores);
        }
    }
}
