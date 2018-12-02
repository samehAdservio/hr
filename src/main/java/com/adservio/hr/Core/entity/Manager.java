package com.adservio.hr.Core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Manager {
    @Id
    @GeneratedValue
    private Long managerId;
    private String name;
}
