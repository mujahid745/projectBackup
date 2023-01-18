package com.crmproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crmproject.entities.Contacts;
import com.crmproject.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	
	
	@RequestMapping("/listcontact")
	public String listContacts(Model model) {
		List<Contacts> contacts = contactService.getAllContact();
		model.addAttribute("contact", contacts);
		return"list_contacts";
	}

}
