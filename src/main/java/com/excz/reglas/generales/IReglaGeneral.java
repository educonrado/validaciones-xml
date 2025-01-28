/*
 * Clase IReglaGeneral.java 28 de enero de 2025
 * Copyright (c) 2025 EK.
 * Todos los derechos reservados.
 *
 * Versión: 0.0.1
 *
 * Corporation EK
 *
 */

package com.excz.reglas.generales;

import java.util.List;

public interface IReglaGeneral {

    void validarTextoNuloVacio(String texto, List<String> errores);
}
