package com.domain.demoapiv2.models.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.demoapiv2.models.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
