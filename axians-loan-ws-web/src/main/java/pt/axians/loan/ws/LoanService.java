package pt.axians.loan.ws;

import javax.jws.WebService;

@WebService(endpointInterface =  "pt.axians.loan.ws.LoanWS", serviceName = "v1/loan")
public class LoanService implements LoanWS {

	public EmprestimoRequestResponse emprestimoRequest(
			EmprestimoRequest parameters, 
			Token token) throws AuthorizationFault {
		return null;
	}

}
