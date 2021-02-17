package co.edu.uelbosque.view;

import javax.swing.JOptionPane;

public class Vista {
		
	public Vista() {
		
	}

	public void imprimirMensaje(String m) {
		JOptionPane.showMessageDialog(null, m);
	}
	public int capturarDato(String m) {
		int r=0;
		String aux=JOptionPane.showInputDialog(m);
		r=Integer.parseInt(aux);
		return r;
	}
	 public void imprimirMensajeError(String m){
	        JOptionPane.showMessageDialog( null, m ,"Mensaje error", JOptionPane.WARNING_MESSAGE );

	}
}
