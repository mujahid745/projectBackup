package com.crmproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmproject.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
