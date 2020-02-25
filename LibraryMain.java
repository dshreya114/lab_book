package labbook;

public class LibraryMain {
    public static void main(String[] args) {
	 
    	Item item[]= new Item[4];
    	
    	Book book = new Book(10,"JAVA",100,"abc");
    	item[0]= book;
    	
    	JournalPaper journal= new JournalPaper(10," ",10," ",2010);
    	item[1]= journal;
    	
    	VideoCD video =new VideoCD(1," ",1,10,"Rohit","Punjabi",2000);
    	item[2]= video;
    	
    	AudioCD audio = new AudioCD(10,"Success",10,100,"Shreya","Classical");
    	item[3]= audio;
    	
    	
    	LibraryMain obj = new LibraryMain();
    	obj.display(item);
    }
    
    public void display(Item[] item)
    {
    	for(int i=0;i<item.length; i++)
    	{
    		Item a = item[i];
    		if(a instanceof Book)
    		{
    		    Book b=(Book)a ;
    			displayBook(b);
    		}
    		else if(a instanceof JournalPaper)
    		{
    			JournalPaper jp=(JournalPaper)a;
    			displayJournal(jp);
    		}
    		else if(a instanceof VideoCD)
    		{
    			VideoCD v= (VideoCD)a;
    			displayVideoCD(v);
    		}
    		else if(a instanceof AudioCD)
    		{
    			AudioCD a1= (AudioCD)a;
    			displayAudioCD(a1);
    		}
    
    	}
    }
    public void displayBook(Book b) 
    {
    	System.out.println("Book details: ");
    	System.out.println("Book id: "+b.getId());
    	System.out.println("Book title: "+b.getTitle());
    	System.out.println("Number of copies: "+b.getCopies());
    	
    }
    public void displayJournal(JournalPaper jp)
    {
    	System.out.println("Year: "+jp.getYear());
    }
    public void displayVideoCD(VideoCD v)
    {
    	System.out.println("VideoCD details : ");
    	System.out.println("Director name: "+v.getDirector());
    	System.out.println("Genre: "+v.getVideogenre());
    	System.out.println("Year Released: "+v.getYearReleased());
    }
    public void displayAudioCD(AudioCD a1){
    	{
    		System.out.println("AudioCD details: ");
    		System.out.println("Artist name: "+a1.getArtist());
    		System.out.println("Genre: "+a1.getAudiogenre());
    	}
    }
}
