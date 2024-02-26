package socialNetwork;

 
public class PhotoBroadcast extends Submissions{
	private String fileName;
    private String title;

	public PhotoBroadcast(String userName, String fileName, String title) {
		super(userName);
		this.fileName = fileName;
		this.title = title;
		// TODO Auto-generated constructor stub
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
 
	@Override

	public String toString() {
		return "PhotoBroadcast [" + super.toString() + "fileName=" + fileName + ", title=" + title + "]";
	}
}