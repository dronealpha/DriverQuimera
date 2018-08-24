package br.com.quimera.sockettcp;

import java.io.IOException;
import java.net.SocketException;

public interface ConexaoTCPAcoes {
	
	void ConectarDispositivo() throws SocketException, Exception, Throwable;
	void DesconectarDispositivo() throws IOException, Exception, Throwable;
	void DisparoComando();
	String RespostaComando() throws SocketException, Exception, Throwable;
	
}
