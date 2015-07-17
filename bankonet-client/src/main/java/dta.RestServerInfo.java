public class dtaRestServerInfo{
	private String protocol;
	private String host;
	private String port;

	public dtaRestServerInfo(){}

	public dtaRestServerInfo(String protocol,String host,String port){
		this.protocol = protocol;
		this.host = host;
	}

	public String getBaseUrl(String protocol,String host,String port){
		return protocol+"://"+host+":"+port;
	}

	public void setProtocol(String protocol){
		this.protocol = protocol;
	}

	public String getProtocol(){
		return protocol;
	}
	public void setHost(String host){
		this.host = host;
	}

	public String getHost(){
		return host;
	}

	public void setPort(String port){
		this.port = port;
	}

	public String getPort(){
		return port;
	}
}