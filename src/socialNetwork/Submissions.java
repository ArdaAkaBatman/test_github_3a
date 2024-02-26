package socialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
 
public abstract class Submissions {
	private String userName;
	private LocalDate timeStamp;
	private int like;
	private ArrayList<Comment> comments;

	public Submissions(String userName) {
		super();
		this.userName = userName;
		this.timeStamp = LocalDate.now();
		this.like = 0;
		this.comments = new ArrayList<>();
	}
 
 
	public String getUserName() {
		return userName;
	}
 
 
	public void setUserName(String userName) {
		this.userName = userName;
	}
 
 
	public LocalDate getTimeStamp() {
		return timeStamp;
	}
 
 
	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}
 
 
	public int getLike() {
		return like;
	}
 
 
	public void setLike(int like) {
		this.like = like;
	}
 
 
	public ArrayList<Comment> getComments() {
		return comments;
	}
 
 
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}


	 @Override
	public String toString() {
		return "Submissions [userName=" + userName + ", timeStamp=" + timeStamp + ", like=" + like + ", comments="
				+ comments + "]";
	}
 
 
	 /**
	  * adds a comment
	  * @param comments
	  */
	public void addComment(Comment comments) {
	        this.comments.add(comments);
	    }
	 /**
	  * removes a comment
	  * @param comments
	  */
	 public void removeComment(Comment comments) {
	        this.comments.remove(comments);
	    }
 
	 
	 /**
	  * prints every comment
	  */
	 public void printAllComments() {
		 for(Comment c : this.comments) {
			 System.out.println(c);
		 }
	 }

	 /**
	  * calculates the time when the post was posted
	  * @param millis
	  */
	 public static void getTimeAgo(long millis) {
	        long currentTime = System.currentTimeMillis();
	        long diff = currentTime - millis;
 
	        long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
	        long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
	        long hours = TimeUnit.MILLISECONDS.toHours(diff);
	        long days = TimeUnit.MILLISECONDS.toDays(diff);
	        long months = TimeUnit.MILLISECONDS.toDays(diff) * 30;
	        long year = TimeUnit.MILLISECONDS.toDays(diff) * 365;
	        if (seconds < 60) {
	        	System.out.println("vor " + seconds + " Sekunden");;
	        } 
	         else if (minutes < 3600) {
	            System.out.println("vor " + minutes + " Minuten");;
	        } 
	         else if (hours < 86400) {
	            System.out.println("vor " + hours + " Stunden");;
	        } 
	         else if(days < 604800) {
	        	 System.out.println("vor " + days + " Tagen");
	        }
			 else if(months < 604800 * 30) {
				 System.out.println("vor " + months + " Monaten");
			}
			 else if(year < 604800 * 365) {
				System.out.println("vor " + year + " Jahren");
		     }
	   }
}