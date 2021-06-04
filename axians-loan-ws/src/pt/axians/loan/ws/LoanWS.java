package pt.axians.loan.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import pt.axians.loan.dao.LoanDao;
import pt.axians.loan.dao.TokenDao;
import pt.axians.loan.exception.AuthorizationException;
import pt.axians.loan.model.FilterList;
import pt.axians.loan.model.Loan;
import pt.axians.loan.model.LoanList;
import pt.axians.loan.model.Token;

@WebService
public class LoanWS {

	private LoanDao loanDao = new LoanDao();
	private TokenDao tokenDao = new TokenDao();

	@WebMethod(operationName = "loanRequest")
	@WebResult(name = "loans")
	public LoanList findFilterRequest(
			@WebParam(name = "token", header = true) Token token,
			@WebParam(name = "filters")  FilterList filterList) 
					throws AuthorizationException {
		
		if(!tokenDao.isValid(token)) {
			throw new AuthorizationException("Token Invalido");
		}
		
		List<Loan> loans = loanDao.findAllByFilter(filterList.getLista());

		return new LoanList(loans);
	}
}
