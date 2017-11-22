// Classe cliente - manda um hello para o servidor

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

class HelloClient {
    public static void main(String[] args) throws IOException{

        // Cria o Socket definindo IP e porta que o servidor está escutando
        Socket s = new Socket("127.1.0.0", 4444);

        //Abrindo os canais de leitura e Escrita
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        // Escreve e Ler no canal
        out.writeUTF("Oi Servidor!");
        System.out.println(in.readUTF());

        // Fecha os Canais e o Socket
        in.close();
        out.close();
        s.close();

    }
}
