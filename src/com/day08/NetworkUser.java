package com.day08;

public class NetworkUser {
	String id;
	String password;
	String address;

	public NetworkUser(String id, String password) {
		this.id = id;
		this.password = password;
		this.address = id + "@gameschool.com";
	}

	public NetworkUser(String id, String password, String address) {
		this.id = id;
		this.password = password;
		this.address = address;
	}

}
