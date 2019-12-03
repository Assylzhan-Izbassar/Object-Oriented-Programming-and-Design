package logic;

import interfaces.Comparable;

/**
 */
public abstract class User implements Comparable {

    private String name,surname;
    private int id;
    private String login, password, phoneNumber, address;
    /**
     * @param o 
     * @return 
     */
    public boolean equals(Object o) {
        return false;
    }

    /**
     * @return 
     */
    public int hashCode() {
        return 0;
    }

    /**
     * @return 
     */
    public String toString() {
        return null;
    }

    /**
     * @param o 
     * @return 
     */
    public boolean compareTo(Object o) {
        return false;
    }

    /**
     * @return 
     */
    public boolean setPassword() {
        return false;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

