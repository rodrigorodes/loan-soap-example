package pt.axians.loan.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

// Especificação JAX-B 
//@XmlRootElement
// Configurar o tipo de acesso via atributos
//@XmlAccessorType(XmlAccessType.FIELD)
public class LoanList {

	@XmlElement(name = "emprestimo")
	private List<Loan> loans = new ArrayList<Loan>();

	LoanList() {
	}

	public LoanList(List<Loan> loans) {
		this.loans = loans;
	}
}
