package lab2;

public class Time implements Comparable<Time>{
	
	private int hour; 
	private int minute; 
	private int second; 
	
	public Time(int hour, int minute, int second)
	{
		Filter(hour,minute,second);
	}
	
	public void setTime(int hour, int minute, int second)
	{
		Filter(hour, minute, second);
	}
	
	public void Filter(int hour, int minute, int second)
	{
		if(hour >= 0 && hour <= 23)
			this.hour = hour;
		else
			this.hour = -1;
		if(minute >= 0 && minute <= 59)
			this.minute = minute;
		else 
			this.minute = -1;
		if(second >= 0 && second <= 59)
			this.second = second;
		else 
			this.second = -1;
	}
	
	public String toUniversal()
	{
		String universeTime = "";
		if(hour == -1 || minute == -1 || second == -1)
		{
			universeTime = "Your input is not correct! Please, change it!";
		}
		else
		{
			if(hour >= 0 && hour < 10)
				universeTime += '0'+Integer.toString(hour)+':';
			else universeTime += Integer.toString(hour)+':';
			
			if(minute >= 0 && minute < 10)
				universeTime += '0'+Integer.toString(minute)+':';
			else universeTime += Integer.toString(minute)+':';
			
			if(second >= 0 && second < 10)
				universeTime += '0'+Integer.toString(second);
			else universeTime += Integer.toString(second);
		}
		return universeTime;
	}
	
	public String toStandart()
	{
		String standart = "";
		
		if(hour == -1 || minute == -1 || second == -1)
		{
			standart = "Your input is not correct! Please, change it!";
		}
		else 
		{
			boolean day = true;
			
			if(hour > 0 && hour < 12)
			{
				if(hour > 0 && hour < 10)
					standart += '0'+Integer.toString(hour)+':';
				else
					standart += Integer.toString(hour)+':';
			}
			else if(hour == 0)
			{
				standart += "12:";
			}
			else if(hour == 12)
			{
				standart += "12:";
				day = false;
			}
			else
			{
				standart += Integer.toString(hour%12)+':';
				day = false;
			}
			
			if(minute >= 0 && minute < 10)
				standart += '0'+Integer.toString(minute)+':';
			else standart += Integer.toString(minute)+':';
			
			if(second >= 0 && second < 10)
				standart += '0'+Integer.toString(second);
			else standart += Integer.toString(second);
			
			if(day)
				standart += " AM";
			else
				standart += " PM";
		}
		return standart;
	}
	
	public void add(Time temp)
	{
		if(hour != -1 && minute != -1 && second != -1)
		{
			if(temp.hour != -1 && temp.minute != -1 && temp.second != -1)
			{
				int tHour = hour + temp.hour;
				int tMinute = minute + temp.minute;
				int tSecond = second + temp.second;			
				int totalSecond = (tHour*60 + tMinute)*60 + tSecond;
				
				hour = totalSecond/3600;
				if(hour > 23)
					hour = hour%24;
				minute = (totalSecond/60)%60;
				second = totalSecond%60;
			}
			else
			{
				System.out.println("Your input for sum is not correct! Please, change it!");
			}
		}
	}
	
	@Override
	public int compareTo(Time o) {
		
		if(this.hour > o.hour) return 1;
		else if(this.hour < o.hour) return -1;
		
		if(this.minute > o.minute)return 1;
		else if(this.minute < o.minute) return -1;
		
		if(this.second > o.second)return 1;
		else if(this.second < o.second) return -1;
		
		return 0;
	}
}