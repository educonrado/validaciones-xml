/*
 * Clase ErrorHandler.java 28 de enero de 2025
 * Copyright (c) 2025 EK.
 * Todos los derechos reservados.
 *
 * Versión: 0.0.1
 *
 * Corporation EK
 *
 */

package com.excz;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public final class ErrorHandler extends DefaultHandler {

    @Override
    public void warning(SAXParseException e) throws SAXException {
        System.out.println("Advertencia: "+ e.getMessage());
        throw new SAXException();
    }
    @Override
    public void error(SAXParseException e) throws SAXException {
        System.err.println("Error: "+ e.getMessage());
        throw new SAXException();
    }
    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        System.err.println("Error fatal: "+ e.getMessage());
        throw new SAXException();
    }
}
