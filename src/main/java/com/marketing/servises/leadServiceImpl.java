package com.marketing.servises;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.Repository.LeadRepository;
import com.marketing.entities.Lead;


@Service
public class leadServiceImpl implements leadServises {
	
	
	
	@Autowired
	private LeadRepository leadRepo;


	@Override
	public void saveonelead(Lead lead) {
		leadRepo.save(lead);		

	}


	@Override
	public List<Lead> getallleads() {
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}


	@Override
	public void deleteone(long id) {
		leadRepo.deleteById(id);
		
		
		
	}


	@Override
	public Lead updatelead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}


	
}
