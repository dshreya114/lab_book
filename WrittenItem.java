package labbook;

public abstract class WrittenItem extends Item {

	private String author;
    
	public WrittenItem() {
		
	}
	public WrittenItem(int id, String title, int copies,String author) {
     super(id,title,copies);   
     this.author=author;
	}

	public String getAuthor() {
		this.setAuthor(author);
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
