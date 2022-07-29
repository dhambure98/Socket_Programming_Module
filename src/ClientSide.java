import java.io.IOException;
import java.net.Socket;

/**
 * @author : A.D.Liyanage
 * @since : 0.1.0
 **/

public class ClientSide {
    public static void main(String[] args) throws IOException {
        final int PORT = 8000;
        Socket socket = new Socket("localhost", PORT);
        //localhost, 172.0.0.1 [ivp4]
    }
}
