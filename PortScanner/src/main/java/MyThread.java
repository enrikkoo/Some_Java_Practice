import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;


public class MyThread implements Runnable {

    public static JSONObject object = new JSONObject();
    private static final  Object lock = new Object();
    private static final  Object lock2 = new Object();
    private static final String FILENAME = "src\\main\\resources\\JSON_Output";
    String host ;
    MyThread(String s){
        host = s;
    }
    public void run(){
        for(Integer port : DataParser.all_Ports) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(host, port), 30);
                socket.close();
                System.out.println("Host is " + host + " and port " + port + " is open");
                synchronized (lock2) {
                    object.put(host + ":" + port, "open");
               }
            } catch (Exception ex) {
                System.out.println("Host is " + host + " and port " + port + " is closed");
                synchronized (lock2) {
                    object.put(host + ":" + port, "closed");
               }
            }
        }
        writeToJSON(object);
    }
    public static void writeToJSON(JSONObject obj) {
        synchronized (lock) {
            try (FileWriter writer = new FileWriter(FILENAME)) {
                writer.write(obj.toJSONString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}