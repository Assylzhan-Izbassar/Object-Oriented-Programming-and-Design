package lab4;

import java.io.Serializable;

public class TextBook implements Serializable {
	
	private String isbn = null, title = null, authors = null;
	
	public TextBook(String isbn, String title, String authors)
	{
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	public void setIsbn(String newIsbn)
	{
		isbn = newIsbn;
	}
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	
	public String getAuthors()
	{
		return authors;
	}
	public void setAuthors(String newAuthors)
	{
		authors = newAuthors;
	}
	
	public String toString()
	{
		return title + " " + authors + " " + isbn;
	}
	
	public boolean equals(Object o)
	{
		if(o == this)return true;
		if(o == null || !(o instanceof TextBook))return false;
		
		TextBook tb = (TextBook)o;
		
		return isbn.equals(tb.isbn) && title.equals(tb.title) && authors.equals(tb.authors);
	}
	
	public int hashCode()
	{
		return this.isbn.hashCode() % this.title.hashCode();
	}
			
}
