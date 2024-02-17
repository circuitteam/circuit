package dev.thatsnasu.circuit;

public class CIRCuit {
	private CIRCuitServer server;

	public CIRCuit() {
		this.server = new CIRCuitServer(6667);
		this.server.setCharset("UTF-8");
		
		this.server.initialize();
	}

	
	public static void main(String... args) {
		new CIRCuit();
	}
}
