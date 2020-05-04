package entities;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Mark implements Serializable{

	private static final long serialVersionUID = 7903734597382397689L;
	private int id;
	private double mark;
	private GregorianCalendar markedDate;
	private String letterMark;
	private static int count = -1;
	
	{
		++count;
	}
	
	public Mark(double mark, GregorianCalendar markedDate) {
		this.id = count;
		this.mark = mark;
		this.markedDate = markedDate;
	}
	
	public int getId() {
		return this.id;
	}
	
	public GregorianCalendar getMarkedDate() {
		return markedDate;
	}
	public void setMarkedDate(GregorianCalendar markedDate) {
		this.markedDate = markedDate;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public int hashCode() {
		return (int) ((this.getMark() * this.getId()) % 7);
	}
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null || !(o instanceof Mark)) return false;
		
		Mark mark = (Mark)o;
		return this.getMark() == mark.getMark() && this.getMarkedDate().equals(mark.getMarkedDate());
	}

	public String getLetterMark() {
		return letterMark;
	}

	public void setLetterMark(String letterMark) {
		this.letterMark = letterMark;
	}
}
