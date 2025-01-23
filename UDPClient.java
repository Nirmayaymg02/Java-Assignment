import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            String message = "Hello, UDP Server!";
            byte[] buffer = message.getBytes();

            // Prepare and send packet 
            InetAddress address = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000);

            socket.send(packet);
            System.out.println("Packet sent to server");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}