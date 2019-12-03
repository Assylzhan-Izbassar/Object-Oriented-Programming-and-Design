package logic;
import java.util.*;
/**
*/
public abstract class Employee extends User {
	
	private double salary;
	private Date hireDate;
	private int room;
	/**
	 * @return 
	*/
	public String toString() {
		return null;
	}
	/**
	 * @param Object o 
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
	 * @param o 
	 * @return 
	*/
	public boolean compareTo(Employee o) {
		return false;
	}
	public double getSalary() {
		return this.salary;
	}
	public Date getDate() {
		return this.hireDate;
	}
	/**
	 * @return 
	*/
	public int getRoom() {
		return this.room;
	}
	/**
		* @param newRoom 
		* @return 
	*/
	public boolean setRoom(int newRoom) {
		this.room = newRoom;
		return true;
	}
}

