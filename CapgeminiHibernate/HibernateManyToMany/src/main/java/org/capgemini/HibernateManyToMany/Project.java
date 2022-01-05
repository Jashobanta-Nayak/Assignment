package org.capgemini.HibernateManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="proj_table")
public class Project {
	@Id
	private int pId;
	@Column(name="Project_name")
	private String projectName;
	
	@ManyToMany(mappedBy="project")
	private List<emp> emp;
	// parameterized constructor
	public Project(int pId, String projectName, List<org.capgemini.HibernateManyToMany.emp> emp) {
		super();
		this.pId = pId;
		this.projectName = projectName;
		this.emp = emp;
	}
	// zero-parameterized constructor
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	// generated setter & getter methods
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<emp> getEmp() {
		return emp;
	}

	public void setEmp(List<emp> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", projectName=" + projectName + ", emp=" + emp + "]";
	}
	

}
