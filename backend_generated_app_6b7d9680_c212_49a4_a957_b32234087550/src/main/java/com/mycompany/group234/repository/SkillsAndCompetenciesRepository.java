package com.mycompany.group234.repository;


import com.mycompany.group234.model.SkillsAndCompetencies;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class SkillsAndCompetenciesRepository extends SimpleJpaRepository<SkillsAndCompetencies, String> {
    private final EntityManager em;
    public SkillsAndCompetenciesRepository(EntityManager em) {
        super(SkillsAndCompetencies.class, em);
        this.em = em;
    }
    @Override
    public List<SkillsAndCompetencies> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"SkillsAndCompetencies\"", SkillsAndCompetencies.class).getResultList();
    }
}