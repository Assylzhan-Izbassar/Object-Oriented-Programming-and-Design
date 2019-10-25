package lab4;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;

public class Driver implements Serializable{
	
	File file1 = new File("/Users/macbook/Desktop/Object-Oriented Programming and Design/forTask2/admin.text");
	File file2 = new File("/Users/macbook/Desktop/Object-Oriented Programming and Design/forTask2/textbooks.txt");
	File file3 = new File("/Users/macbook/Desktop/Object-Oriented Programming and Design/forTask2/instructors.txt");
	File file4 = new File("/Users/macbook/Desktop/Object-Oriented Programming and Design/forTask2/courses.txt");
	
	private String mode;
	public boolean isOnline;
	BufferedReader in;
	PrintWriter pwFile;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	Date publishDate = new Date();

	Vector<Course> courses;
	Vector<TextBook> textbooks;
	Vector<Instructor> instructors;

	
	public Driver()//ok
	{
		isOnline = true;
		courses = new Vector<Course>();
		textbooks = new Vector<TextBook>();
		instructors = new Vector<Instructor>();
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public void Run() //ok
	{
		System.out.println("Please, choose a mode: (choose 1 to adminMode, 2 to userMode, 3 to quit)");
		try {
			mode = in.readLine();
			
			if(mode.equals("1"))
			{
				System.out.println("Please, enter your username: ");
				String username = in.readLine();
				
				System.out.println("Please, enter your password: ");
				String password = in.readLine();
				
				if(checkAdmin(username,password))
				{	
					System.out.println("You drop in like admin.");
					
					pwFile = new PrintWriter(new FileOutputStream(file1, true));//We write information about administration in admin.text
					pwFile.append("\n" + publishDate.toString() + " admin logged in to a system");
					pwFile.close();
					
					inAdminMode();
				}
				else {
					System.err.println("Sorry, your login or password is wrong, please try again.");
					Run();
				}
			}
			else if(mode.equals("2"))
			{
				inUserMode();
			}
			else if(mode.equals("3"))
				isOnline = false;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	private boolean checkAdmin(String username, String password)//ok
	{
		StringTokenizer st;
		String line = null, next = null;
		boolean userLog = false, userPassword = false,isFinish = false;

		try {
			BufferedReader br = new BufferedReader(new FileReader(file1));
			
			while((line = br.readLine()) != null)
			{
				st = new StringTokenizer(line, " ");
				while(st.hasMoreTokens())
				{
					next = st.nextToken();
					if(next.equals(username))
					{
						userLog = true;
					}
					else if(next.equals(password))
					{
						userPassword = true;
						isFinish = true;
						break;
					}
				}
				if(isFinish == true)
					break;
			}
			br.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		if(userLog && userPassword)
			return true;
		return false;
	}
	
	private void inUserMode()//ok
	{
		System.out.println("\nPlease, choose one of the methods:(insert the number)");
		System.out.println("- View the list of available courses(1)");
		System.out.println("- Display information about the course(2)");
		System.out.println("- Go Back(3)");
		System.out.println("- Quit(4)");
		System.out.println("- Print Vector(5)");
		String index;
		
		try 
		{
			index = in.readLine();
			
			if(index.equals("1"))
			{
				viewCourses();
				inUserMode();
			}
			else if(index.equals("2"))
			{
				infoOfCourse();
				inUserMode();
			}
			else if(index.equals("3"))
			{
				Run();
			}
			else if(index.equals("4"))
			{
				isOnline = false;
			}
			else if(index.equals("5"))
			{
				printCourses();
			}
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	private void viewCourses()//mayBeOK
	{
		try 
		{
			//FileInputStream fis = new FileInputStream(file4);
			//ois = new ObjectInputStream( new BufferedInputStream(new FileInputStream(file4)));
			
			ois = new ObjectInputStream(new FileInputStream(file4));
			
			courses = (Vector<Course>)ois.readObject();
			
			ois.close();
			//fis.close();
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		
		System.out.println("Result:");
		
		for(Course c : courses)
		{
			System.out.println(c.getCourceTitle());
		}
	}
	
	public void infoOfCourse()//mayBeOK
	{
		try {

			ois = new ObjectInputStream(new FileInputStream(file4));
			
			courses = (Vector<Course>)ois.readObject();
			
			ois.close();
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		System.out.println("Result:");
		
//		for(Course c : courses)
//		{
//			System.out.println(c.getInstructor() + " " + c.getTextBook());
//		}
		System.out.println(courses);
	}
	
	private void inAdminMode()//ok
	{
		System.out.println("Please, input the number:\n");
		System.out.println("- Add textBook (1)");
		System.out.println("- Add instructor (2)");
		System.out.println("- Add course (3)");
		System.out.println("- View courses (4)");
		System.out.println("- View information about courses (5)");
		System.out.println("- Go Back(6)");
		System.out.println("- Quit (7)");
		
		String message;
		
		try {
			message = in.readLine();
			
			if(message.equals("1"))
			{
				addTextBook();
				inAdminMode();
			}
			else if(message.equals("2"))
			{
				addInstructor();
				inAdminMode();
			}
			else if(message.equals("3"))
			{
				addCourse();
				inAdminMode();
			}
			else if(message.equals("4"))
			{
				viewCourses();
				inAdminMode();
			}
			else if(message.equals("5"))
			{
				infoOfCourse();
				inAdminMode();
			}
			else if(message.equals("6")) 
			{
				Run();
			}
			else if(message.equals("7"))
				isOnline = false;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	private void addTextBook()//ok?
	{	
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(file2,true));
			
			TextBook tb = creatTextBook();
			textbooks.add(tb);
			
			pwFile = new PrintWriter(new FileOutputStream(file1, true));//upd admin.text
			pwFile.append("\n" + publishDate.toString() + " admin added new textbook " + tb.getTitle());
			pwFile.close();
			
			oos.writeObject(textbooks);
			oos.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	private void addInstructor()//ok?
	{
		try 
		{
			oos = new ObjectOutputStream(new FileOutputStream(file3,true));
			
			Instructor ins = creatInstructor();
			instructors.add(ins);
			
			pwFile = new PrintWriter(new FileOutputStream(file1, true));
			pwFile.append("\n" + publishDate.toString() + " admin added new instructor " + ins.getFirstName() + " " + ins.getLastName());
			pwFile.close();
			
			oos.writeObject(instructors);
			oos.close();
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	private void addCourse()//ok?
	{
		Course c = null;
		String courseTitle = null, temp = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(file4,true));
			
			System.out.println("If you want input the all fields, please, take in 1 or take in 2");
			
			temp = in.readLine();
			
			if(temp.equals("1"))
			{
				TextBook tb = creatTextBook();
				Instructor ins = creatInstructor();
				
				System.out.println("courseTitle: ");courseTitle = in.readLine();
				
				c = new Course(courseTitle, tb, ins);
				courses.add(c);
				
				oos.writeObject(courses);
				oos.close();
			}
			else if(temp.equals("2"))
			{
				System.out.println("courseTitle: ");courseTitle = in.readLine();
				
				c = new Course(courseTitle);

				courses.add(c);
				
				oos.writeObject(courses);
				oos.close();
			}
			
			pwFile = new PrintWriter(new FileOutputStream(file1, true));
			pwFile.append("\n" + publishDate.toString() + " admin added new course " + c.getCourceTitle());
			pwFile.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	private TextBook creatTextBook()//ok
	{
		TextBook tb = null;
		String isbn = null, title = null, authors = null;
		
		System.out.println("Please, pull the fields:");

		try 
		{
			System.out.println("isbn: ");isbn = in.readLine();
			System.out.println("title: ");title = in.readLine();
			System.out.println("author(s): "); authors = in.readLine();
			tb = new TextBook(isbn,title, authors);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return tb;
	}
	
	private Instructor creatInstructor()//ok
	{
		Instructor ins = null;
		String firstName = null,lastName = null,department = null,email = null;
		
		System.out.println("Please, pull the fields:");
		
		try 
		{
			System.out.print("firstName: ");firstName = in.readLine();
			System.out.print("lastName: ");lastName = in.readLine();
			System.out.print("department: "); department = in.readLine();
			System.out.print("email: "); email = in.readLine();
			
			ins = new Instructor(firstName,lastName, department, email);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return ins;
	}
	
	public void printCourses()
	{
		for(Course c : courses)
		{
			System.out.println(c.getCourceTitle());
		}
	}
	
	public static void main(String[] args) {
		
		Driver dr = new Driver();
		
		while(true)
		{
			if(dr.isOnline == false)
				break;
			dr.Run();
		}
		
		System.out.println("Thank you for using our program!");
	}
}
