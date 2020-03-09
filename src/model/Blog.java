package model;

import java.time.LocalDateTime;

// Type your code
public class Blog{
	String title;
	String description;
	LocalDateTime postedOn;
	public Blog(String title, String description, LocalDateTime postedOn) {
		super();
		this.title = title;
		this.description = description;
		this.postedOn = postedOn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDateTime postedOn) {
		this.postedOn = postedOn;
	}
	
}