package com.mycompany.group234.repository;


import com.mycompany.group234.model.PerformanceAppraisal;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PerformanceAppraisalRepository extends SimpleJpaRepository<PerformanceAppraisal, String> {
    private final EntityManager em;
    public PerformanceAppraisalRepository(EntityManager em) {
        super(PerformanceAppraisal.class, em);
        this.em = em;
    }
    @Override
    public List<PerformanceAppraisal> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"PerformanceAppraisal\"", PerformanceAppraisal.class).getResultList();
    }
}