package com.app.semantics3api;

import java.util.ArrayList;


public class ResultsItem{
	private ArrayList<String> gtins;
	private ArrayList<String> images;
	private String format;
	private String weight;
	private int createdAt;
	private String description;
	private String language;
	private int imagesTotal;
	private ArrayList<String> variationSecondaryids;
	private ArrayList<String> geo;
	private String ean;
	private int updatedAt;
	private ArrayList<SitedetailsItem> sitedetails;
	private String price;
	private String catId;
	private String name;
	private String publisher;
	private ArrayList<Object> messages;
	private String sem3Id;
	private String category;
	private String brand;
	private String priceCurrency;
	private String height;
	private String length;
	private String upc;
	private String width;
	private String manufacturer;
	private String model;
	private String artist;
	private String label;
	private String size;
	private String studio;
	private String director;
	private String actor;
	private String runningtime;

	public void setGtins(ArrayList<String> gtins){
		this.gtins = gtins;
	}

	public ArrayList<String> getGtins(){
		return gtins;
	}

	public void setImages(ArrayList<String> images){
		this.images = images;
	}

	public ArrayList<String> getImages(){
		return images;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
	}

	public void setWeight(String weight){
		this.weight = weight;
	}

	public String getWeight(){
		return weight;
	}

	public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setImagesTotal(int imagesTotal){
		this.imagesTotal = imagesTotal;
	}

	public int getImagesTotal(){
		return imagesTotal;
	}

	public void setVariationSecondaryids(ArrayList<String> variationSecondaryids){
		this.variationSecondaryids = variationSecondaryids;
	}

	public ArrayList<String> getVariationSecondaryids(){
		return variationSecondaryids;
	}

	public void setGeo(ArrayList<String> geo){
		this.geo = geo;
	}

	public ArrayList<String> getGeo(){
		return geo;
	}


	public void setEan(String ean){
		this.ean = ean;
	}

	public String getEan(){
		return ean;
	}

	public void setUpdatedAt(int updatedAt){
		this.updatedAt = updatedAt;
	}

	public int getUpdatedAt(){
		return updatedAt;
	}

	public void setSitedetails(ArrayList<SitedetailsItem> sitedetails){
		this.sitedetails = sitedetails;
	}

	public ArrayList<SitedetailsItem> getSitedetails(){
		return sitedetails;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setCatId(String catId){
		this.catId = catId;
	}

	public String getCatId(){
		return catId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPublisher(String publisher){
		this.publisher = publisher;
	}

	public String getPublisher(){
		return publisher;
	}

	public void setMessages(ArrayList<Object> messages){
		this.messages = messages;
	}

	public ArrayList<Object> getMessages(){
		return messages;
	}

	public void setSem3Id(String sem3Id){
		this.sem3Id = sem3Id;
	}

	public String getSem3Id(){
		return sem3Id;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	public void setPriceCurrency(String priceCurrency){
		this.priceCurrency = priceCurrency;
	}

	public String getPriceCurrency(){
		return priceCurrency;
	}

	public void setHeight(String height){
		this.height = height;
	}

	public String getHeight(){
		return height;
	}

	public void setLength(String length){
		this.length = length;
	}

	public String getLength(){
		return length;
	}

	public void setUpc(String upc){
		this.upc = upc;
	}

	public String getUpc(){
		return upc;
	}

	public void setWidth(String width){
		this.width = width;
	}

	public String getWidth(){
		return width;
	}

	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}

	public String getManufacturer(){
		return manufacturer;
	}

	public void setModel(String model){
		this.model = model;
	}

	public String getModel(){
		return model;
	}

	public void setArtist(String artist){
		this.artist = artist;
	}

	public String getArtist(){
		return artist;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setStudio(String studio){
		this.studio = studio;
	}

	public String getStudio(){
		return studio;
	}

	public void setDirector(String director){
		this.director = director;
	}

	public String getDirector(){
		return director;
	}

	public void setActor(String actor){
		this.actor = actor;
	}

	public String getActor(){
		return actor;
	}

	public void setRunningtime(String runningtime){
		this.runningtime = runningtime;
	}

	public String getRunningtime(){
		return runningtime;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"gtins = '" + gtins + '\'' + 
			",images = '" + images + '\'' + 
			",format = '" + format + '\'' + 
			",weight = '" + weight + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",description = '" + description + '\'' + 
			",language = '" + language + '\'' + 
			",images_total = '" + imagesTotal + '\'' + 
			",variation_secondaryids = '" + variationSecondaryids + '\'' + 
			",geo = '" + geo + '\'' + 
			",ean = '" + ean + '\'' +
			",updated_at = '" + updatedAt + '\'' + 
			",sitedetails = '" + sitedetails + '\'' + 
			",price = '" + price + '\'' + 
			",cat_id = '" + catId + '\'' + 
			",name = '" + name + '\'' + 
			",publisher = '" + publisher + '\'' + 
			",messages = '" + messages + '\'' + 
			",sem3_id = '" + sem3Id + '\'' + 
			",category = '" + category + '\'' + 
			",brand = '" + brand + '\'' + 
			",price_currency = '" + priceCurrency + '\'' + 
			",height = '" + height + '\'' + 
			",length = '" + length + '\'' + 
			",upc = '" + upc + '\'' + 
			",width = '" + width + '\'' + 
			",manufacturer = '" + manufacturer + '\'' + 
			",model = '" + model + '\'' + 
			",artist = '" + artist + '\'' + 
			",label = '" + label + '\'' + 
			",size = '" + size + '\'' + 
			",studio = '" + studio + '\'' + 
			",director = '" + director + '\'' + 
			",actor = '" + actor + '\'' + 
			",runningtime = '" + runningtime + '\'' + 
			"}";
		}
}