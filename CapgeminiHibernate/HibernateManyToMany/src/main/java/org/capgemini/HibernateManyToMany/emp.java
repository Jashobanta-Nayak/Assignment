package org.capgemini.HibernateManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")
public class emp {
	@Id
	private int eid;
	private String name;

	// whenever there is something many only focus on List
	@ManyToMany
	@JoinTable
	(name="emp_learn",
	joinColumns= {@JoinColumn(name="eid")},
	inverseJoinColumns= {@JoinColumn(name="pid")})
	private List<Project> project;
	// parameterized constructor
	public emp(int eid, String name, List<Project> project) {
		super();
		this.eid = eid;
		this.name = name;
		this.project = project;
	}
	// zero-parameterized constructor
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	// generated setter & getter methods
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "emp [eid=" + eid + ", name=" + name + ", project=" + project + "]";
	}




}
