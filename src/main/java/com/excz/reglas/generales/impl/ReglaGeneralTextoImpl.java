/*
 * Clase ReglaGeneralTextoImpl.java 28 de enero de 2025
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

import java.util.List;
import java.util.Objects;

public class ReglaGeneralTextoImpl implements IReglaGeneral {
    @Override
    public void validarTextoNuloVacio(String texto, List<String> errores) {
        if (Objects.isNull(texto) || texto.trim().isEmpty()) {
            errores.add("El nombre no debe estar vacío.");
        }
    }
}
