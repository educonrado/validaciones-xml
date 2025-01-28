/*
 * Clase ReglaGeneralImpl.java 28 de enero de 2025
 * Copyright (c) 2025 EK.
 * Todos los derechos reservados.
 *
 * Versión: 0.0.1
 *
 * Corporation EK
 *
 */

package com.excz.reglas.generales;

import com.excz.Persona;
import com.excz.reglas.IRegla;
import com.excz.reglas.generales.impl.ReglaGeneralCompuestaImpl;
import com.excz.reglas.generales.impl.ReglaGeneralTextoImpl;

import java.util.List;

public class ReglaGeneralImpl implements IRegla<Persona> {
    @Override
    public void validar(Persona persona, List<String> errores) {
        ReglaGeneralCompuestaImpl reglaGeneralCompuesta = new ReglaGeneralCompuestaImpl();
        reglaGeneralCompuesta.agregarRegla(new ReglaGeneralTextoImpl());
        reglaGeneralCompuesta.validarTextoNuloVacio(persona.getNombre(), errores);
    }
}
