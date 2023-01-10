package com.entity;

public class UserEntity {

	private String name;
	private String contact;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public UserEntity(String name, String contact) {
		super();
		this.name = name;
		this.contact = contact;
	}
	public UserEntity() {
		super();
	}
	@Override
	public String toString() {
		return "UserEntity [name=" + name + ", contact=" + contact + "]";
	}
	
}
