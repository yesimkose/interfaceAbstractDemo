package Entities;


public class Customer {
	
	 int id;
	 String firstName;
	 String lastName;
	 int dateOfBirthDay;
	 String nationalyId;
	 
	 public Customer() {
			super();
		}

	public Customer(int id, String firstName, String lastName, int dateOfBirthDay, String nationalyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthDay = dateOfBirthDay;
		this.nationalyId = nationalyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirthDay() {
		return dateOfBirthDay;
	}

	public void setDateOfBirthDay(int dateOfBirthDay) {
		this.dateOfBirthDay = dateOfBirthDay;
	}

	public String getNationalyId() {
		return nationalyId;
	}

	public void setNationalyId(String nationalyId) {
		this.nationalyId = nationalyId;
	}
	 
}
