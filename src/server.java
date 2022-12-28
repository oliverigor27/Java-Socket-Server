
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {

    public static void main(String[] args) throws IOException {
    
        try (ServerSocket ouvinte = new ServerSocket(60000)) {
        
        System.out.println("O servidor Java está em execução.");
        
            while (true) {
            
                try (var socket = ouvinte.accept()) {
                
                var saida = new PrintWriter(socket.getOutputStream(), true);
                
                saida.println("Mensagem a ser transmitida.");
                
                }
            
            }       
            
        }
        
    }

}
