package pt.axians.loan.dao;

import java.util.LinkedHashMap;
import java.util.Map;

import pt.axians.loan.model.Token;
import pt.axians.loan.model.User;

public class TokenDao {

	private final static Map<Token, User> USERS_MAP = new LinkedHashMap<>();

	public TokenDao() {
		buildUserMap();
	}

	public boolean isValid(Token usuario) {
		return USERS_MAP.containsKey(usuario);
	}

	private void buildUserMap() {
		USERS_MAP.put(new Token("AAA"), new User
				.Builder()
				.addName("Rodrigo")
				.addLogin("rods")
				.addPassword("pass")
				.build());
		
		USERS_MAP.put(new Token("BBB"),
				new User.Builder()
				.addName("flavio")
				.addLogin("flavio")
				.addPassword("pass")
				.build());

	}

}
