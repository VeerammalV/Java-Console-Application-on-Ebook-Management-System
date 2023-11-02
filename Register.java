package org.ebooks;

public class Register {
	private String FirstName;
	private String LastName;
	private String UserName;
	private String Password;
	private String EmailID;
	private Long PhoneNumber;
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getUserName() {
		return UserName;
	}
	public String getPassword() {
		return Password;
	}
	public String getEmailID() {
		return EmailID;
	}
	public Long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Register [FirstName=" + FirstName + ", LastName=" + LastName + ", UserName=" + UserName + ", Password="
				+ Password + ", EmailID=" + EmailID + ", PhoneNumber=" + PhoneNumber + "]";
	}
	
	

}
