package pt.axians.loan.dto;

import java.util.ArrayList;
import java.util.List;

import pt.axians.loan.client.Loan;

public class LoanListDTO {
	
	private List<LoanDTO> loansDTO = new ArrayList<LoanDTO>();

	public LoanListDTO(final List<Loan> loans) {
		loans.forEach(loan -> loansDTO.add(new LoanDTO(loan.getType(), loan.getTaxes())));
	}

	public List<LoanDTO> getLoansDTO() {
		return loansDTO;
	}
}
