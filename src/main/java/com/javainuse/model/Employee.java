package com.javainuse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")

public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	@Column(name = "name")

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	@Column(name = "dept")

	private String dept;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

}
