package logic;

import java.util.Vector;

import enums.Select;
/**
*/
public class TechSupportGuy extends Employee {
	/**
	*/
	private Select select;
	/**
	*/
	private Vector<String> doneOrders;
	/**
	*/
	private Vector<String> newOrders;
	/**
	*/
	private Vector<String> acceptedOrders;
	/**
	*/
	//private HashSet<String,Select> orders;
	/**
	 * @return 
	*/
	public Vector<String> viewNewOrders() {
	    return null;
	}
	/**
	 * @return 
	*/
	public Vector<String> getDoneAndAccept() {
	    return null;
	}
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
	 * @return 
	*/
	//public HashSet<String,Select> getOrders() {
	//    return null;
	//}
	public Select getSelect() {
		return select;
	}
	public void setSelect(Select select) {
		this.select = select;
	}
	public Vector<String> getDoneOrders() {
		return doneOrders;
	}
	public void setDoneOrders(Vector<String> doneOrders) {
		this.doneOrders = doneOrders;
	}
	public Vector<String> getNewOrders() {
		return newOrders;
	}
	public void setNewOrders(Vector<String> newOrders) {
		this.newOrders = newOrders;
	}
	public Vector<String> getAcceptedOrders() {
		return acceptedOrders;
	}
	public void setAcceptedOrders(Vector<String> acceptedOrders) {
		this.acceptedOrders = acceptedOrders;
	}
}

