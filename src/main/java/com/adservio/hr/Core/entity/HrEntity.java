package com.adservio.hr.Core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HrEntity {
    @Id
    @GeneratedValue
    private Long hrEntityId;
    private String name;
}
