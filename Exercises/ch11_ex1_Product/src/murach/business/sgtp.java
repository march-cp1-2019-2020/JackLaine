package murach.business;

public class sgtp extends Product {

	public String author;
	
	public sgtp() {
		super();
		author = "";
		count++;
		}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return super.toString() + " by " + author;
	}
}


