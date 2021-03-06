package dp08.structural_03.proxy;


public class ProxyMainApp {

	// https://www.journaldev.com/1572/proxy-design-pattern
	public static void main(String[] args) {
		
		// we have to use only proxy class to acces the main class.
		CommandInterface proxyObj = new CommandProxyImpl("Gk", "123");
		
		try {
			proxyObj.executeCommand("ls -lrth");
			proxyObj.executeCommand("rm -dir");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
