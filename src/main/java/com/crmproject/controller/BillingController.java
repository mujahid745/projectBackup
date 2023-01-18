package com.crmproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmproject.entities.Billing;
import com.crmproject.entities.Contacts;
import com.crmproject.services.BillingService;
import com.crmproject.services.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/billing")
	public String viewBillingPage(@RequestParam("id") long id, Model model) {
		Contacts contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return"billing_info";
	}
	
	@RequestMapping("/billingInfo")
	public String saveBilling(@ModelAttribute("billing") Billing billing) {
		billingService.saveBillingInfo(billing);
		return"billing_info";
	}

}
