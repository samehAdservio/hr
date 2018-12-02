package com.adservio.hr.Core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Evaluation {
    @Id
    @GeneratedValue
    private Long evaluationId;
    private Date date;
    private String comment;
    private String commentedBy;
    @ManyToOne
    @JoinColumn(name = "candidatId")
    private Candidat candidat;

}
