package me.folixa.ws.merchandise;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="c")
public class Category {
	private int id;
	private String name;
	
	public Category() {}

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
