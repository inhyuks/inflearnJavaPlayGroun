package gugudan.calendar;

public class Schedul {
	String date;
	String content;
	
	public Schedul(String date, String content) {
		this.date = date;
		this.content = content;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public String saveString() {
		return date + "," + content + "\n";
	}
}
