package labbook;

public class AudioCD extends MediaItem{
	  private String artist;
      private String audiogenre;
      
	public AudioCD(int id, String title, int copies,int runtime,String artist, String audiogenre) {
		super(id,title,copies,runtime);
		this.artist = artist;
		this.audiogenre = audiogenre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAudiogenre() {
		return audiogenre;
	}

	public void setAudiogenre(String audiogenre) {
		this.audiogenre = audiogenre;
	}
}
      
      
	 
     
