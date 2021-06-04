package pt.axians.loan.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Filter {

	private LoanType loanType;

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

}
