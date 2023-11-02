package org.ebooks;

public class UserDetails {
	private String emailID;
	private String password;
	private String userName;
	private String address;
	private String state;
	private int pincode;
	
	public UserDetails(String emailID, String password, String username, 
			String address, String state, int pincode) {
			super();
			this.emailID = emailID;
			this.password = password;
			this.userName = username;
			this.address = address;
			this.state =  state;
			this.pincode = pincode;	
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "UserDetails [emailID=" + emailID + ", password=" + password + ", "
				+ "userName=" + userName + ", address=" + address + ", state=" + state +
				", pincode=" + pincode + "]";
	}
}
