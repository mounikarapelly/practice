
package com.cg.book1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*import lombok.Getter;
import lombok.Setter;
import lombok.ToString;@Getter
@Setter
@ToString*/@Document(collection = "Book")
public class Book {
	@Id
	private int id;
	private String bookname;
	private String authorname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", authorname=" + authorname + "]";
	}
}
