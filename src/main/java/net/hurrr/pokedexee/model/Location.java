package net.hurrr.pokedexee.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Location {
	private int id;
	private Region region;
	private Text location;
	private Text locationArea; // TODO NULLABLE
	
	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@XmlAttribute
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Text getLocation() {
		return location;
	}

	public void setLocation(Text location) {
		this.location = location;
	}
	
	public Text getLocationArea() {
		return locationArea;
	}

	public void setLocationArea(Text locationArea) {
		this.locationArea = locationArea;
	}
}
