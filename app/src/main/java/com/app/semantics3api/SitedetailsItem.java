package com.app.semantics3api;

import java.util.List;

public class SitedetailsItem{
	private String name;
	private String sku;
	private int recentoffersCount;
	private String url;
	private List<LatestoffersItem> latestoffers;
	private String listpriceCurrency;
	private String listprice;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSku(String sku){
		this.sku = sku;
	}

	public String getSku(){
		return sku;
	}

	public void setRecentoffersCount(int recentoffersCount){
		this.recentoffersCount = recentoffersCount;
	}

	public int getRecentoffersCount(){
		return recentoffersCount;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setLatestoffers(List<LatestoffersItem> latestoffers){
		this.latestoffers = latestoffers;
	}

	public List<LatestoffersItem> getLatestoffers(){
		return latestoffers;
	}

	public void setListpriceCurrency(String listpriceCurrency){
		this.listpriceCurrency = listpriceCurrency;
	}

	public String getListpriceCurrency(){
		return listpriceCurrency;
	}

	public void setListprice(String listprice){
		this.listprice = listprice;
	}

	public String getListprice(){
		return listprice;
	}

	@Override
 	public String toString(){
		return 
			"SitedetailsItem{" + 
			"name = '" + name + '\'' + 
			",sku = '" + sku + '\'' + 
			",recentoffers_count = '" + recentoffersCount + '\'' + 
			",url = '" + url + '\'' + 
			",latestoffers = '" + latestoffers + '\'' + 
			",listprice_currency = '" + listpriceCurrency + '\'' + 
			",listprice = '" + listprice + '\'' + 
			"}";
		}
}