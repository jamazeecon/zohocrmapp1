package com.marketing.servises;

import java.util.List;

import com.marketing.entities.Lead;

public interface leadServises {

	public void saveonelead(Lead lead);
	public List<Lead> getallleads();
	public void deleteone(long id);
	
	public Lead updatelead(long id);

}
