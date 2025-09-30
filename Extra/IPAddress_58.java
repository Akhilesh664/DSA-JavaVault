package Extra;

import java.net.InetAddress;

public class IPAddress_58 {

    // 1st Way
//    public static void main(String[] args) throws Exception{
//        System.out.println(InetAddress.getLocalHost());
//    }

    // 2nd Way
    public static void main(String[] args){
        try{
            InetAddress ip=InetAddress.getByName("www.Technolamror.com");
            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());
        }catch(Exception e){System.out.println(e);}
    }
}