package br.com.quimera.sockettcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import br.com.quimera.comunicacao.ComunicacaoTCP;

public class ControlaDevice implements ConexaoTCPAcoes{
	
	private Socket tcpSocket;
	private PrintStream out;
	private BufferedReader in;
	private String strComando;
	private ComunicacaoTCP tcpCom;
	private int intTimeOut;
	
	//m�todo para inicializar o objeto do tipo socket
	public void setSocket(Socket tcpSocket) {
		this.tcpSocket = tcpSocket;
	}
	
	//retorna um objeto do tipo socket
	public Socket getSocket() {
		return this.tcpSocket;
	}
	
	
	public void setTime(int intTimeOut) {
		this.intTimeOut = intTimeOut;
	}
	
	public int getTime() {
		return this.intTimeOut;
	}
	
	//m�todo para disparo do comando
	public void setComando(String comando) {
		this.strComando = comando;
	}

	public String getComando() {
		return this.strComando;
	}

	//metodo para disparo de comandos
	@Override
	public void DisparoComando() {
		// TODO Auto-generated method stub
		out.println(getComando());

	}
	
	//m�todo para conex�o com dispositivo ou servidor
	@Override
	public void ConectarDispositivo() throws SocketException, Exception, Throwable {
		// TODO Auto-generated method stub
		//configurando timeout da coenx�o
		getSocket().setSoTimeout(getTime());
		out = new PrintStream(getSocket().getOutputStream());
		in = new BufferedReader(new InputStreamReader(getSocket().getInputStream()));
		
		
	}
		
	
	//m�todo para desconectar do servidor
	@Override
	public void DesconectarDispositivo() throws IOException, Exception, Throwable {
		// TODO Auto-generated method stub
		getSocket().close();
		
	}
	
	//m�todo para pegar resposta
	@Override
	public String RespostaComando() throws SocketException, Exception, Throwable {
		// TODO Auto-generated method stub
		getSocket().setSoTimeout(getTime());
		String comando = null;
		comando = in.readLine();
		while (comando == null)
		{
			comando = in.readLine();
		}
		return comando;
		
	}
	
	
	

}
