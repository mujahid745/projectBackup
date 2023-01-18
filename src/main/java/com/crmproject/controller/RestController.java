package com.crmproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crmproject.entities.Lead;
import com.crmproject.repository.LeadRepository;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/info/leads")
public class RestController {
	@Autowired
	LeadRepository leadRepo;
	
	@GetMapping("/api/{id}")
	public Lead viewLead(@PathVariable("id") long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

}
