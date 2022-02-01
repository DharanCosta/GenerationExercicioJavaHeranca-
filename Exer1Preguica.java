package Heranca;

public class Exer1Preguica extends Exer1Animais {
	
	private boolean corre;
	private boolean subirArvore;
	
	// MÉTODO
	
	public void correr() {
		this.corre=false;
	}
	public void subir() {
		this.subirArvore=true;
	}
	public boolean isCorre() {
		return corre;
	}
	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	public boolean isSubirArvore() {
		return subirArvore;
	}
	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
	
}
