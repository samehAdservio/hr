package com.adservio.hr.Core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ApplicationDomain {
    @Id
    @GeneratedValue
    private Long applicationDomainId;
    private String domain;
    @ManyToOne
    @JoinColumn(name = "candidatId")
    private Candidat candidat;
}
