package com.chhaichivon.crudspringhibernatevaadinpostgres.app.models;

import javax.persistence.*;

/**
 * Created by Kan-Chanproseth on 5/30/2017.
 */
@Entity
@Table(name = "role")
public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
	@Column(name = "role_name")
	private String roleName;

	public Roles(String roleName) {
		this.roleName = roleName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
