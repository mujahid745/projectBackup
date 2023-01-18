package com.crmproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmproject.entities.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
