package com.take.one;

/*
 * A single story object. This shall be modified frequently
 * 
 */

public class StoryItem {
	private int id;
	private String author;
	private int coverPicId;
	private String title;
	private String category;
	private int viewCount;
	private String createdAt;

	public StoryItem() {

	}

	public StoryItem(int id, String author, int coverPicId, String title,
			String category, int viewCount, String createdAt) {
		setId(id);
		setAuthor(author);
		setCoverPicId(coverPicId);
		setTitle(title);
		setCategory(category);
		setViewCount(viewCount);
		setCreatedAt(createdAt);
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}

	public int getCoverPicId() {
		return coverPicId;
	}

	public void setCoverPicId(int coverPicId) {
		this.coverPicId = coverPicId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
}
