package pt.axians.loan.model;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Loan {

	private String type;
	private int taxes;

	//JAX-B precisa desse construtor
	Loan() {
	}

	private Loan(LoanType type) {
		Objects.requireNonNull(type);
		this.type = type.getType();
		this.taxes = type.getRate();
	}

	public int getTaxes() {
		return taxes;
	}

	public void setTaxes(int taxes) {
		this.taxes = taxes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static Loan of(final LoanType type) {
		return new Loan(type);
	}
}
