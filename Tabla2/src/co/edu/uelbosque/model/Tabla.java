package co.edu.uelbosque.model;

public class Tabla {
	
	private int a;
	
	public Tabla () {
		a=0;
	}
	public int calcular( ) {
		int r=0;
		r=5*a;
		return r;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	

}
