package com.contratos.respository;

import com.contratos.model.Agreement;
import com.contratos.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}