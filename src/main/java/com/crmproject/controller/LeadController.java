package com.crmproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmproject.entities.Contacts;
import com.crmproject.entities.Lead;
import com.crmproject.services.ContactService;
import com.crmproject.services.LeadService;
import com.crmproject.sutil.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String viewLeadPage() {
		return"create_lead";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String saveLead(@ModelAttribute("lead") Lead lead, Model model) {
		leadService.saveLeadInfo(lead);
		model.addAttribute("msg", "record is saved!!");
		model.addAttribute("lead", lead);
		return"lead_info";
	}
	
	@RequestMapping("/sendEmail")
	public String composeEmail(@RequestParam("email") String email, Model model) {
		model.addAttribute("email", email);
		return"create_email";
	}
	
	@RequestMapping("/compose")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("subject") String subject, @RequestParam("message") String message, Model model) {
		emailService.sendEmails(to, subject, message);
		model.addAttribute("msg", "email sent...");
		return"create_email";
	}
	@RequestMapping("/listAll")
	public String getAllLead(Model model) {
		List<Lead> lead = leadService.getAllLead();
		model.addAttribute("lead", lead);
		return"list_lead";
		
	}
	@RequestMapping("/leadCompose")
	public String viewLeadInfo(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return"lead_info";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.getLeadById(id);
		
		Contacts contact = new Contacts();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactService.saveContactInfo(contact);
		
		leadService.deleteLead(lead);
		
		List<Contacts> contacts = contactService.getAllContact();
		model.addAttribute("contact", contacts);
		return"list_contacts";
	}

}
