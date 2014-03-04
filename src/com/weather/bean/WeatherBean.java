package com.weather.bean;

public class WeatherBean {
	
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String obstime;
	private String tempC;
	private String tempF;
	private String humidity;
	private String cloudcover;
	private String description;
	
	
	
	public WeatherBean() {
		super();
	}
	public String getObstime() {
		return obstime;
	}
	public void setObstime(String obstime) {
		this.obstime = obstime;
	}
	public String getTempC() {
		return tempC;
	}
	public void setTempC(String tempC) {
		this.tempC = tempC;
	}
	public String getTempF() {
		return tempF;
	}
	public void setTempF(String tempF) {
		this.tempF = tempF;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getCloudcover() {
		return cloudcover;
	}
	public void setCloudcover(String cloudcover) {
		this.cloudcover = cloudcover;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
