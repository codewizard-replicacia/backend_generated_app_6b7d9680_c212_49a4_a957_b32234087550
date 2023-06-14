package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
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
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "EmploymentInformation")
@Table(name = "\"EmploymentInformation\"", schema =  "\"generated_app\"")
@Data
                        
public class EmploymentInformation {
	public EmploymentInformation () {   
  }
	  
  @Column(name = "\"JobTitle\"", nullable = true )
  private String jobTitle;
  
	  
  @Column(name = "\"Department\"", nullable = true )
  private String department;
  
	  
  @Column(name = "\"ReportingManager\"", nullable = true )
  private String reportingManager;
  
	  
  @Column(name = "\"DOJ\"", nullable = true )
  private String dOJ;
  
	  
  @Column(name = "\"EmploymentType\"", nullable = true )
  private Boolean employmentType;
  
	  
  @Column(name = "\"Country\"", nullable = true )
  private String country;
  
	  
  @Column(name = "\"State\"", nullable = true )
  private String state;
  
	  
  @Column(name = "\"YearsOfExperience\"", nullable = true )
  private Integer yearsOfExperience;
  
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"JobID\"", nullable = true )
  private Integer jobID;
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "EmploymentInformation [" 
  + "JobTitle= " + jobTitle  + ", " 
  + "Department= " + department  + ", " 
  + "ReportingManager= " + reportingManager  + ", " 
  + "DOJ= " + dOJ  + ", " 
  + "EmploymentType= " + employmentType  + ", " 
  + "Country= " + country  + ", " 
  + "State= " + state  + ", " 
  + "YearsOfExperience= " + yearsOfExperience  + ", " 
  + "JobID= " + jobID 
 + "]";
	}
	
}