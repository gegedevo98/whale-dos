import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TheTheif {
  Public static void main(String[] args) throws Exeption {
    String ServerIP = "SERVER-IP-HERE";
    int Port = "SERVER-PORT-HERE";
    try (Socket socket = new Socket(ServerIP, Port);
         PrintWriter out = new PrintWritrer {
            new PrintWriter = new PrintWriter(
              new OutputStreamWriter = Socket.getOutputStream(), true) {
                System.out.println(number);
              }
            )
         }
              
         }
  }
}
