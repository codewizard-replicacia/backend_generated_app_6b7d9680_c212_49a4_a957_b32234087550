package com.mycompany.group234.repository;


import com.mycompany.group234.model.EducationalBG;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class EducationalBGRepository extends SimpleJpaRepository<EducationalBG, String> {
    private final EntityManager em;
    public EducationalBGRepository(EntityManager em) {
        super(EducationalBG.class, em);
        this.em = em;
    }
    @Override
    public List<EducationalBG> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"EducationalBG\"", EducationalBG.class).getResultList();
    }
}