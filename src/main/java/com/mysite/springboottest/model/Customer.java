package com.mysite.springboottest.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;


@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue
	private Long id;

    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    private String comment;
    private Date reviewDate;
    private Date createTime;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    List<Address> addresses=new ArrayList<Address>();
}
