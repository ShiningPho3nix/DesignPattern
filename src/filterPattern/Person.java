package filterPattern;

public class Person {

	private final String name;
	private final String gender;
	private final String maritalStatus;

	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public Person createPerson(String name, String gender, String maritalStatus) {
		return new Person(name, gender, maritalStatus);
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String toString() {
		return name;
	}
}
