package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root{
    @JsonProperty("provider") 
    public String getProvider() { 
		 return this.provider; } 
    public void setProvider(String provider) { 
		 this.provider = provider; } 
    String provider;
    
    @JsonProperty("WARNING_UPGRADE_TO_V6") 
    public String getWARNING_UPGRADE_TO_V6() { 
		 return this.wARNING_UPGRADE_TO_V6; } 
    public void setWARNING_UPGRADE_TO_V6(String wARNING_UPGRADE_TO_V6) { 
		 this.wARNING_UPGRADE_TO_V6 = wARNING_UPGRADE_TO_V6; } 
    String wARNING_UPGRADE_TO_V6;
    
    @JsonProperty("terms") 
    public String getTerms() { 
		 return this.terms; } 
    public void setTerms(String terms) { 
		 this.terms = terms; } 
    String terms;
    
    @JsonProperty("base") 
    public String getBase() { 
		 return this.base; } 
    public void setBase(String base) { 
		 this.base = base; } 
    String base;
    
    @JsonProperty("date") 
    public String getDate() { 
		 return this.date; } 
    public void setDate(String date) { 
		 this.date = date; } 
    String date;
    
    @JsonProperty("time_last_updated") 
    public int getTime_last_updated() { 
		 return this.time_last_updated; } 
    public void setTime_last_updated(int time_last_updated) { 
		 this.time_last_updated = time_last_updated; } 
    int time_last_updated;
    
    @JsonProperty("rates") 
    public Rates getRates() { 
		 return this.rates; } 
    public void setRates(Rates rates) { 
		 this.rates = rates; } 
    Rates rates;
}