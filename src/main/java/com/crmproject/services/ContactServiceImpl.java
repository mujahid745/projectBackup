package com.crmproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmproject.entities.Contacts;
import com.crmproject.entities.Lead;
import com.crmproject.repository.ContactRepository;
import com.crmproject.repository.LeadRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveContactInfo(Contacts contact) {
		contactRepo.save(contact);
		
	}

	@Override
	public List<Contacts> getAllContact() {
		List<Contacts> contact = contactRepo.findAll();
		return contact;
	}

	@Override
	public Contacts getContactById(long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contact = findById.get();
		return contact;
	}

	

}
