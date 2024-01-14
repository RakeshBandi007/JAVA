import java.net.URL;
import java.net.MalformedURLException;

public class url1
{
    public static void main(String args[]) throws MalformedURLException
    {
        URL url=new URL("http://www.javatpoint.com/");
        System.out.println("Authority:"+ url.getAuthority());
        System.out.println("Default Port:"+ url.getDefaultPort());
        System.out.println("File:"+ url.getFile());
        System.out.println("Path:"+ url.getPath());
        System.out.println("Protocol:"+ url.getProtocol());
        System.out.println("Reference:"+ url.getRef());
    }
}