package redes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class EjercicioClase1 {
    public static void main(String[] args) throws IOException {
        int puerto = 2025;
        ServerSocket servidor = new ServerSocket(puerto);
        System.out.println("Escuchado en el puerto: " + servidor.getLocalPort());
        Socket cliente = servidor.accept();
        Socket cliente2 = servidor.accept();
        servidor.close();
        
        
		String host ="localhost";
	int puerto2= 2025;
	try {
		Socket cliente3 =new Socket(host,puerto);
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("hola");

    }
}
