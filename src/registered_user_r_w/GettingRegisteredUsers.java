package registered_user_r_w;

public class GettingRegisteredUsers {
	String email, password;

	public GettingRegisteredUsers(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [Email=" + email + ", Password=" + password + "]";
	}

}
