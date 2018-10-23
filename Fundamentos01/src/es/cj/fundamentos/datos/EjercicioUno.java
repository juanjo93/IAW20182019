package es.cj.fundamentos.datos;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;
import javax.swing.SizeSequence;

public class EjercicioUno {

	//Programa que realice la conversion de grados farenheit a celsius
	//los grados celsius debe introducirlos el usuario
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Grados Celsius");
		double grados = sc.nextDouble();
		double farenheit = (grados * 1.8) +32;
		
	}
}
