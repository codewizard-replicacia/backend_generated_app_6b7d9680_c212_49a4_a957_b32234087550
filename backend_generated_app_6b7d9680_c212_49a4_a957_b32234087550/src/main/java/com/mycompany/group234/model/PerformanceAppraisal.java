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

@Entity(name = "PerformanceAppraisal")
@Table(name = "\"PerformanceAppraisal\"", schema =  "\"generated_app\"")
@Data
                        
public class PerformanceAppraisal {
	public PerformanceAppraisal () {   
  }
	  
  @Column(name = "\"FromDate\"")
  @Temporal(value = TemporalType.DATE)
  private Date fromDate;  
  
	  
  @Column(name = "\"ToDate\"")
  @Temporal(value = TemporalType.DATE)
  private Date toDate;  
  
	  
  @Column(name = "\"WhatIWorkedFor\"", nullable = true )
  private String whatIWorkedFor;
  
	  
  @Column(name = "\"WhatILearned\"", nullable = true )
  private String whatILearned;
  
	  
  @Column(name = "\"LearnedFromTeam\"", nullable = true )
  private String learnedFromTeam;
  
	  
  @Column(name = "\"WhatIGaveToTeam\"", nullable = true )
  private String whatIGaveToTeam;
  
	  
  @Column(name = "\"HikePercentage\"", nullable = true )
  private String hikePercentage;
  
	  
  @Column(name = "\"AppraisalReceived\"", nullable = true )
  private String appraisalReceived;
  
	  
  @Column(name = "\"AwardsReceived\"", nullable = true )
  private String awardsReceived;
  
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"EmpID\"", nullable = true )
  private Integer empID;
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "PerformanceAppraisal [" 
  + "FromDate= " + fromDate  + ", " 
  + "ToDate= " + toDate  + ", " 
  + "WhatIWorkedFor= " + whatIWorkedFor  + ", " 
  + "WhatILearned= " + whatILearned  + ", " 
  + "LearnedFromTeam= " + learnedFromTeam  + ", " 
  + "WhatIGaveToTeam= " + whatIGaveToTeam  + ", " 
  + "HikePercentage= " + hikePercentage  + ", " 
  + "AppraisalReceived= " + appraisalReceived  + ", " 
  + "AwardsReceived= " + awardsReceived  + ", " 
  + "EmpID= " + empID 
 + "]";
	}
	
}