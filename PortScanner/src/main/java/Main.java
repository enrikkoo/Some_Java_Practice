import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

    public static void main(String[] args) throws IOException{

        System.out.println("Сканнер портов готов!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("scan -h 91.77.167.200-240 -p 1-30 -t 12");
        String scan = reader.readLine();
        String Host = DataParser.hostCutter(scan);
        String Port = DataParser.portCutter(scan);
        int threads_count = DataParser.threadsCutter(scan);
        reader.close();

        DataParser dp = new DataParser(Host, Port);
        dp.Host_Parser();
        dp.Port_Parser();
        Collections.shuffle(DataParser.all_Hosts);
        Collections.shuffle(DataParser.all_Ports);
        System.out.println(DataParser.all_Hosts);
        System.out.println(DataParser.all_Ports);

        ExecutorService es = Executors.newFixedThreadPool(threads_count);
        for (int i = 0; i < DataParser.all_Hosts.size(); i++) {
            es.submit(new MyThread(DataParser.all_Hosts.get(i)));
        }
        es.shutdown();
    }
}