// Classe Servidor - manda um hello para o cliente


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class HelloServer {
    public static void main(String[] args) throws IOException{

        // Cria o Socket definindo a porta que o servidor está escutando
        ServerSocket s = new ServerSocket(4444);
        Socket ns = s.accept();

        DataInputStream in = new DataInputStream(ns.getInputStream());
        DataOutputStream out = new DataOutputStream(ns.getOutputStream());

        System.out.println(in.readUTF());
        out.writeUTF("Olá Cliente!");

        in.close();
        out.close();
        ns.close();
        s.close();

    }
}
