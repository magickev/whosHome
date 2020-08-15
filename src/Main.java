import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        GUI g = new GUI();
        //keeps updating as fast as 10.0.0.1 will send its data
        while(true){

            //Instantiating the URL class
            URL url = new URL("http://10.0.0.1/");
            //Retrieving the contents of the specified page
            Scanner sc = new Scanner(url.openStream());
            //Instantiating the StringBuffer class to hold the result
            StringBuffer sb = new StringBuffer();
            while(sc.hasNext()) {
                sb.append(sc.next());
            }
            //Retrieving the String from the String Buffer object
            String result = sb.toString();
            System.out.println(result);

            g.updateLabels(result);
        }
    }
}
