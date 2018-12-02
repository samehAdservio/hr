package com.adservio.hr.Core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Availability {
    @Id
    @GeneratedValue
    private Long availabilityId;
    private String availability;
    private boolean withDate;
    private Date date;
}
