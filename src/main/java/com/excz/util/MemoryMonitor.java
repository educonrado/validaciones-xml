
/*
 * Clase MemoryMonitor.java 28 de enero de 2025
 * Copyright (c) 2025 EK.
 * Todos los derechos reservados.
 *
 * Versión: 0.0.1
 *
 * Corporation EK
 *
 */

package com.excz.util;

public class MemoryMonitor {

    public void test() {

        Runtime runtime = Runtime.getRuntime();

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memoria utilizada antes del procesamiento: " + memoryBefore + " bytes");
        // Procesamiento del archivo XML
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memoria utilizada después del procesamiento: " + memoryAfter + " bytes");

        long memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memoria utilizada durante el procesamiento: " + memoryUsed + " bytes");
    }
}
