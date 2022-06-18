package com.contratos.service;


import com.contratos.model.Agreement;
import com.contratos.model.Category;
import com.contratos.model.Institute;
import com.contratos.respository.AgreementRepository;
import com.contratos.respository.CategoryRepository;
import com.contratos.respository.InstituteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgreementService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AgreementService.class);
    private AgreementRepository agreementRepository;
    private InstituteRepository instituteRepository;

    private CategoryRepository categoryRepository;

    @Autowired
    public AgreementService(AgreementRepository agreementRepository, InstituteRepository instituteRepository, CategoryRepository categoryRepository) {
        this.agreementRepository = agreementRepository;
        this.instituteRepository = instituteRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Agreement> getAgreements() {
        LOGGER.info("GET Agreements");
        return agreementRepository.findAll();
    }

    public List<Institute> getInstitute() {
        LOGGER.info("GET Institute");
        return instituteRepository.findAll();
    }

    public List<Category> getCategories() {
        LOGGER.info("GET Categories");
        return categoryRepository.findAll();
    }

    public Agreement addAgreement(Agreement agreement) {
        LOGGER.info("POST Agreements {}", agreement);
        return agreementRepository.save(agreement);
    }

    public Institute addInstitute(Institute institute) {
        LOGGER.info("POST Institute {}", institute);
        return instituteRepository.save(institute);
    }

    public Category addCategory(Category category) {
        LOGGER.info("POST Category {}", category);
        return categoryRepository.save(category);
    }

    public void deleteAgreement(Agreement agreement) {
        LOGGER.info("DELETE Agreements {}", agreement);
        agreementRepository.delete(agreement);
    }

    public void deleteInstitute(Institute institute) {
        LOGGER.info("DELETE Institute {}", institute);
        instituteRepository.delete(institute);
    }

    public void deleteCategory(Category category) {
        LOGGER.info("DELETE Category {}", category);
        categoryRepository.delete(category);
    }

    public Optional<Institute> findInstituteById(Long instituteId) {
        LOGGER.info("GET Institute by Id {}", instituteId);
        return instituteRepository.findById(instituteId);
    }

    public Optional<Category> findCategoryById(String categoryId) {
        LOGGER.info("GET Category by Id {}", categoryId);
        return categoryRepository.findById(categoryId);
    }
}