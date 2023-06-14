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

@Entity(name = "EmlpoyeeProfile")
@Table(name = "\"EmlpoyeeProfile\"", schema =  "\"generated_app\"")
@Data
                        
public class EmlpoyeeProfile {
	public EmlpoyeeProfile () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"EmpID\"", nullable = true )
  private Integer empID;
	  
  @Column(name = "\"EmpName\"", nullable = true )
  private String empName;
  
	  
  @Column(name = "\"EmpEmailID\"", nullable = true )
  private String empEmailID;
  
	  
  @Column(name = "\"EmpPhoto\"", nullable = true )
  private String empPhoto;
  
	  
  @Column(name = "\"Details\"", nullable = true )
  private String details;
  
  
  
  
		@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"EmlpoyeeProfilePersonalInformation\"", referencedColumnName = "\"EmpID\"", insertable = false, updatable = false)
	private EmployeePersonalInfo personalInformation;
	
	@Column(name = "\"EmlpoyeeProfilePersonalInformation\"")
	private Integer emlpoyeeProfilePersonalInformation;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"EmlpoyeeProfileEmployeedetails\"", referencedColumnName = "\"JobID\"", insertable = false, updatable = false)
	private EmploymentInformation employeedetails;
	
	@Column(name = "\"EmlpoyeeProfileEmployeedetails\"")
	private Integer emlpoyeeProfileEmployeedetails;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"EmlpoyeeProfileEducationDetails\"", referencedColumnName = "\"EmpID\"", insertable = false, updatable = false)
	private EducationalBG educationDetails;
	
	@Column(name = "\"EmlpoyeeProfileEducationDetails\"")
	private Integer emlpoyeeProfileEducationDetails;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"EmlpoyeeProfileEmergencyReachout\"", referencedColumnName = "\"EmpID\"", insertable = false, updatable = false)
	private EmergencyContactInfo emergencyReachout;
	
	@Column(name = "\"EmlpoyeeProfileEmergencyReachout\"")
	private Integer emlpoyeeProfileEmergencyReachout;
   
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"EmlpoyeeProfileOrgProvidedTrainings\"",
            joinColumns = @JoinColumn( name="\"TrainingID\""),
            inverseJoinColumns = @JoinColumn( name="\"OrgProvidedTrainings\""), schema = "\"generated_app\"")
private List<Trainings> orgProvidedTrainings = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "EmlpoyeeProfile [" 
  + "EmpID= " + empID  + ", " 
  + "EmpName= " + empName  + ", " 
  + "EmpEmailID= " + empEmailID  + ", " 
  + "EmpPhoto= " + empPhoto  + ", " 
  + "Details= " + details 
 + "]";
	}
	
}