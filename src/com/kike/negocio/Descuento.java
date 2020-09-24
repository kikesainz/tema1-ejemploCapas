package com.kike.negocio;

import com.kike.datos.ConsultaDatos;

public class Descuento {

	public Integer calculaDescuento(String nombre) {

		ConsultaDatos consultaDatos = new ConsultaDatos();

		// Lógica de negocio

		if (consultaDatos.consultaEdad(nombre) < 20) {
			return 5;
		} else {
			return 10;
		}

	}

}
