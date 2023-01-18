package com.crmproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmproject.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
