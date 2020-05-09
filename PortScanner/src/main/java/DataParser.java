import java.util.ArrayList;

public class DataParser {
    private final String Host;
    private final String Port;

    public static ArrayList<String> all_Hosts = new ArrayList<>();
    public static ArrayList<Integer> all_Ports = new ArrayList<>();

    DataParser(String Host,String Port){
        this.Host = Host;
        this.Port = Port;
    }

    public  void Host_Parser(){
        String[] preHost = Host.split(",");
        for (int i = 0;i<preHost.length;i++) {
            preHost[i]=preHost[i].trim();
        }
        for (String value : preHost) {
            if (!value.contains("-")) {
                all_Hosts.add(value);
            }else{
                host_range_parser(value);
            }
        }
    }
    public  void host_range_parser(String str){
        String[] host = str.split("\\.");
        String[] last_host_element = host[host.length-1].split("-");
        for (int j = Integer.parseInt(last_host_element[0]);j<=Integer.parseInt(last_host_element[1]);j++){
            String ready = host[0]+"."+host[1]+"."+host[2]+"."+j;
            all_Hosts.add(ready);
        }
    }
    public  void Port_Parser(){
        String[] prePort = Port.split(",");
        for (int i = 0;i<prePort.length;i++) {
            prePort[i]=prePort[i].trim();
        }
        for (String value : prePort) {
            if (!value.contains("-")) {
                all_Ports.add(Integer.parseInt(value));
            }else{
                port_range_parser(value);
            }
        }
    }
    public  void port_range_parser(String str){
        String[] port_element = str.split("-");
        for (int j = Integer.parseInt(port_element[0]);j<=Integer.parseInt(port_element[1]);j++){
            all_Ports.add(j);
        }
    }
    public static String hostCutter(String s){
        return s.substring(8,(s.indexOf("p")-2));
    }
    public static String portCutter(String s){
        int lastIndex=s.length() ;
        if (s.contains("t")){
            lastIndex= s.indexOf("t")-2;
        }
        return s.substring(s.indexOf("p")+2,lastIndex);
    }
    public static int threadsCutter(String s){
        return Integer.parseInt(s.substring(s.indexOf("t")+2));
    }
}