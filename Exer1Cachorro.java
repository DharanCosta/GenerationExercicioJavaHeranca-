package Heranca;

public class Exer1Cachorro extends Exer1Animais{
	
	private boolean corre;
	
	// M�TODO
	
	public void correr() {
		this.corre=true;
	}

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
}
