package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "EmlpoyeeProfilePerformance")
@Table(schema = "\"generated_app\"", name = "\"EmlpoyeeProfilePerformance\"")
@Data
public class EmlpoyeeProfilePerformance{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"EmpID\"")
	private Integer empID;

    
    @Column(name = "\"EmpID\"")
    private Integer empID;
 
}