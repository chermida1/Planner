package com.Planner.PlannerApi.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Role {

	// public static final transient Role EMPLOYEE = new Role(1, "EMPLOYEE");

	// public static final transient Role MANAGER = new Role(2, "MANAGER");

	@Id
	@Column(name = "ROLE_ID")
	private Integer roleId;
	@Column(name = "ROLE_TYPE")
	private String roleType;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer roleId, String roleType) {
		super();
		this.roleId = roleId;
		this.roleType = roleType;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
