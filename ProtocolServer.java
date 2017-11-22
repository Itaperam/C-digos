// Servidor atende um cliente e morre
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

import java.net.Socket;

public class ProtocolServer {
   public static void main(String[] args) throws IOException{

       ServerSocket s = new ServerSocket(5555);
      // Socket ns = s.accept();

      // DataInputStream in = new DataInputStream(ns.getInputStream());
       //DataOutputStream out = new DataOutputStream(ns.getOutputStream());
       //String fromClient;

       while (true) {
           Socket ns = s.accept();
           DataInputStream in = new DataInputStream(ns.getInputStream());
           DataOutputStream out = new DataOutputStream(ns.getOutputStream());
           //String fromClient;
        //fromClient = in.readUTF();
          out.writeUTF(in.readUTF());

          //System.out.println("From Client: " + fromClient);

         // if (fromClient.equals("bye")) {
             // break;
         // }
         in.close();
         out.close();
         ns.close();
      }

    //  s.close();
    }
}
