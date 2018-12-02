package com.adservio.hr.Core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FieldIntevention {
    @Id
    @GeneratedValue
    private Long fieldInteventionId;
    private String field;
    @ManyToOne
    @JoinColumn(name = "candidatId")
    private Candidat candidat;
}
