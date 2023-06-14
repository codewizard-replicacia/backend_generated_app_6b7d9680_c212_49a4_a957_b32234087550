package com.mycompany.group234.repository;


import com.mycompany.group234.model.EmploymentInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class EmploymentInformationRepository extends SimpleJpaRepository<EmploymentInformation, String> {
    private final EntityManager em;
    public EmploymentInformationRepository(EntityManager em) {
        super(EmploymentInformation.class, em);
        this.em = em;
    }
    @Override
    public List<EmploymentInformation> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"EmploymentInformation\"", EmploymentInformation.class).getResultList();
    }
}