package com.app.semantics3api;

import java.util.List;

public class Products{
	private String code;
	private int offset;
	private int resultsCount;
	private List<ResultsItem> results;
	private int totalResultsCount;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setResultsCount(int resultsCount){
		this.resultsCount = resultsCount;
	}

	public int getResultsCount(){
		return resultsCount;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	public void setTotalResultsCount(int totalResultsCount){
		this.totalResultsCount = totalResultsCount;
	}

	public int getTotalResultsCount(){
		return totalResultsCount;
	}

	@Override
 	public String toString(){
		return 
			"Products{" + 
			"code = '" + code + '\'' + 
			",offset = '" + offset + '\'' + 
			",results_count = '" + resultsCount + '\'' + 
			",results = '" + results + '\'' + 
			",total_results_count = '" + totalResultsCount + '\'' + 
			"}";
		}
}