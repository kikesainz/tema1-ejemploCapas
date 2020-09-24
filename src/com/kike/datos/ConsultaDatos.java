package com.kike.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConsultaDatos {

	public Integer consultaEdad(String nombre) {

		File file = new File("C://Users//kikes//Documents//Personas.txt");
		BufferedReader lector;
		try {
			lector = new BufferedReader(new FileReader(file));
			String linea;
			while ((linea = lector.readLine()) != null) {
				if (linea.contains(nombre)) {
					// devolvemos la edad
					return recuperaEdad(linea);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}

	private Integer recuperaEdad(String linea) {
		String[] arrayDePersonas = linea.split("-");
		return Integer.parseInt(arrayDePersonas[1]);

	}

	private String recuperaNombre(String linea) {
		String[] arrayDePersonas = linea.split("-");
		return arrayDePersonas[0];

	}

}
