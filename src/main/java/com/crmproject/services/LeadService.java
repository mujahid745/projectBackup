package com.crmproject.services;

import java.util.List;

import com.crmproject.entities.Lead;

public interface LeadService {

	public void saveLeadInfo(Lead lead);

	public List<Lead> getAllLead();

	public Lead getLeadById(long id);

	public void deleteLead(Lead lead);

}
