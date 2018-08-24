package br.com.quimera.sockettcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import br.com.quimera.comunicacao.ComunicacaoTCP;

public class ConnectDeviceTCP {
	
	private String strDevice;
	private String strPorta;
	private int intTempo;
	
	public void setDevice(String strDevice, String strPorta, int intTempo) {
		this.strDevice = strDevice;
		this.strPorta =  strPorta;
		this.intTempo = intTempo;
		
	}
	
	public String getDevice() {
		return this.strDevice;
	}
	
	public String getPort() {
		return this.strPorta;
	}

	public int getTime() {
		return this.intTempo;
	}
	
	//retorna dados para comunicação
	public ComunicacaoTCP getInfoNetWork() {
		ComunicacaoTCP conn= new ComunicacaoTCP(getPort(),getTime(),getDevice());
		return conn;
	}
	
	//método retorna socket para rede
	public Socket getSocket() throws UnknownHostException, IOException {
		Socket comm = new Socket(getInfoNetWork().getIP(),Integer.parseInt(getInfoNetWork().getPorta()));
		return comm;
	}
	
	
}
