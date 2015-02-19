/**
 * 
 */
package me.folixa.model;

import java.util.Date;

/**
 * @author jorgeyp
 *
 */
public class Event {
	private int id;
	private String name;
	private String place;
	private String shortDescription;
	private String longDescription;
	private Date date;
	private Date startDate;
	private Date endDate;
	private boolean validated;
	private String category;
	
	/**
	 * @param id
	 * @param name
	 * @param place
	 * @param shortDescription
	 * @param longDescription
	 * @param date
	 * @param startDate
	 * @param endDate
	 * @param validated
	 * @param category
	 */
	public Event(int id, String name, String place, String shortDescription,
			String longDescription, Date date, Date startDate, Date endDate,
			boolean validated, String category) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.date = date;
		this.startDate = startDate;
		this.endDate = endDate;
		this.validated = validated;
		this.category = category;
	}
	
	/**
	 * 
	 */
	public Event() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", place=" + place
				+ ", shortDescription=" + shortDescription
				+ ", longDescription=" + longDescription + ", date=" + date
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", validated=" + validated + ", category=" + category + "]";
	}
	
	

}
