package co.edu.uelbosque.controller;

import co.edu.uelbosque.model.Tabla;
import co.edu.uelbosque.view.Vista;


public class Controller {
	
	private Tabla t;
	private Vista vista;
	
	public Controller() {
		
		t=new Tabla();
		vista=new Vista();
		reproducir();
		
	}
	public void reproducir() {
		
		vista.imprimirMensaje("Bienvenido");
			int aux=0;
		try {
			aux=vista.capturarDato("Por favor ingrese un numero entero para multiplicar por 5");
			
		}catch(Exception e){
			vista.imprimirMensajeError("oh hay un error, intente de nuevo");
	
			
		}
		
		t.setA(aux);
		vista.imprimirMensaje("el resultado es "+t.calcular());
		
	}
	

}
