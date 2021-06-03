package pt.axians.loan.dto;

public class LoanDTO {

	private String type;
	private int rate;

	public LoanDTO(String type, int rate) {
		this.type = type;
		this.rate = rate;
	}

	public String getType() {
		return type;
	}

	public int getRate() {
		return rate;
	}

}
