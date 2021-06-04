package pt.axians.loan.model;

import javax.xml.bind.annotation.XmlEnumValue;

public enum LoanType {
	
	@XmlEnumValue("Consigned")
	CONSIGNED(2, "Consigned"),
	@XmlEnumValue("Personal")
	PERSONAL(4, "Personal"),
	@XmlEnumValue("Guarantee")
	GUARANTEE(3, "Guarantee");
	
	private int rate;
	private String type;

	LoanType(int rate, String type) { 
		this.rate = rate;
		this.type = type;
	}
	
	public int getRate() {
		return rate;
	}

	public String getType() {
		return type;
	}

	public static boolean hasLoan(String value) {
		try{
			LoanType.valueOf(value.toUpperCase());
		}catch(IllegalArgumentException e) {
			return false;
		}
		return true;
	}
}
