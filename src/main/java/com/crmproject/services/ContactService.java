package com.crmproject.services;

import java.util.List;

import com.crmproject.entities.Contacts;
import com.crmproject.entities.Lead;

public interface ContactService {

	public void saveContactInfo(Contacts contact);

	public List<Contacts> getAllContact();

	public Contacts getContactById(long id);

}
