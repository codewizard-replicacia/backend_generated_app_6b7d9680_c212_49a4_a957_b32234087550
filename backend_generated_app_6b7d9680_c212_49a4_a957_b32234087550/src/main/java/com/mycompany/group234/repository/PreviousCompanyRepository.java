package com.mycompany.group234.repository;


import com.mycompany.group234.model.PreviousCompany;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PreviousCompanyRepository extends SimpleJpaRepository<PreviousCompany, String> {
    private final EntityManager em;
    public PreviousCompanyRepository(EntityManager em) {
        super(PreviousCompany.class, em);
        this.em = em;
    }
    @Override
    public List<PreviousCompany> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"PreviousCompany\"", PreviousCompany.class).getResultList();
    }
}