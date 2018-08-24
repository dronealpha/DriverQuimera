package br.com.quimera.comunicacao;

public class ComunicacaoTCP extends ComunicacaoDevices{
	private String strIP;
	
	public ComunicacaoTCP(String strPort, int intTimeOut, String strIP) {
		super(strPort, intTimeOut);
		// TODO Auto-generated constructor stub
		this.strIP = strIP;
	}
	
	public String getIP() {
		return this.strIP;
	}

}
