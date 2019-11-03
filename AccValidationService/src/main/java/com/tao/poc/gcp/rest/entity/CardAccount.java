package com.tao.poc.gcp.rest.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(	name = "CARDACCOUNT")
public class CardAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accNo;
    
    @Column(name = "ACCNT_NBR", nullable = false)
    private Long accountNumber;

    @Column(name = "EXPIRY_DATE", nullable = false)
    private Date noOfChecks;

    @Column(name = "NAME", nullable = false)
    private String name;
}
