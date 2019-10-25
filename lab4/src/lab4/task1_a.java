package lab4;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class task1_a {
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}

	public static void main(String[] args){
		
		StringTokenizer st;
		
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		
		String name = "";
		String newLine = "";
		String line = null;
		
		int maxi = 0;
		
		try {
			BufferedReader in = new 
					BufferedReader(new FileReader("/Users/macbook/Desktop/Object-Oriented Programming and Design/scores.txt"));
			PrintWriter pwFile = new 
					PrintWriter("/Users/macbook/Desktop/Object-Oriented Programming and Design/grades.txt");
			
			while((line = in.readLine()) != null){
				st =  new StringTokenizer(line, " ");
				//We get tokens of the String  line
				while(st.hasMoreTokens()){
					String temp = st.nextToken();
					if(isInteger(temp)){
						int i = Integer.parseInt(temp);
						//Find a maximum value
						if(maxi < i)
							maxi = i;
						//Add the name and value to HashMap
						hm.put(name.trim(), i);
						name = "";
					}
					else {
						name += temp + " ";
					}
				}
			}			
			for(String s: hm.keySet())
			{
				//System.out.println(s + " " + hm.get(s));
				if(hm.get(s) >= maxi - 10) {
					newLine = s + " - " + "'A'";
					pwFile.println(newLine);
				}
				else if(hm.get(s) >= maxi - 20) {
					newLine = s + " - " + "'B'";
					pwFile.println(newLine);
				}
				else if(hm.get(s) >= maxi - 30) {
					newLine = s + " - " + "'C'";
					pwFile.println(newLine);
				}
				else if(hm.get(s) >= maxi - 40) {
					newLine = s + " - " + "'D'";
					pwFile.println(newLine);
				}
				else {
					newLine = s + " - " + "'F'";
					pwFile.println(newLine);
				}
				
			}
			in.close();
			pwFile.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
