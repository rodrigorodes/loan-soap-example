package pt.axians.loan.model;

//@XmlRootElement
public class Filter {

	private LoanType loanType;

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

}
