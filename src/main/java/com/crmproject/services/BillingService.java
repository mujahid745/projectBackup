package com.crmproject.services;

import java.util.List;

import com.crmproject.entities.Billing;

public interface BillingService {

	public Billing getContact(long id);

	public void saveBillingInfo(Billing billing);

}
