package com.crmproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmproject.entities.Billing;
import com.crmproject.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;
	
	
	@Override
	public Billing getContact(long id) {
		
	   Optional<Billing> findById = billingRepo.findById(id);
	   Billing billing = findById.get();
		return billing;
	}
	@Override
	public void saveBillingInfo(Billing billing) {
		billingRepo.save(billing);
		
	}

}
