package br.com.targettrust.abstrata;

public class Radio extends Aparelho {
	public static final short AM = 1;
	public static final short FM = 2;
	private int banda;
	private float sintonia;
	private int volume;

	public Radio(int voltagem, int preco, String modelo) {
		super(false, voltagem,preco, modelo);
		setBanda(Radio.FM);
		setSintonia(0);
		setVolume(0);
	}

	/* implementação dos métodos abstratos */
	public void desligar() {
		super.setLigado(false);
		setSintonia(0);
		setVolume(0);
	}

	public void ligar() {
		super.setLigado(true);
		setSintonia(88.1f);
		setVolume(25);
	}

	
	private void setVolume(int i) {
		// TODO Auto-generated method stub

	}

	private void setSintonia(int i) {
		// TODO Auto-generated method stub

	}

	private void setSintonia(float f) {
		this.sintonia = f;
		
	}

	private void setBanda(short fm2) {
		this.banda=fm2;	
	}

	/**
	 * @return the banda
	 */
	public int getBanda() {
		return banda;
	}

	/**
	 * @return the sintonia
	 */
	public float getSintonia() {
		return sintonia;
	}

	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}

}
