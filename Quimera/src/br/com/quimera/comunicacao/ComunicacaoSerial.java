package br.com.quimera.comunicacao;

public class ComunicacaoSerial extends ComunicacaoDevices{
	
	//atributo para frequencia da porta serial
	private int intRate;

	public ComunicacaoSerial(String strPort, int intTimeOut,int intRate) {
		super(strPort,intTimeOut);
		// TODO Auto-generated constructor stub
		this.intRate = intRate;
	}
	
	
	public int getRate() {
		return this.intRate;
	}
	

}
