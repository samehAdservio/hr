package com.adservio.hr.Core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ToolsExperiment {
    @Id
    @GeneratedValue
    private Long toolExperimentId;
    private String tools;
    private String level;
    @ManyToOne
    @JoinColumn(name = "candidatId")
    private Candidat candidat;
}
