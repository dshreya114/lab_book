package labbook;

public class JournalPaper extends WrittenItem {
    private int year;

	public JournalPaper(int id, String title, int copies,String author,int year) {
		super(id,title,copies,author);
		this.year = year;

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
    
}
