package pt.axians.loan.model;

public class User {

	private String name;
	private String login;
	private String password;
	
	User(String name, String login, String password) {
		this.name = name;
		this.login = login;
		this.password = password;
	}

	public String getNome() {
		return name;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return password;
	}
	
	public static class Builder {
		
		private String name;
		private String login;
		private String password;
		
		
		public Builder addName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder addLogin(String login) {
			this.login = login;
			return this;
		}
		
		public Builder addPassword(String password) {
			this.password = password;
			return this;
		}
		
		public User build() {
			return new User(name,login,password);
		}
	}
	
	
	
}
