package com.marketing.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.Repository.LeadRepository;
import com.marketing.entities.Lead;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
	
	
	@Autowired
	LeadRepository leadRepo;
	@GetMapping
	public List<Lead>getallLeads(){
		List<Lead> leads = leadRepo.findAll();
		return leads;
		
		
	}
	@PostMapping
	public void saveoneLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
		
	}
	@PutMapping
	public void updateoneLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteoneLead(@PathVariable("id")long id) {
		leadRepo.deleteById(id);
		
	}
	@RequestMapping("/find/{id}")
	public Lead getarecord(@PathVariable("id")long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
}
