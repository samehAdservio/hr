package com.adservio.hr.Core.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;

@Entity
public class Candidat implements EntityDefault {
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "user_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
    private String candidatId;
    private Date creDate;
    private Date updDate;
    private String createdby;
    private String updateBy;

    private String lastName;
    private String firstName;
    private String urlCv;

    //cordonnés
    @Email
    private String email1;
    @Email
    private String email2;
    @Email
    private String email3;

    private String phone1;
    private String phone2;
    private String phone3;


    //Administratif
    private Date birtdhDate;
    private String birthPlace;
    private String nationality;
    private String socialSecurity;
    private String familySituation;

    //Contractuelle;

    private String actualSalary;
    private String desiredSalary;

    //
    private String otherDocument;

    //Dt
    private String title;
    private String skills;
    private String yearExperience;
    private String education;

    //other
    @OneToOne
    @JoinColumn(name = "contractId")
    private Contract contract;

    @OneToMany(mappedBy = "candidat")
    private List<LanguageSkill> languageSkill;
    @OneToMany(mappedBy = "candidat")
    private List<ToolsExperiment> toolsexperiments;
    @OneToMany(mappedBy = "candidat")
    private List<ApplicationDomain> applicationDomains;
    @OneToMany(mappedBy = "candidat")
    private List<FieldIntevention> fieldInteventions;
    @OneToOne
    @JoinColumn(name = "mobilityId")
    private Mobility mobility;
    @OneToOne
    @JoinColumn(name = "availability")
    private Availability availability;

    @OneToMany(mappedBy = "candidat")
    private List<Evaluation> evaluations;
    @OneToOne
    @JoinColumn(name = "managerId")
    private Manager manager;
    @OneToOne
    @JoinColumn(name = "hrEntityId")
    private HrEntity hrEntity;
    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;
///getter and setter


    public String getCandidatId() {
        return candidatId;
    }

    public void setCandidatId(String candidatId) {
        this.candidatId = candidatId;
    }

    public Date getCreDate() {
        return creDate;
    }

    public void setCreDate(Date creDate) {
        this.creDate = creDate;
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUrlCv() {
        return urlCv;
    }

    public void setUrlCv(String urlCv) {
        this.urlCv = urlCv;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public Mobility getMobility() {
        return mobility;
    }

    public void setMobility(Mobility mobility) {
        this.mobility = mobility;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public HrEntity getHrEntity() {
        return hrEntity;
    }

    public void setHrEntity(HrEntity hrEntity) {
        this.hrEntity = hrEntity;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirtdhDate() {
        return birtdhDate;
    }

    public void setBirtdhDate(Date birtdhDate) {
        this.birtdhDate = birtdhDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getFamilySituation() {
        return familySituation;
    }

    public void setFamilySituation(String familySituation) {
        this.familySituation = familySituation;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getActualSalary() {
        return actualSalary;
    }

    public void setActualSalary(String actualSalary) {
        this.actualSalary = actualSalary;
    }

    public String getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(String desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public String getOtherDocument() {
        return otherDocument;
    }

    public void setOtherDocument(String otherDocument) {
        this.otherDocument = otherDocument;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(String yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public List<LanguageSkill> getLanguageSkill() {
        return languageSkill;
    }

    public void setLanguageSkill(List<LanguageSkill> languageSkill) {
        this.languageSkill = languageSkill;
    }

    public List<ToolsExperiment> getToolsexperiments() {
        return toolsexperiments;
    }

    public void setToolsexperiments(List<ToolsExperiment> toolsexperiments) {
        this.toolsexperiments = toolsexperiments;
    }

    public List<ApplicationDomain> getApplicationDomains() {
        return applicationDomains;
    }

    public void setApplicationDomains(List<ApplicationDomain> applicationDomains) {
        this.applicationDomains = applicationDomains;
    }

    public List<FieldIntevention> getFieldInteventions() {
        return fieldInteventions;
    }

    public void setFieldInteventions(List<FieldIntevention> fieldInteventions) {
        this.fieldInteventions = fieldInteventions;
    }
}
