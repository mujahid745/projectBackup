package com.crmproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmproject.entities.Lead;
import com.crmproject.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveLeadInfo(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> getAllLead() {
		
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}

	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
		
	}

	@Override
	public void deleteLead(Lead lead) {
		leadRepo.delete(lead);
		
	}

	

}
