package com.wipro.apps;

public class Project {

	private int id;
	private String name;
	private String typeOfProject;
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
	public String getTypeOfProject() {
		return typeOfProject;
	}
	public void setTypeOfProject(String typeOfProject) {
		this.typeOfProject = typeOfProject;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", typeOfProject=" + typeOfProject + "]";
	}
	
	
	
	
}
