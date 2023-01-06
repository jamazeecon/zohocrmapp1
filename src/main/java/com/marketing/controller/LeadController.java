package com.marketing.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.entities.Lead;
import com.marketing.servises.leadServises;
import com.marketing.utill.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private leadServises leadservise;
	
	@Autowired
	 private EmailService emailservice;
	
	//http://localhost:8080/create
	
	@RequestMapping("/create")
	public String viewCreateLeadForm() {
		return "create_lead";
	}
  //http://localhost:8080/save_lead
	@RequestMapping("/save_lead")
	public String savelead(@ModelAttribute("x")Lead lead,ModelMap model) {  //(@modelAttribute("x")Lead lead
		model.addAttribute("msg", "data is saved");
		emailservice.sendEmail(lead.getEmail(), "WELCOME", "email asigolare");
		leadservise.saveonelead(lead);
		return"create_lead";
		
	}
	//second way to read form data
//	@RequestMapping("/save_lead")
//
//		public String savelead(@RequestParam("firstName")String firstName,@RequestParam("lastName")String lastname,@RequestParam("email")String email,@RequestParam("mobile")Long mobile) {
//		Lead lead=new Lead();
//		lead.setFirstName(firstName);
//		lead.setLastName(lastname);
//		lead.setEmail(email);
//		lead.setMobile(mobile);
//		leadservise.saveonelead(lead);
//		
//		return"create_lead";
//	}
	//Third way to read form data
//	@RequestMapping("/save_lead")
//	public String savelead(LeadData leaddata) {
//		Lead lead=new Lead();
//		lead.setEmail(leaddata.getEmail());
//		lead.setFirstName(leaddata.getFirstName());
//		lead.setLastName(leaddata.getLastName());
//		lead.setMobile(leaddata.getMobile());
//		leadservise.saveonelead(lead);
//	return"create_lead";
//		
//	}
	@RequestMapping("/listall")
	public String listlead(Model model) {
		List<Lead> leads = leadservise.getallleads();
		model.addAttribute("leads", leads);
		return"list_all";
	}
	@RequestMapping("/delete")
	public String deleteone(@RequestParam("id")long id,Model model) {
		leadservise.deleteone(id);
		
		List<Lead> leads = leadservise.getallleads();
		model.addAttribute("leads", leads);
		return"list_all";
	}
	@RequestMapping("/update")
	public String  updatelead(@RequestParam("id")long id, Model model) {
		Lead updatelead = leadservise.updatelead(id);
		
		model.addAttribute("leads", updatelead);
		
		
		return "update";
	}

		@RequestMapping("/updates")
		public String updates(Lead lead,Model model) {
			leadservise.saveonelead(lead);
			
	
		List<Lead> leads = leadservise.getallleads();
		model.addAttribute("leads", leads);
		return"list_all";
	
		}

	
			
}


