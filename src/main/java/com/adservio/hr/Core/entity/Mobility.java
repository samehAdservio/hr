package com.adservio.hr.Core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mobility {
    @Id
    @GeneratedValue
    private Long toolExperimentId;
    private String mobility;
}
