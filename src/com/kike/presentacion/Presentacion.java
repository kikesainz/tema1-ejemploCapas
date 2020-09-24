package com.kike.presentacion;

import java.util.Scanner;

import com.kike.negocio.Descuento;

public class Presentacion {

	public static void main(String[] args) {
		
		//Preguntamos al usuario el nombre
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre de la persona a la que aplicar un descuento"+ '\n');
		String nombre = sc.next();
		System.out.println(new Descuento().calculaDescuento(nombre));
		

	}

}
