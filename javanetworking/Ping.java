import java.net.*;
import java.io.*;

public class Ping {

    public static void main(String[] args) throws UnknownHostException, IOException {
        String host = args[0];
        int timeout = 1000;

        InetAddress address = InetAddress.getByName(host);

        for (int i = 0; i < 4; i++) {
            long startTime = System.currentTimeMillis();
            DatagramPacket request = new DatagramPacket(new byte[1], 1, address, 80);
            DatagramSocket socket = new DatagramSocket();
            socket.send(request);

            try {
                DatagramPacket reply = new DatagramPacket(new byte[1024], 1024);
                socket.setSoTimeout(timeout);
                socket.receive(reply);
                long endTime = System.currentTimeMillis();

                double rtt = (endTime - startTime) / 1000.0;
                System.out.println("Reply from " + address.getHostAddress() + ": " + rtt + " ms");
            } catch (SocketTimeoutException e) {
                System.out.println("Request timed out.");
            } finally {
                socket.close();
            }
        }
    }
}
