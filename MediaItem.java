package labbook;

public abstract class MediaItem extends Item {
   int runtime;
   
   public MediaItem() {
	   
   }
public MediaItem(int id, String title, int copies, int runtime) {
	super(id,title,copies);
	this.runtime=runtime;
	
}

public int getRuntime() {
	return runtime;
}

public void setRuntime(int runtime) {
	this.runtime = runtime;
}
   
}
