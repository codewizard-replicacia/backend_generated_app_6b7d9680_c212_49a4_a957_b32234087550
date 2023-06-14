package com.mycompany.group234.repository;


import com.mycompany.group234.model.Trainings;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class TrainingsRepository extends SimpleJpaRepository<Trainings, String> {
    private final EntityManager em;
    public TrainingsRepository(EntityManager em) {
        super(Trainings.class, em);
        this.em = em;
    }
    @Override
    public List<Trainings> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Trainings\"", Trainings.class).getResultList();
    }
}