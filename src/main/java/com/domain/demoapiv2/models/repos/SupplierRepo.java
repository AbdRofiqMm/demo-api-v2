package com.domain.demoapiv2.models.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.demoapiv2.models.entities.Supplier;

public interface SupplierRepo extends JpaRepository<Supplier, Long> {

}
