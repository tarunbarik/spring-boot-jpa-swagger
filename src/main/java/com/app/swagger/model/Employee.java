package com.app.swagger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Tarun
 *
 */
@Entity
@Table(name = "emp_tbl")
@ApiModel(description = "All details about the Employee.")
public class Employee {

	@ApiModelProperty(notes = "The database generated Employee Id.")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ApiModelProperty(notes = "Employee First Name")
	@Column(name = "first_name", nullable = false)
	private String firstName;

	@ApiModelProperty(notes = "Employee Last Name")
	@Column(name = "last_name", nullable = false)
	private String lastName;

	@ApiModelProperty(notes = "Employee Email Id")
	@Column(name = "email_address", nullable = false)
	private String emailId;

	public Employee() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param emailId
	 */
	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}// class
