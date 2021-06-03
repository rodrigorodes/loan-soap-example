package pt.axians.loan.service;

import java.util.List;
import java.util.stream.Stream;

import pt.axians.loan.client.AuthorizationFault;
import pt.axians.loan.client.EmprestimoRequest;
import pt.axians.loan.client.Filter;
import pt.axians.loan.client.FilterList;
import pt.axians.loan.client.Loan;
import pt.axians.loan.client.LoanType;
import pt.axians.loan.client.LoanWS;
import pt.axians.loan.client.LoanWSService;
import pt.axians.loan.client.Token;
import pt.axians.loan.dto.LoanListDTO;

public class LoanService {

	public LoanListDTO findLoanByType(LoanType... type) throws AuthorizationFault {

		LoanWS loanWSPort = new LoanWSService()
				.getLoanWSPort();

		Token token = new Token();
		token.setToken("AAA");

		EmprestimoRequest filterRequest = new EmprestimoRequest();

		FilterList filterLister = new FilterList();
		
		Stream.of(type)
		     .forEach(loanType -> {
	    		final Filter filterOne = new Filter();
				filterOne.setLoanType(loanType);
				filterLister.getFilter().add(filterOne);
		     });

		filterRequest.setFiltros(filterLister);

		List<Loan> loans = loanWSPort.emprestimoRequest(filterRequest, token)
				.getEmprestimos()
				.getEmprestimo();
		
		return new LoanListDTO(loans);

	}
}
