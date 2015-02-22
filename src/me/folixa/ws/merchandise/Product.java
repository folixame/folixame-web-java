package me.folixa.ws.merchandise;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="p")
public class Product {
	private int id;
	private String name;
	private String shortDescription;
	private String longDescription;
	private double price;
	private int event;
	private int category;
	
	public Product () {};
	
	public Product(int id, String name, String shortDescription,
			String longDescription, double price, int event, int category) {
		super();
		this.id = id;
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.price = price;
		this.event = event;
		this.category = category;
	}

	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	@XmlElement
	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@XmlElement
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@XmlElement
	public int getEvent() {
		return event;
	}

	public void setEvent(int event) {
		this.event = event;
	}

	@XmlElement
	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
}
