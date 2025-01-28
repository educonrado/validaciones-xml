/*
 * Clase Main.java 28 de enero de 2025
 * Copyright (c) 2025 EK.
 * Todos los derechos reservados.
 *
 * Versión: 0.0.1
 *
 * Corporation EK
 *
 */

package org.example;

import com.excz.ErrorHandler;
import com.excz.Persona;
import com.excz.ValidacionesNegocio;
import com.excz.XMLToObjectConvert;
import com.excz.reglas.ValidacionReglas;
import com.excz.reglas.nombre.ReglaNombreImpl;
import jakarta.xml.bind.JAXBException;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SAXException, IOException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(new File("src/main/resources/schema.xsd"));

        Validator validator = schema.newValidator();

        validator.setErrorHandler(new ErrorHandler());

        try {
            validator.validate(new StreamSource(new File("src/main/resources/persona.xml")));
            System.out.println("XML Correcto");
            ValidacionesNegocio validacionesNegocio = new ValidacionesNegocio();
            Persona persona = XMLToObjectConvert.convertirXMLToObject("src/main/resources/persona.xml", Persona.class);
            //Patrón chain of responsability
            ValidacionReglas validacionReglas = new ValidacionReglas();

            validacionReglas.agregarRegla(new ReglaNombreImpl());
            List<String> errores = validacionReglas.valicionCompleta(persona);
            errores.forEach(System.out::println);

        } catch (SAXException e) {
            System.err.println("--> No se procesa" + e.getMessage());
        } catch (JAXBException e) {
            System.err.println("--> error convertir: " + e.getCause());
        }
    }
}