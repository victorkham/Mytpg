import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex {

	static String ipAddressRegex="\\b(?:(?:25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d?)\\.){3}(?:25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d?)\\b";
	public static boolean isIpAddress(String address) {
        Pattern pattern = Pattern.compile(ipAddressRegex);
        Matcher matcher = pattern.matcher(address);

        return matcher.matches();
  }
	public static void main(String[] args) throws Exception {
		BufferedReader bufferreader = new BufferedReader(new FileReader("ip_addresses.txt"));
		String line= bufferreader.readLine();;
		
		int i=1;
		
		 
        while (line != null) {
        	boolean valid=false;
        	if(isIpAddress(line)){
        		valid=true;
        	}
        	System.out.println(i+": "+line +" ,is valid IP address: " +valid);
        	line = bufferreader.readLine();
            i++;
        }
	}
}