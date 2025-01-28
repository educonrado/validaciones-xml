/*
 * Clase ReglaNombreImpl.java 28 de enero de 2025
 * Copyright (c) 2025 EK.
 * Todos los derechos reservados.
 *
 * Versión: 0.0.1
 *
 * Corporation EK
 *
 */

package com.excz.reglas.nombre;

import com.excz.Persona;
import com.excz.reglas.IRegla;
import com.excz.reglas.nombre.impl.ReglaLonguitudImpl;
import com.excz.reglas.nombre.impl.ReglaNoVacioImpl;
import com.excz.reglas.nombre.impl.ReglaNombreCompuestoImpl;

import java.util.List;

public class ReglaNombreImpl implements IRegla<Persona> {

    @Override
    public void validar(Persona persona, List<String> errores) {
        ReglaNombreCompuestoImpl validarNombre = new ReglaNombreCompuestoImpl();
        validarNombre.agregarRegla(new ReglaLonguitudImpl());
        validarNombre.agregarRegla(new ReglaNoVacioImpl());
        validarNombre.validarNombre(persona.getNombre(), errores);
    }
}
