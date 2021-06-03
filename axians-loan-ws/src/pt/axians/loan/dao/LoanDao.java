package pt.axians.loan.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import pt.axians.loan.model.Filter;
import pt.axians.loan.model.Loan;
import pt.axians.loan.model.LoanType;

public class LoanDao {

	private final static Map<String, Loan> LOAN_ITEMS = new LinkedHashMap<>();

	public LoanDao() {
		buildItemstoMap();
	}

	public List<Loan> findAll() {
		return new ArrayList<>(LOAN_ITEMS.values());
	}

	public List<Loan> findAllByFilter(List<Filter> filtros) {

		if (filtros == null || filtros.isEmpty()) {
			return findAll();
		}

		return LOAN_ITEMS.values()
				.stream()
				.filter(filter -> filterByLoanType(filtros, filter))
				.collect(Collectors.toList());
	}

	private boolean filterByLoanType(List<Filter> filtros, Loan filter) {
		return filtros
				.stream()
				.anyMatch(isEqualsLoanType(filter));
	}

	private Predicate<? super Filter> isEqualsLoanType(Loan filter) {
		return loan -> loan.getLoanType().getType().equals(filter.getType());
	}

	private void buildItemstoMap() {
		LOAN_ITEMS.put(LoanType.CONSIGNED.getType(), Loan.of(LoanType.CONSIGNED));
		LOAN_ITEMS.put(LoanType.GUARANTEE.getType(), Loan.of(LoanType.GUARANTEE));
		LOAN_ITEMS.put(LoanType.PERSONAL.getType(), Loan.of(LoanType.PERSONAL));
	}

}
