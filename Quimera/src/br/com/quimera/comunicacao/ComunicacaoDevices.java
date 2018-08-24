package br.com.quimera.comunicacao;

public class ComunicacaoDevices {
	
	//atributos para porta e timeout 
	private String strPort;
	private int intTimeOut;
	
	public ComunicacaoDevices(String strPort,int intTimeOut) {
		this.strPort = strPort;
		this.intTimeOut = intTimeOut;
	}
	
	public String getPorta() {
		return this.strPort;
	}
	
	public int getTimeOut() {
		return this.intTimeOut;
	}

}
