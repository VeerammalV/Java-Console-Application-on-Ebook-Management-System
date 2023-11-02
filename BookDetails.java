package org.ebooks;

public class BookDetails {

	public String BookId;
	public String BookName;
	public String AuthorName;
	public long Price;
	
	public String getBookId() {
		return BookId;
	}
	public String getBookName() {
		return BookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public long getPrice() {
		return Price;
	}
	public void setBookId(String bookId) {
		BookId = bookId;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public void setPrice(long price) {
		Price = price;
	}
	
	
	public String toString() {
		return "BookDetails [BookId=" + BookId + ", BookName=" + BookName + ", AuthorName=" + AuthorName + ", Price="
				+ Price + "]";
	}
	
	
}

