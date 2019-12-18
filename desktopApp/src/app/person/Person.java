package app.person;

public class Person {
	private String name;
	private String cpf;
	private String dateBirth;
	private String email;

	/**
	 * 
	 * @param name
	 * @param cpf
	 * @param dateBirth
	 * @param email
	 */
	public Person(String name, String cpf, String dateBirth, String email) {
		this.name = name;
		this.cpf = cpf;
		this.dateBirth = dateBirth;
		this.email = email;
	}

	/**
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * 
	 * @return the dateBirth
	 */
	public String getDateBirth() {
		return dateBirth;
	}

	/**
	 * 
	 * @param dateBirth
	 */
	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	/**
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
