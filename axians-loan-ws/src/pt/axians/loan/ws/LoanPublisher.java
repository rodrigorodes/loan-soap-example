package pt.axians.loan.ws;

import javax.xml.ws.Endpoint;

public class LoanPublisher {

	public static void main(String[] args) {
	
		LoanWS loanWS = new LoanWS();
		
		String address = "http://localhost:8084/loan";
		
		System.out.println("Serviço rodando " + address + "?wsdl");
		
		Endpoint.publish(address, loanWS);
	}
}
