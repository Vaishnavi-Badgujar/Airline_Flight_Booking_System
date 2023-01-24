package com.AirlineFlight.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Executive {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Executive_id")
	private int id;
	
	@Column (name = "executive_name")
	 private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	

}
