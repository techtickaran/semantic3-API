package com.app.semantics3api;

public class LatestoffersItem{
	private String seller;
	private int lastrecordedAt;
	private String price;
	private int isactive;
	private String currency;
	private String availability;
	private String id;
	private int firstrecordedAt;

	public void setSeller(String seller){
		this.seller = seller;
	}

	public String getSeller(){
		return seller;
	}

	public void setLastrecordedAt(int lastrecordedAt){
		this.lastrecordedAt = lastrecordedAt;
	}

	public int getLastrecordedAt(){
		return lastrecordedAt;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setIsactive(int isactive){
		this.isactive = isactive;
	}

	public int getIsactive(){
		return isactive;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setAvailability(String availability){
		this.availability = availability;
	}

	public String getAvailability(){
		return availability;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setFirstrecordedAt(int firstrecordedAt){
		this.firstrecordedAt = firstrecordedAt;
	}

	public int getFirstrecordedAt(){
		return firstrecordedAt;
	}

	@Override
 	public String toString(){
		return 
			"LatestoffersItem{" + 
			"seller = '" + seller + '\'' + 
			",lastrecorded_at = '" + lastrecordedAt + '\'' + 
			",price = '" + price + '\'' + 
			",isactive = '" + isactive + '\'' + 
			",currency = '" + currency + '\'' + 
			",availability = '" + availability + '\'' + 
			",id = '" + id + '\'' + 
			",firstrecorded_at = '" + firstrecordedAt + '\'' + 
			"}";
		}
}
