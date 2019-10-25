package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class task1_b {
	
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

	public static void main(String[] args) {
		StringTokenizer st;
		
		String line = null;
		
		double sum = 0;
		int count = 0;
		int maxi = 0;
		double avg = 0;
		int mini = 101;
		
		File file = new File("/Users/macbook/Desktop/Object-Oriented Programming and Design/grades.txt");
		
		try {
			BufferedReader in = new 
					BufferedReader(new FileReader("/Users/macbook/Desktop/Object-Oriented Programming and Design/scores.txt"));
			PrintWriter pwFile = new 
					PrintWriter(new FileOutputStream(file, true));
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
						if(mini > i)
							mini = i;
						
						sum += i;
						count++;
						avg = sum/count;
					}
				}
			}
			
			String average = "Average - " + String.valueOf(avg);
			String maximum = "Maximum - " + String.valueOf(maxi);
			String minimum = "Minimum - " + String.valueOf(mini);
			
			pwFile.append("\n");
			pwFile.append(average + "\n");
			pwFile.append(maximum + "\n");
			pwFile.append(minimum + "\n");
			
			in.close();
			pwFile.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
