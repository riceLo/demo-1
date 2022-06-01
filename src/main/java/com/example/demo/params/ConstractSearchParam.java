package com.example.demo.params;

public class ConstractSearchParam {

	private String name;
	private String code;
	private int year;
	private byte client;
	private byte state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public byte getClient() {
		return client;
	}

	public void setClient(byte client) {
		this.client = client;
	}

	public byte getState() {
		return state;
	}

	public void setState(byte state) {
		this.state = state;
	}

	public ConstractSearchParam() {
	}

	public ConstractSearchParam(String name, String code, int year, byte client, byte state) {
		this.name = name;
		this.code = code;
		this.year = year;
		this.client = client;
		this.state = state;
	}
}
