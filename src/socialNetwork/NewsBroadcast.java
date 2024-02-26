package socialNetwork;

public class NewsBroadcast extends Submissions{
    private String text;


	public NewsBroadcast(String userName, String text) {
		super(userName);
		this.text = text;
		// TODO Auto-generated constructor stub
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "NewsBroadcast [" + super.toString() + "text" + text + "]";
	}

	



}