package Heranca;

public class Exer1Cavalo extends Exer1Animais{
	
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
