package sis;

import sis.Temperature;

public class Temperature {
	
	private double value;
	private char scale;
	
	public Temperature()
	{
		this(0.0);
	}
	
	public Temperature(double value)
	{
		this('C');
		this.value = value;
	}
	
	private Temperature(char scale)
	{
		if(scale == 'C' || scale == 'F')
			this.scale = scale;
	}
	
	public Temperature(double value, char scale)
	{
		this.value = value;
		if(scale == 'C' || scale == 'F')
			this.scale = scale;
	}
	
	public double getInCelsius()
	{
		double degreeC;
		
		if(scale == 'F')
			degreeC = 5*(value - 32)/9;
		else 
			degreeC = value;
		
		return degreeC;
	}
	
	public double getInFahrenheit()
	{
		double degreeF;
		
		if(scale == 'C')
			degreeF = 9*((value)/5) + 32;
		else
			degreeF = value;
		
		return degreeF;	
	}
	
	public void setValue(double value)
	{
		this.value = value;
	}
	
	public void setScale(char scale)
	{
		if(scale == 'C' || scale == 'F')
			this.scale = scale;
		else
			scale = 'C';
	}
	
	public void setBoth(double value, char scale)
	{
		this.value = value;
		if(scale == 'C' || scale == 'F')
			this.scale = scale;
		else
			scale = 'C';
	}
	
	public char getScale()
	{
		return scale;
	}
	
	public static void main(String[] args) {
		
		Temperature temperature = new Temperature();
		
		System.out.println(temperature.getInCelsius());
		System.out.println(temperature.getInFahrenheit());
		System.out.println(temperature.getInFahrenheit());

	}

}
