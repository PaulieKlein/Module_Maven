package dta;

public class BankonetClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestServerInfoHelper helper = new RestServerInfoHelper();
		System.out.println("Protocol : "+helper.getDtaRestServerInfo().getProtocol());
		System.out.println("Host : "+helper.getDtaRestServerInfo().getHost());
		System.out.println("Port : "+helper.getDtaRestServerInfo().getPort());
	}

}
