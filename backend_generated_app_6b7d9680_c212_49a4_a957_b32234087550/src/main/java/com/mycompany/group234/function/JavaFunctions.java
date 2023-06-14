package com.mycompany.group234.function;

import com.mycompany.group234.model.PreviousCompany;
import com.mycompany.group234.model.PerformanceAppraisal;
import com.mycompany.group234.model.Organization;
import com.mycompany.group234.model.Trainings;
import com.mycompany.group234.model.EmployeePersonalInfo;
import com.mycompany.group234.model.EmploymentInformation;
import com.mycompany.group234.model.EmergencyContactInfo;
import com.mycompany.group234.model.SkillsAndCompetencies;
import com.mycompany.group234.model.EducationalBG;
import com.mycompany.group234.model.EmlpoyeeProfile;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.mycompany.group234.repository.PerformanceAppraisalRepository;
import com.mycompany.group234.repository.OrganizationRepository;
import com.mycompany.group234.repository.EmployeePersonalInfoRepository;
import com.mycompany.group234.repository.EducationalBGRepository;
import com.mycompany.group234.repository.SkillsAndCompetenciesRepository;
import com.mycompany.group234.repository.TrainingsRepository;
import com.mycompany.group234.repository.EmploymentInformationRepository;
import com.mycompany.group234.repository.EmlpoyeeProfileRepository;
import com.mycompany.group234.repository.PreviousCompanyRepository;
import com.mycompany.group234.repository.EmergencyContactInfoRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
