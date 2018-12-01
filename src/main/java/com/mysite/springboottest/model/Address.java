package com.mysite.springboottest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity
public class Address {
	@Id
	@GeneratedValue
  private Integer id;
  private String name;
  private Date effectiveDate;
  private Date endDate;
  @JsonIgnore
  @ManyToOne
  private Customer customer;

}
