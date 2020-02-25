package labbook;

public class VideoCD extends MediaItem{
      private String director;
      private String videogenre;
      private int yearReleased;
      
      
	public VideoCD(int id, String title, int copies,int runtime,String director, String videogenre,int yearReleased)
       {
		super(id,title,copies,runtime);
		this.director = director;
		this.videogenre = videogenre;
		this.yearReleased = yearReleased;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getVideogenre() {
		return videogenre;
	}
	public void setVideogenre(String videogenre) {
		this.videogenre = videogenre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
      
      
      
}
