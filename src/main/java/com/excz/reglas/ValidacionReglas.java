/*
 * Clase ValidacionReglas.java 28 de enero de 2025
 * Copyright (c) 2025 EK.
 * Todos los derechos reservados.
 *
 * Versión: 0.0.1
 *
 * Corporation EK
 *
 */

package com.excz.reglas;

import com.excz.Persona;

import java.util.ArrayList;
import java.util.List;

public class ValidacionReglas {

    private List<IRegla> reglas = new ArrayList<>();
    public void agregarRegla(IRegla regla) {
        reglas.add(regla);
    }

    public List<String> valicionCompleta(Persona persona) {
        List<String> errores = new ArrayList<>();
        for (IRegla regla: reglas) {
            regla.validar(persona, errores);
        }
        return errores;
    }
}
