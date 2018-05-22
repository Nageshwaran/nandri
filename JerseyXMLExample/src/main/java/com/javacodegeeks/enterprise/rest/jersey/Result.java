package com.javacodegeeks.enterprise.rest.jersey;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Result {
	public Result() {

	}


@Override
	public String toString() {
		return "Result [adf=" + adf + ", address=" + address + ", city=" + city + "]";
	}


@XmlElement
private int adf;
@XmlElement
private String address;
public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}


@XmlElement
private String city;


public int getAdf() {
	return adf;
}

public void setAdf(int adf) {
	this.adf = adf;
}
}

