package pt.axians.loan;

import pt.axians.loan.client.AuthorizationFault;
import pt.axians.loan.client.LoanType;
import pt.axians.loan.dto.LoanListDTO;
import pt.axians.loan.service.LoanService;

public class LoanStart {

	public static void main(String[] args) throws AuthorizationFault {
		
		LoanService loanService = new LoanService();
		
		LoanListDTO loanListDTO = loanService
				.findLoanByType(LoanType.CONSIGNED);
		
		loanListDTO
			.getLoansDTO()
			.forEach(loan -> System.out.println("Emprestimo: " + loan.getType() + " Taxa: "  + loan.getRate()));
	}
}
