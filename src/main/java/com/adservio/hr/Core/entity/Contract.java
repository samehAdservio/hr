package com.adservio.hr.Core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contract {
    @Id
    @GeneratedValue
    private Long contractId;
    private String name;
}
