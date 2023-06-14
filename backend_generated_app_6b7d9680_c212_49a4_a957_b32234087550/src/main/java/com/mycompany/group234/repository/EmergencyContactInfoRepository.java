package com.mycompany.group234.repository;


import com.mycompany.group234.model.EmergencyContactInfo;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class EmergencyContactInfoRepository extends SimpleJpaRepository<EmergencyContactInfo, String> {
    private final EntityManager em;
    public EmergencyContactInfoRepository(EntityManager em) {
        super(EmergencyContactInfo.class, em);
        this.em = em;
    }
    @Override
    public List<EmergencyContactInfo> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"EmergencyContactInfo\"", EmergencyContactInfo.class).getResultList();
    }
}